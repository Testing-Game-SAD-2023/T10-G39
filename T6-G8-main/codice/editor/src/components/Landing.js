import React, { useEffect, useState } from "react";
import { classnames } from "../utils/general";
import { languageOptions } from "../constants/languageOptions";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { defineTheme } from "../lib/defineTheme";
import useKeyPress from "../hooks/useKeyPress";
import '../index.css'
import { Range } from 'monaco-editor';

// Import dei componenti richiamati all'interno del Landing
import CodeEditorWindow from "./CodeEditorWindow";
import ClassWindow from "./ClassWindow";
import OutputWindow from "./OutputWindow";
import ThemeDropdown from "./ThemeDropdown";

// Definizione di alcune costanti utili
// const urlCoverageController = "http://localhost:8080/editor/getCoverage";
// const urlClassController = "http://localhost:8080/editor/getCodiceClasse";
// const urlTestsController = "http://localhost:8080/editor/saveTest";
// const urlCodeController = "http://localhost:8080/editor/updateCode";
const DOMAIN_NAME = "localhost";
const urlCoverageController = `http://${DOMAIN_NAME}/api/editor/getCoverage`;
const urlClassController = `http://${DOMAIN_NAME}/api/editor/getCodiceClasse`;
const urlTestsController = `http://${DOMAIN_NAME}/api/editor/saveTest`;
const urlCodeController = `http://${DOMAIN_NAME}/api/editor/updateCode`;
const fileNameDefault = "AppTest.java";

// Definizione del template da mostrare all'avvio dell'editor
const template = `import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
  @Test
  public void testAlgebra(){
    Calcolatrice cut = new Calcolatrice();

    assertEquals(2,cut.add(1,1));

    assertEquals(2,cut.subtract(3,1));
    
    assertEquals(2,cut.multiply(2,1));

    assertEquals(2.0,cut.divide(4,2), 0.001);
    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.divide(2,0);});
    assertTrue(thrown.getMessage().contains("Division by zero"));
  }

  @Test
  public void testFactorial() {
    Calcolatrice cut = new Calcolatrice();

    assertEquals(6,cut.factorial(3));
    assertEquals(1,cut.factorial(1));
    assertEquals(1,cut.factorial(0));

    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.factorial(-1);});
    assertTrue(thrown.getMessage().contains("Factorial is not defined"));
  }
}
`;


const Landing = () => {
  const [code, setCode] = useState(template);
  const [classCode, setClassCode] = useState('');
  const [customInput, setCustomInput] = useState("");
  const [outputDetails, setOutputDetails] = useState(null);
  const [classTest, setClassTest] = useState(null);
  const [processing, setProcessing] = useState(null);
  const [processing_saveAs, setProcessingSaveAs] = useState(null);
  const [processing_save, setProcessingSave] = useState(null);
  const [theme, setTheme] = useState("cobalt");
  const [language, setLanguage] = useState(languageOptions[0]);
  const [coverageDisplay, setCoverageDisplay] = useState(false);
  const [url, setUrl] = useState('');

  const enterPress = useKeyPress("Enter");
  const ctrlPress = useKeyPress("Control");

  const [vars, setVars] = useState({});
  const [decorations, setDecorations] = useState([]);
  const { monacoEditor, monaco } = vars;

  const [varsE, setVarsE] = useState({});
  const { monacoEditorE, monacoE } = varsE;

  const [htmlContent, setHtmlContent] = useState('');
  const [parsedXml, setParsedXml] = useState('');

  const [outputString, setOutputString] = useState('Compila per avere un output.');
  // const [errorCompile, setErrorCompile] = useState(false);

  async function handleEditorDidMount(monacoEditor, monaco) {
    setVars({ monacoEditor, monaco });
  }

  async function handleEditorDidMountE(monacoEditorE, monacoE) {
    setVarsE({ monacoEditorE, monacoE }); 
  }

  useEffect(() => {
    if (!monacoEditorE || !monacoE) {
        return;
    }

    fetch(urlClassController)
    .then(response => {
    if (response.ok) {
        return response.text();
    } else {
        throw new Error('Errore nella richiesta GET al server.');
    }
    })
    .then(data => {
    console.log('classe caricata correttamente');
    console.log(data);
    setClassCode(data);
    })
    .catch(error => {
    console.error('Errore:', error);
    });

  }, [monacoEditorE, monacoE]);

  useEffect(() => {
    if (!monacoEditor || !monaco) {
        return;
    } 

    const ids = monacoEditor.deltaDecorations([],decorations);

    return () => monacoEditor.deltaDecorations(ids, []);
  }, [monacoEditor, monaco, decorations]);

  useEffect(() => {
    if (enterPress && ctrlPress) {
      console.log("enterPress", enterPress);
      console.log("ctrlPress", ctrlPress);
      handleCompile();
      
    }
  }, [ctrlPress, enterPress]);

  const onChange = (action, data) => {
    setCode(data);
    console.log(code);
    console.log("action = ", action)
    console.log("data = ", data)

    //Invia il codice aggiornato al controller
    const msg={
      msg:data
    }

    fetch(urlCodeController, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            },
        body: JSON.stringify(msg),
    }).then(response => {
        console.log(response);
    })
    .catch(error => {
        console.error("Errore durante l'aggiornamento del codice", error);
    });
  };

  const handleSave = () => {
    setProcessingSave(true);
    const fileName = window.prompt('Inserisci il nome del file', fileNameDefault);
    if (fileName){
      // Invia il codice al controller
      const msg={
          msg:fileName,
      }
  
      fetch(urlTestsController, {
          method: 'POST',
          headers: {
              'Content-Type': 'application/json',
              },
          body: JSON.stringify(msg),
      }).then(response => {
          console.log(response);
          if (response.ok) {
              console.log('File inviato correttamente al server.');
              window.alert('File salvato con successo in remoto');
          } else {
              console.error('Errore durante l\'invio del file al server.');
              window.alert('Errore durante il salvataggio del test');
          }
      })
      .catch(error => {
          console.error('Errore durante l\'invio della richiesta al server:', error);
          window.alert('Errore durante il salvataggio del test');
      });
    }
    setProcessingSave(false);
  };

  const handleSaveAs = () => {
    setProcessingSaveAs(true);
    const fileName = window.prompt('Inserisci il nome del file', 'test.java');
    if (fileName) {
        const blob = new Blob([code], { type: 'text/plain' });
        const url = URL.createObjectURL(blob);
        const link = document.createElement('a');
        link.href = url;
        link.download = fileName;
        link.click();

        // Rilascia l'URL creato dopo il download
        URL.revokeObjectURL(url);

    }
    setProcessingSaveAs(false);
  };


  var userCoverage = 0;

  const handleCompile = () => {
    setProcessing(true);
    
    const notificationId = toast.success("Compilazione in corso...", {
      position: "bottom-left",
      autoClose: false, // Imposta autoClose su false per impedire la chiusura automatica
    });
  

    // Invia il codice al controller
    const msg={
        msg:fileNameDefault,
    }

    fetch(urlCoverageController, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            },
        body: JSON.stringify(msg),
    }).then(response => response.json())
    .then(data => {
      // setErrorCompile(data.error);
      setOutputString(data.outCompile);
      
      // console.log(errorCompile);

      if(!data.error && data.robotCoverage){

        var robotCoverage = {"line": 0};


        if (data.coverageMethod == "EvoSuite") {
          robotCoverage = parseEvoSuiteCoverage(data.robotCoverage);
          var userCoverage = parseEvoSuiteCoverage(data.coverageCSV);

          var parser = new DOMParser();
          var xmlDoc = parser.parseFromString(data.coverageXML, 'text/xml');
          console.log(xmlDoc);
          parseJacocoCoverage(xmlDoc);
          // parseXMLCoverage(xmlDoc);
          

          setOutputString(`User coverage: \nLine: ${userCoverage.line}%\nWeakmutation: ${userCoverage.weakmutation}%\nCbranch: ${userCoverage.cbranch}%\n\n` + `Robot coverage: \nLine: ${robotCoverage.line}%\nWeakmutation: ${robotCoverage.weakmutation}%\nCbranch: ${robotCoverage.cbranch}%\n\n\n` + data.outCompile);
          //Per mostrare in output window tutto il csv decommentare questa stringa:
          //setOutputString("User coverage : " + userCoverage + "%\nRobot Coverage : " + data.robotCoverage + "%\n" + data.coverage + "\n\n" + data.outCompile);
          setCoverageDisplay(true);
        } 
        else {
          var parser = new DOMParser();
          var userXmlDoc = parser.parseFromString(data.coverageXML, 'text/xml');
          var robotXmlDoc = parser.parseFromString(data.robotCoverage, 'text/xml');
          console.log(xmlDoc);
          userCoverage = parseJacocoCoverage(userXmlDoc);
          robotCoverage = parseEmmaCoverage(robotXmlDoc);
          setOutputString(`User coverage: \nLine: ${userCoverage.line}%\nMethod: ${userCoverage.method}%\nClass: ${userCoverage.class}%\n\n` + `Robot coverage: \nLine: ${robotCoverage.line}%\nMethod: ${robotCoverage.method}%\nClass: ${robotCoverage.class}%\n\n\n` + data.outCompile);
          setCoverageDisplay(true);
        }
        // pop-up per mostrare il vincitore
        

        if(robotCoverage.line > userCoverage.line){
          alert("HAI PERSO!\nUser coverage: " + userCoverage.line + "%\nRobot Coverage: "+ robotCoverage.line + "%");
        }
        else if(robotCoverage.line < userCoverage.line){
          alert("HAI VINTO!\nUser coverage: " + userCoverage.line + "%\nRobot Coverage: "+ robotCoverage.line + "%");
        }
        else{
          alert("PAREGGIO!\nUser coverage: " + userCoverage.line + "%\nRobot Coverage: "+ robotCoverage.line + "%");
        }

        // Puoi accedere al documento XML tramite xmlDoc e lavorare con i suoi elementi e attributi
      } 
      else {
        if(data.error){
          alert("Errore nel test dell'utente");
          // setOutputString("ERROR");
          var decs = [];
          setDecorations(decs);
          setCoverageDisplay(true);
        }
        if(!data.robotCoverage){
          alert("Errore robot");
          setOutputString("Errore Robot\n\n" + data.outCompile);
          var decs = [];
          setDecorations(decs);
          setCoverageDisplay(true);
        }
      }

      setProcessing(false);
      toast.dismiss(notificationId);
    })
    .catch(error => {
        console.error('Errore durante l\'invio della richiesta al server:', error);
        setProcessing(false);
        toast.dismiss(notificationId);
    });

    //setProcessing(false);

    function parseEmmaCoverage(xmlDoc) {
      // Find the class elements (excluding those ending with "$Entry")
      const classElements = Array.from(xmlDoc.getElementsByTagName('class')).filter((element) => {
          const className = element.getAttribute('name');
          console.log(className);
          return !className.includes('$Entry');
      });

      console.log(classElements);
  
      // Extract and format the coverage values
      const coverageData = classElements.map((classElement) => {
          const coverage = {
              class: parseInt(classElement.getElementsByTagName('coverage')[0].getAttribute('value').match(/\d+/)[0]),
              method: parseInt(classElement.getElementsByTagName('coverage')[1].getAttribute('value').match(/\d+/)[0]),
              block: parseInt(classElement.getElementsByTagName('coverage')[2].getAttribute('value').match(/\d+/)[0]),
              line: parseInt(classElement.getElementsByTagName('coverage')[3].getAttribute('value').match(/\d+/)[0]),
          };
  
          return coverage;
      });
  
      return coverageData[0];
    }
  

    // Funzione per analizzare il file XML di copertura Jacoco
    function parseJacocoCoverage(xml) {
      var coverageData = [];

      //variabili per linee coperte dal test
      var totalLines = 0;
      var coveredLines = 0;

      // Esempio di iterazione su tutti gli elementi "<sourcefile>"
      var classElements = xml.getElementsByTagName("sourcefile");
      console.log(classElements);
      for (var i = 0; i < classElements.length; i++) {
        var classElement = classElements[i];
        var className = classElement.getAttribute('name');

        // Esempio di estrazione delle informazioni delle linee di codice
        var lines = classElement.getElementsByTagName('line');
        //var lineInfo = {};
        var decs = [];
        for (var j = 0; j < lines.length; j++) {
          var line = lines[j];
          var lineNumber = parseInt(line.getAttribute('nr'));
          var instructionNotCovered = line.getAttribute('mi') != '0';
          var branchNotCovered = line.getAttribute('mb') != '0';

          //istruzioni per calcolare linee di codice coperte dalla nostra classe di test
          totalLines++;       // Aggiorna il conteggio delle linee coperte se necessario      
          if (!instructionNotCovered && !branchNotCovered) {         
            coveredLines++;       
          }

          const range = new Range(lineNumber-1, 1, lineNumber+1-1, 1);
          if (instructionNotCovered){
            decs.push({
              range: range,
              options: { inlineClassName: "instruction.not.covered" }
            });
          }
          else if (branchNotCovered){
            decs.push({
              range: range,
              options: { inlineClassName: "branch.not.covered" }
            });
          }
          else {
            decs.push({
              range: range,
              options: { inlineClassName: "line.covered" }
            });
          }
          
        }

        // userCoverage = parseInt((coveredLines/totalLines)*100);
        var temp_coverage = {};
        temp_coverage.line = parseInt((coveredLines/totalLines)*100);

        var counters = classElement.getElementsByTagName('counter');
        for (var i = 0; i < counters.length; i++) {
          var counter = counters[i];
          if (counter.getAttribute('type') == "BRANCH") {
            var missed = parseInt(counter.getAttribute('missed'));
            var covered = parseInt(counter.getAttribute('covered'));
            var total = missed+covered;
            temp_coverage.branch = parseInt((covered/total)*100);
            
          }
          if (counter.getAttribute('type') == "METHOD") {
            var missed = parseInt(counter.getAttribute('missed'));
            var covered = parseInt(counter.getAttribute('covered'));
            var total = missed+covered;
            temp_coverage.method = parseInt((covered/total)*100);
          }
          if (counter.getAttribute('type') == "CLASS") {
            var missed = parseInt(counter.getAttribute('missed'));
            var covered = parseInt(counter.getAttribute('covered'));
            var total = missed+covered;
            temp_coverage.class = parseInt((covered/total)*100);
          }
        }


        setDecorations(decs);

        return temp_coverage;
      }
    };


    function parseEvoSuiteCoverage(inputString) {
      // Dividi la stringa in righe
      const lines = inputString.split('\n');
    
      var results = {};
      // Itera attraverso le righe per trovare il valore di copertura LINE
      for (let i = 0; i < lines.length; i++) {
        const line = lines[i].trim();
        if (line) {
          // Divide la riga in campi utilizzando la virgola come separatore
          const fields = line.split(',');
    
          // Verifica se il criterion è LINE
          if (fields[1] === 'LINE') {
            // Restituisci il valore di copertura LINE
            // return parseInt(fields[2]*100);
            results.line = parseInt(fields[2]*100);
          } else if (fields[1] === 'WEAKMUTATION') {
            results.weakmutation = parseInt(fields[2]*100);
          } else if (fields[1] === 'CBRANCH') {
            results.cbranch = parseInt(fields[2]*100);
          }
        }
      }
    
      return results;
      // Restituisci un valore predefinito se non trovi la riga corrispondente a LINE
    };

  // Funzione per ottenere l'output dal file XML di copertura Jacoco
  };

  function handleThemeChange(th) {
    const theme = th;
    console.log("theme...", theme);

    if (["light", "vs-dark"].includes(theme.value)) {
      setTheme(theme);
    } else {
      defineTheme(theme.value).then((_) => setTheme(theme));
    }
  }
  useEffect(() => {
    defineTheme("oceanic-next").then((_) =>
      setTheme({ value: "oceanic-next", label: "Oceanic Next" })
    );
  }, []);


  return (
    <>
      <ToastContainer
        position="top-right"
        autoClose={2000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
      />


      <div className="h-4 w-full bg-gradient-to-r from-pink-500 via-red-500 to-yellow-500"></div>
      <div className="flex flex-row space-x-4 items-start px-4 py-4">
        <button 
          onClick={handleSave}
          disabled={!code}
          className={classnames(
            "mt-4 border-2 border-black z-10 rounded-md shadow-[5px_5px_0px_0px_rgba(0,0,0)] px-4 py-2.5 hover:shadow transition duration-200 bg-white flex-shrink-0",
            !code ? "opacity-100" : ""
          )}
        >
          {processing_save? "Saving..." : "Save Test"}
        </button>
        <button 
          onClick={handleSaveAs}
          disabled={!code}
          className={classnames(
            "mt-4 border-2 border-black z-10 rounded-md shadow-[5px_5px_0px_0px_rgba(0,0,0)] px-4 py-2.5 hover:shadow transition duration-200 bg-white flex-shrink-0",
            !code ? "opacity-100" : ""
          )}
        >
          {processing_saveAs? "Downloading..." : "Download Test"}
        </button>
        <div className="flex flex-row space-x-4 items-start px-0 py-4">
          <ThemeDropdown handleThemeChange={handleThemeChange} theme={theme} />
        </div>
        <button
          onClick={handleCompile}
          disabled={!code}
          className={classnames(
            "mt-4 border-2 border-black z-10 rounded-md shadow-[5px_5px_0px_0px_rgba(0,0,0)] px-4 py-2.5 hover:shadow transition duration-200 bg-primary flex-shrink-0",
            !code ? "opacity-50" : ""
          )}
          style={{ background: 'lightgreen' }}
        >
          {processing? "Processing..." : "Play"}
        </button>
      </div>
      <div className="flex flex-row space-x-4 items-start px-4 py-0">
        <div className="flex flex-col w-full h-full justify-start items-end">
          <CodeEditorWindow
            code={code}
            onChange={onChange}
            language={language?.value}
            theme={theme.value}
          />
        </div>

        <div className="right-container flex flex-shrink-0 w-[40%] flex-col">
          <h1 className="font-bold text-xl bg-clip-text text-transparent bg-gradient-to-r from-slate-900 to-slate-700 mb-2">
            Class Under Test
          </h1>
          <div className="flex flex-col w-full h-full justify-start items-end">
            <ClassWindow
              code={classCode}
              coverageDisplay={coverageDisplay}
              language={language?.value}
              theme={theme.value}
              url={url}
              editorDidMount={handleEditorDidMount}
              editorDidMountE={handleEditorDidMountE}
            />
          </div>
          <div id = "prova" className = "overlay rounded-md overflow-hidden w-full h-full shadow-4xl">
          </div>
          <OutputWindow outputString={outputString} coverageDisplay={coverageDisplay} />
          <div className="flex flex-col items-end">
          </div>
        </div>
      </div>
    </>
  );

};
export default Landing;

/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 23:10:49 GMT 2023
 */

package OutputFormatSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import OutputFormatSourceCode.OutputFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutputFormat_ESTest extends OutputFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[9];
      stringArray0[2] = "-xhtml2h";
      stringArray0[3] = "-xhtml2h";
      stringArray0[4] = "-xhtml2h";
      stringArray0[5] = "-xhtml2h";
      stringArray0[6] = "-xhtml2h";
      stringArray0[7] = "-xhtml2h";
      stringArray0[8] = "-xhtml2h";
      int int0 = outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter(' ');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ( )
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "w9gJ3xyCt?";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.setXHTML(true);
      boolean boolean0 = outputFormat0.isXHTML();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      outputFormat0.setSuppressDeclaration(true);
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isPadText();
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isOmitEncoding());
      
      outputFormat0.setOmitEncoding(true);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat0.setExpandEmptyElements(true);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      
      outputFormat0.setNewLineAfterNTags(1);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("74{p", true);
      outputFormat0.setNewLineAfterNTags((-1));
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("M(XMn$YodSl.^", true);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.getLineSeparator();
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertEquals("M(XMn$YodSl.^", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String string0 = outputFormat0.getIndent();
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true, (String) null);
      outputFormat0.setIndentSize((-835));
      outputFormat0.getIndent();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals("", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true, (String) null);
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertNull(string0);
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertTrue(outputFormat0.isNewlines());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      
      outputFormat0.setEncoding("");
      outputFormat0.getEncoding();
      assertEquals("", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      // Undeclared exception!
      outputFormat0.setIndentSize(2147483645);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Es+N%3;K}oRUo,U", false);
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-869));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -869
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent(false);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("");
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("M(XMn$YodSl.^", true);
      assertFalse(outputFormat0.isPadText());
      
      outputFormat0.setPadText(true);
      assertTrue(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("lS1V|#lJ7LCjM 5Iqcv ", true, "lS1V|#lJ7LCjM 5Iqcv ");
      outputFormat0.setNewlines(true);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", outputFormat0.getIndent());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertTrue(outputFormat0.isTrimText());
      
      outputFormat0.setTrimText(false);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText");
      String[] stringArray0 = new String[4];
      stringArray0[1] = "-trimText";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[10];
      stringArray0[1] = "-xhtml,(x3";
      stringArray0[2] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines", true, "-newlines");
      String[] stringArray0 = new String[24];
      stringArray0[0] = "-newlines";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[18];
      stringArray0[0] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[8];
      stringArray0[1] = "-xhtml,(x3";
      stringArray0[2] = "-xhtml,(x3";
      stringArray0[3] = "-expandEmptyZnewlines";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "-indentSize";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("T!<cPaM*n@4|w", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-indent";
      stringArray0[3] = "-omitEncoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-suppressDeclaration";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[10];
      int int0 = outputFormat0.parseOptions(stringArray0, 369);
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(369, int0);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Zzkq;;O|/i%m");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('u');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (u)
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isPadText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("T!<cPaM*n@4|w", true);
      outputFormat0.setIndent(true);
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setIndent("Oh~2@D;LP`D0 /\"");
      assertEquals("Oh~2@D;LP`D0 /\"", outputFormat0.getIndent());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent((String) null);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding((String) null);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isPadText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals(0, int0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = outputFormat0.isTrimText();
      assertFalse(boolean0);
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = outputFormat0.isPadText();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("lS1V|#lJ7LCjM 5Iqcv ", true, "lS1V|#lJ7LCjM 5Iqcv ");
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(boolean0);
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isXHTML();
      assertTrue(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(boolean0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", string0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Es+N%3;K}oRUo,U", false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-padText";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("!V");
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("!V", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("lS1V|#lJ7LCjM 5Iqcv ", true, "lS1V|#lJ7LCjM 5Iqcv ");
      String string0 = outputFormat0.getIndent();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", string0);
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("lS1V|#lJ7LCjM 5Iqcv ", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', char0);
  }
}

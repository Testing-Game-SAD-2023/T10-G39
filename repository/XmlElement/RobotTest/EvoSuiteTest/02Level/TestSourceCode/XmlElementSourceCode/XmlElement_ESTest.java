/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 03:02:34 GMT 2023
 */

package XmlElementSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import XmlElementSourceCode.XmlElement;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlElement_ESTest extends XmlElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.insertElement(xmlElement0, 0);
      assertEquals(1, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("BO%x+ #77``&gp", (Hashtable<String, String>) null);
      xmlElement0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      XmlElement xmlElement1 = new XmlElement();
      assertTrue(xmlElement1.equals((Object)xmlElement0));
      
      xmlElement1.addSubElement(xmlElement0);
      boolean boolean0 = xmlElement0.equals(xmlElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      Hashtable<String, String> hashtable0 = xmlElement0.getAttributes();
      XmlElement xmlElement1 = new XmlElement(" = '", hashtable0);
      boolean boolean0 = xmlElement0.equals(xmlElement1);
      assertFalse(boolean0);
      assertFalse(xmlElement1.equals((Object)xmlElement0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("bQK>`>_NGS*c", "bQK>`>_NGS*c");
      XmlElement xmlElement1 = new XmlElement("bQK>`>_NGS*c");
      boolean boolean0 = xmlElement1.equals(xmlElement0);
      assertFalse(xmlElement0.equals((Object)xmlElement1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      hashtable0.put("hrJes|jT", "P1gua~hsHjw=f4d/XP!");
      XmlElement xmlElement0 = new XmlElement("b%I EF5Ef{j", hashtable0);
      XmlElement xmlElement1 = new XmlElement("");
      boolean boolean0 = xmlElement0.equals(xmlElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("^`:Lf");
      boolean boolean0 = xmlElement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("", "");
      boolean boolean0 = xmlElement0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("b%I EF5Ef{j", hashtable0);
      boolean boolean0 = xmlElement0.equals(xmlElement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("    ");
      xmlElement0.addSubElement("    ", "    ");
      xmlElement0.clone();
      assertEquals(1, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("E+L#rX@@tyVyFT2u*");
      Hashtable<String, String> hashtable0 = xmlElement0.getAttributes();
      XmlElement xmlElement1 = new XmlElement("E+L#rX@@tyVyFT2u*", hashtable0);
      xmlElement1.subElements = null;
      Object object0 = xmlElement1.clone();
      assertNotNull(object0);
      assertNotSame(object0, xmlElement1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("BO%x+ #77``&gp", (Hashtable<String, String>) null);
      Object object0 = xmlElement0.clone();
      assertNotSame(object0, xmlElement0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("    ");
      XmlElement xmlElement1 = xmlElement0.addSubElement("wxtL-e9stR)", "    ");
      assertEquals("wxtL-e9stR)", xmlElement1.getName());
      assertEquals("    ", xmlElement1.getData());
      
      XmlElement.printNode(xmlElement0, "Could not clone XmlElement: ");
      assertEquals("", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("", hashtable0);
      hashtable0.put("s^`Tc-H~()^.1", "");
      XmlElement.printNode(xmlElement0, "s^`Tc-H~()^.1");
      assertEquals(0, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.addSubElement("Bdbvl.B7.u8");
      assertEquals(1, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      LinkedList<XmlElement> linkedList0 = new LinkedList<XmlElement>();
      xmlElement0.subElements = (List<XmlElement>) linkedList0;
      linkedList0.add(xmlElement0);
      xmlElement0.name = "";
      XmlElement xmlElement1 = xmlElement0.getElement("");
      assertSame(xmlElement1, xmlElement0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("", "");
      xmlElement0.append(xmlElement0);
      XmlElement xmlElement1 = xmlElement0.getElement("aa{0");
      assertNull(xmlElement1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement((String) null, "NL8<{iWnpUe+0_\"Ld");
      XmlElement xmlElement1 = xmlElement0.getElement("mr>hq3!y.9'UUi G;");
      assertNull(xmlElement1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("E+L#rX@@tyVyFT2u*");
      xmlElement0.removeFromParent();
      assertEquals("", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("O9U6s01x@F+]-*w%cd", "");
      xmlElement0.parent = xmlElement0;
      xmlElement0.parent.removeFromParent();
      assertEquals("", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.addElement(xmlElement0);
      xmlElement0.removeElement(xmlElement0);
      assertEquals(0, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(" = '", " = '");
      xmlElement0.addSubElement(" = '", "");
      xmlElement0.removeElement(xmlElement0);
      assertEquals(1, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.addAttribute("", "");
      String string0 = xmlElement0.getAttribute("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("    ");
      String string0 = xmlElement0.getAttribute("?tH<.]", "?tH<.]");
      assertEquals("?tH<.]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      Object object0 = xmlElement0.addAttribute((String) null, "XmlElementSourceCode.XmlElement");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("b%I EF5Ef{j", hashtable0);
      Object object0 = xmlElement0.addAttribute("", (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("", "L.]K#Jd42[");
      xmlElement0.getAttributeNames();
      assertEquals("L.]K#Jd42[", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("", hashtable0);
      String string0 = xmlElement0.getData();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("", "L.]K#Jd42[");
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      xmlElement0.setAttributes(hashtable0);
      assertEquals("L.]K#Jd42[", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("    ");
      int int0 = xmlElement0.count();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("    ");
      XmlElement xmlElement1 = xmlElement0.addSubElement("    ", "    ");
      assertNotNull(xmlElement1);
      
      XmlElement.printNode(xmlElement1, "Could not clone XmlElement: ");
      assertEquals("    ", xmlElement1.getName());
      assertEquals("    ", xmlElement1.getData());
      assertEquals("    ", xmlElement0.getName());
      assertEquals("", xmlElement0.getData());
      assertNotSame(xmlElement0, xmlElement1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("^`:Lf");
      XmlElement xmlElement1 = new XmlElement("^`:Lf", "^`:Lf");
      xmlElement1.parent = xmlElement0;
      xmlElement1.parent.notifyObservers();
      assertEquals("^`:Lf", xmlElement1.getData());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("b%I EF5Ef{j", hashtable0);
      xmlElement0.setParent(xmlElement0);
      assertEquals(0, xmlElement0.countObservers());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      String string0 = xmlElement0.getAttribute("    ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("b%I EF5Ef{j", hashtable0);
      String string0 = xmlElement0.getName();
      assertEquals("b%I EF5Ef{j", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      // Undeclared exception!
      try { 
        xmlElement0.getElement(2330);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2330
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      XmlElement xmlElement0 = new XmlElement("", hashtable0);
      // Undeclared exception!
      try { 
        xmlElement0.removeElement((-1913));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1913
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.setName((String) null);
      assertEquals(0, xmlElement0.count());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(" = '", " = '");
      List list0 = xmlElement0.getElements();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("");
      xmlElement0.setData("");
      assertEquals("", xmlElement0.getData());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(" = '", " = '");
      XmlElement xmlElement1 = xmlElement0.getParent();
      assertNull(xmlElement1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.removeAllElements();
      assertNull(xmlElement0.getData());
  }
}

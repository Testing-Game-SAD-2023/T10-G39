/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 01:29:00 GMT 2023
 */

package SubjectParserSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import SubjectParserSourceCode.SubjectParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectParser_ESTest extends SubjectParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SubjectParser.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("+");
      int int0 = subjectParser0.getUpperRange();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("+");
      String string0 = subjectParser0.getTitle();
      assertEquals("+", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("+");
      String string0 = subjectParser0.getRangeString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("+");
      long long0 = subjectParser0.getId();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("");
      int int0 = subjectParser0.getThisRange();
      assertEquals(1, int0);
  }
}
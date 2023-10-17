/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 00:12:43 GMT 2023
 */

package RationalNumberSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import RationalNumberSourceCode.RationalNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RationalNumber_ESTest extends RationalNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1));
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(Float.NaN);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(Double.POSITIVE_INFINITY, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483713L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(82595526, 82595526);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1077.2987));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-1,077.299", string0);
      assertEquals((-7371955), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3363, 3363);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-373.0518944109406));
      String string0 = rationalNumber0.toString();
      assertEquals("-2077526/5569 (-373.052)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-507L), 77L);
      String string0 = rationalNumber0.toString();
      assertEquals("507/-77 (-6.584)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483713L, (-1L));
      assertEquals(2.147483583E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, 2147483677L);
      assertEquals(357913941, rationalNumber0.numerator);
      assertEquals(0.9999999860301616, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836273550982E9));
      String string0 = rationalNumber0.toString();
      assertEquals((-2.147483627E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals("-2,147,483,627", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836273550982E9));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2147483627", string0);
      assertEquals((-2.147483627E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483657L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483657, divisor: 0
         //
         verifyException("RationalNumberSourceCode.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber0.toString();
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals("1/100000000 (0)", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals("0", string0);
      assertEquals(100000000, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4433.1097598984));
      rationalNumber0.negate();
      assertEquals((-4433.11F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483657L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(2.147483647E9, rationalNumber1.doubleValue(), 0.01);
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(968.28707);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-968.2871F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 2843);
      long long0 = rationalNumber0.longValue();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2843, rationalNumber0.divisor);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(392, 392);
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1485L));
      long long0 = rationalNumber0.longValue();
      assertEquals((-1485L), long0);
      assertEquals((-1485.0), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      int int0 = rationalNumber0.intValue();
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-21L), (-21L));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-4433.1097598984));
      int int0 = rationalNumber0.intValue();
      assertEquals((-4433), int0);
      assertEquals((-4433.109759900219), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.0E-8F, float0, 0.01F);
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483653L), (-2147483653L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483648L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483660L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(2147483636, rationalNumber0.divisor);
      assertEquals((-4.656612899098245E-10), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483648L);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
      assertEquals((-1), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 410);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(410, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3363, 3363);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), (-2147483660L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }
}
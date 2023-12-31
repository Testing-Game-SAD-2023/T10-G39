/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 21:03:29 GMT 2023
 */

package HSLColorSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import HSLColorSourceCode.HSLColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HSLColor_ESTest extends HSLColor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.blend(1, 1, 1, 0.0F);
      assertEquals(0, hSLColor0.getHue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.blend((-2037), (-2037), (-2037), 0.41389456F);
      assertEquals((-843), hSLColor0.getBlue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.initRGBbyHSL((-864), 1783, (-864));
      hSLColor0.brighten(1398.5F);
      assertEquals(1783, hSLColor0.getSaturation());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.brighten(0.0F);
      assertEquals(0, hSLColor0.getLuminence());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setLuminence(1585);
      assertEquals(255, hSLColor0.getLuminence());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setLuminence((-1));
      assertEquals(0, hSLColor0.getGreen());
      assertEquals(0, hSLColor0.getSaturation());
      assertEquals(0, hSLColor0.getHue());
      assertEquals(0, hSLColor0.getBlue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setSaturation(293);
      assertEquals(255, hSLColor0.getSaturation());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setSaturation((-183));
      assertEquals(0, hSLColor0.getHue());
      assertEquals(0, hSLColor0.getBlue());
      assertEquals(0, hSLColor0.getSaturation());
      assertEquals(0, hSLColor0.getGreen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setHue(1184);
      assertEquals(164, hSLColor0.getHue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setHue((-1153));
      assertEquals(122, hSLColor0.getHue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.initRGBbyHSL(218, (-544), (-544));
      hSLColor0.brighten((-682.4484F));
      assertEquals((-544), hSLColor0.getSaturation());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.setSaturation(41);
      assertEquals(41, hSLColor0.getSaturation());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.initHSLbyRGB(41, 41, 4365);
      assertEquals(41, hSLColor0.getRed());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.blend(2132, (-937), 1, 1);
      assertEquals(2132, hSLColor0.getRed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.initHSLbyRGB((-2191), (-1153), (-1153));
      assertEquals((-1153), hSLColor0.getGreen());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      hSLColor0.blend(85, 3940, 3940, 2950.03F);
      hSLColor0.reverseColor();
      assertEquals(254, hSLColor0.getHue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getRed();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getBlue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getGreen();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getHue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getLuminence();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HSLColor hSLColor0 = new HSLColor();
      int int0 = hSLColor0.getSaturation();
      assertEquals(0, int0);
  }
}

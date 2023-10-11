
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.toFormattedString();
    boolean b9 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------   10                         -1 null");
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getLink();
    fTPFile0.setLink("?---------   10                         -1 ?---------    0          hi!            10 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str5.equals("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str10.equals("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    boolean b5 = fTPFile0.hasPermission(2, 0);
    fTPFile0.setSize((long)0);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission(97, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setLink("hi!");
    int i11 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 100, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str9 = fTPFile0.toFormattedString("----------   35                         -1 ?---------    0                         97 null");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setName("hi!");
    int i5 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setGroup("d---------    0 ?---------   10                         -1 null                10 null");
    boolean b11 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    boolean b13 = fTPFile0.isFile();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0          ?---------  100                         -1 null       10 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   10                         -1 null"+ "'", str11.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    0 ?---------    0          hi!            10 null                -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str5.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getLink();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)0, 97, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    boolean b16 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(52, 0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getLink();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("d---------    3          ?---------   35                         97 null       10 null");
    fTPFile0.setName("?---------    0                         35 null");
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setGroup("");
    fTPFile0.setLink("");
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isUnknown();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    fTPFile0.setUser("?---------    0          ?---------  100                         -1 null       10 null");
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setPermission((int)(byte)0, (int)(byte)1, true);
    java.lang.String str15 = fTPFile0.getName();
    java.lang.String str17 = fTPFile0.toFormattedString("?---------  100                         -1 ?---------   10                         -1 ?---------   10                         -1 null");
    boolean b18 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?-w-------   10                         -1 null"+ "'", str17.equals("?-w-------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setRawListing("?---------   52          hi!            -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString("d---------  100          ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null       10 ----------   35                         -1 ?---------    0                         97 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0 ?---------    0          hi!            10 null ?---------    0                         -1 null       -1 null"+ "'", str13.equals("?---------    0 ?---------    0          hi!            10 null ?---------    0                         -1 null       -1 null"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------  100                         -1 null");
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    int i6 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------   10                         -1 null");
    fTPFile0.setRawListing("d---------    0          ?---------    0                         97 null       10 null");
    boolean b11 = fTPFile0.isSymbolicLink();
    java.lang.String str12 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    long long12 = fTPFile0.getSize();
    fTPFile0.setSize((long)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0          hi!            10 null"+ "'", str8.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isValid();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setSize((long)0);
    java.lang.String str10 = fTPFile0.toFormattedString();
    fTPFile0.setUser("d---------   10                         10 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(byte)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------  100                          0 null"+ "'", str10.equals("?---------  100                          0 null"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    long long6 = fTPFile0.getSize();
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.getName();
    java.lang.String str14 = fTPFile0.getGroup();
    int i15 = fTPFile0.getType();
    java.lang.String str16 = fTPFile0.toFormattedString();
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0          hi!            97 null"+ "'", str16.equals("?---------    0          hi!            97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.toFormattedString();
    java.lang.String str2 = fTPFile0.getLink();
    fTPFile0.setType((int)(byte)0);
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str6 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "?---------    0                         -1 null"+ "'", str1.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    long long6 = fTPFile0.getSize();
    boolean b7 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    java.lang.String str13 = fTPFile0.toFormattedString();
    fTPFile0.setName("");
    boolean b16 = fTPFile0.isDirectory();
    boolean b17 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("d---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str13.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setType((int)(byte)100);
    boolean b12 = fTPFile0.hasPermission(0, (int)(short)0);
    boolean b13 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fTPFile0.hasPermission(0, 97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize(0L);
    java.lang.String str12 = fTPFile0.getLink();
    java.lang.String str13 = fTPFile0.getRawListing();
    java.lang.String str14 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0                          0 null"+ "'", str14.equals("?---------    0                          0 null"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("?---------    0          d---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.getName();
    java.lang.String str14 = fTPFile0.getGroup();
    int i15 = fTPFile0.getType();
    int i16 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("d---------    0                         10 null");
    boolean b10 = fTPFile0.isFile();
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0          ?---------    0                         -1 ?---------    0                         -1 null       -1 "+ "'", str7.equals("?---------    0          ?---------    0                         -1 ?---------    0                         -1 null       -1 "));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setGroup("");
    fTPFile0.setLink("");
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setUser("?---------   10                         -1 ?---------   10                         -1 null");
    boolean b11 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    long long6 = fTPFile0.getSize();
    fTPFile0.setSize((long)100);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    0 ?---------    0          hi!            10 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    java.lang.String str9 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   10                         -1 null"+ "'", str8.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fTPFile0.hasPermission(10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setType((int)(byte)10);
    fTPFile0.setGroup("?---------    0                        100 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------   10                         -1 null");
    long long3 = fTPFile0.getSize();
    boolean b4 = fTPFile0.isUnknown();
    int i5 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getRawListing();
    boolean b7 = fTPFile0.isDirectory();
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setPermission((int)(byte)0, (int)(byte)1, true);
    long long15 = fTPFile0.getSize();
    java.lang.String str16 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    fTPFile0.setUser("hi!");
    boolean b5 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fTPFile0.hasPermission(1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getLink();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.hasPermission(0, 0);
    int i12 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    int i5 = fTPFile0.getType();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str15 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0          hi!            97 null"+ "'", str15.equals("?---------    0          hi!            97 null"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str6 = fTPFile0.toFormattedString("d---------    0 ?---------   10                         -1 null                10 null");
    fTPFile0.setName("d---------    0                         10 null");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------   10          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------  100                         -1 null"+ "'", str6.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize(0L);
    int i12 = fTPFile0.getHardLinkCount();
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    fTPFile0.setSize((long)0);
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0 ?---------    0 ?---------    0          hi!            10 null                -1 d---------    0                         10 null                -1 null");
    java.lang.String str15 = fTPFile0.getUser();
    fTPFile0.setLink("?---------    0          d---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0          hi!             0 null"+ "'", str14.equals("?---------    0          hi!             0 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("d---------    0                         10 ");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    boolean b16 = fTPFile0.isSymbolicLink();
    java.lang.String str17 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "d---------    0                         10 "+ "'", str17.equals("d---------    0                         10 "));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    fTPFile0.setLink("hi!");
    boolean b5 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fTPFile0.hasPermission((int)(byte)-1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------   10                         -1 ?---------    0          hi!            10 null");
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isFile();
    java.lang.String str17 = fTPFile0.toString();
    long long18 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 10L);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.toFormattedString();
    int i14 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0 ?---------    0                         10                 10 null");
    fTPFile0.setLink("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    boolean b5 = fTPFile0.hasPermission(2, 0);
    fTPFile0.setSize((long)0);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)100, (int)'#', true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------  100                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    fTPFile0.setSize(100L);
    fTPFile0.setHardLinkCount((int)(short)-1);
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    long long3 = fTPFile0.getSize();
    fTPFile0.setLink("?---------   10                         -1 ?---------   10                         -1 null");
    boolean b6 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.toString();
    boolean b14 = fTPFile0.isFile();
    java.lang.String str15 = fTPFile0.getName();
    java.lang.String str16 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount(3);
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.toFormattedString("");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 97, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 ?---------    0                         -1 null"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(short)0, 97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    boolean b16 = fTPFile0.isValid();
    fTPFile0.setName("----------   35                         -1 ?---------    0                         97 null");
    java.lang.String str19 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "----------   35                         -1 ?---------    0                         97 null"+ "'", str19.equals("----------   35                         -1 ?---------    0                         97 null"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setRawListing("?---------   10                         -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission(1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isFile();
    int i3 = fTPFile0.getType();
    fTPFile0.setUser("?---------    0 ?---------    0          hi!            10 null                -1 null");
    fTPFile0.setHardLinkCount((int)(short)-1);
    fTPFile0.setName("?---------    0 ?---------    0          hi!            10 null ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0          d---------    0                         10        -1 ");
    fTPFile0.setGroup("?---------    0 ?---------    0 ?---------    0          hi!            10 null                -1 d---------    0                         10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isSymbolicLink();
    fTPFile0.setType((int)'#');
    fTPFile0.setName("?---------   10 ?---------    0                          0 null d---------    0                         10 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.toFormattedString();
    fTPFile0.setUser("d---------    0 hi!                     10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 "+ "'", str8.equals("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 "));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    fTPFile0.setGroup("?---------  100 d---------    0                         10 null                10 null");
    fTPFile0.setUser("?---------    0          ?---------    0                         -1 null       -1 null");
    java.lang.String str17 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   35                         97 null");
    java.lang.String str15 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------   35                         97 null");
    fTPFile0.setSize((long)10);
    fTPFile0.setRawListing("?---------   10          hi!            10 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10          hi!            10 null"+ "'", str12.equals("?---------   10          hi!            10 null"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         97 null");
    fTPFile0.setType((int)(byte)1);
    java.lang.String str15 = fTPFile0.toFormattedString("d---------    0                         10 ?---------    0          ?---------    0                         10        -1 null");
    long long16 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "d---------    0                         -1 null"+ "'", str15.equals("d---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-1L));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------   10                         -1 null");
    fTPFile0.setGroup("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setSize((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    java.lang.String str9 = fTPFile0.getRawListing();
    fTPFile0.setType((int)(short)0);
    boolean b12 = fTPFile0.isFile();
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   10                         -1 null"+ "'", str8.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("hi!");
    boolean b14 = fTPFile0.isUnknown();
    boolean b15 = fTPFile0.isFile();
    boolean b16 = fTPFile0.isValid();
    java.lang.String str17 = fTPFile0.getUser();
    java.util.Calendar calendar18 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar18);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    int i5 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setGroup("?---------    0                         97 null");
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    java.lang.String str14 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0          ?---------    0                         97 null       10 null"+ "'", str11.equals("d---------    0          ?---------    0                         97 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getGroup();
    int i9 = fTPFile0.getType();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isFile();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    int i5 = fTPFile0.getHardLinkCount();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0          ?---------    0                         10        -1 null");
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    0                         -1 ?---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setUser("?---------    0          ?---------    0                         -1 null       -1 null");
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str15.equals("?---------    0          ?---------    0                         -1 null       -1 null"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setName("?---------   10 ?---------    0          ?---------   10          hi!            10 null       -1 null                -1 ?---------   10                         -1 null");
    fTPFile0.setGroup("?---------    0          ?---------    0                         -1 null       -1 null");
    java.lang.String str19 = fTPFile0.getGroup();
    fTPFile0.setUser("?---------    0          d---------    0                         -1 null       -1 ");
    java.lang.String str22 = fTPFile0.getGroup();
    boolean b23 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str19.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str22.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b5 = fTPFile0.isFile();
    java.lang.String str6 = fTPFile0.getUser();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("d---------    0                         10 ");
    java.lang.String str13 = fTPFile0.getName();
    fTPFile0.setGroup("?---------   35 d---------    0                         10 null                10 null");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b18 = fTPFile0.isFile();
    java.lang.String str19 = fTPFile0.getLink();
    boolean b20 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         10 null"+ "'", str12.equals("?---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   35                         97 null");
    long long8 = fTPFile0.getSize();
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    fTPFile0.setType((int)(short)1);
    boolean b12 = fTPFile0.isDirectory();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.toFormattedString("?---------   10                         -1 null");
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "d---------    0                         10 null"+ "'", str10.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("");
    java.lang.String str11 = fTPFile0.toFormattedString("");
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.toFormattedString();
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         10 "+ "'", str11.equals("?---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         10 "+ "'", str13.equals("?---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getName();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    boolean b15 = fTPFile0.isUnknown();
    int i16 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setUser("?---------    0                         10 ");
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setName("d---------    0                         10 ");
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   35                         97 null");
    long long8 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    long long11 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setSize((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    fTPFile0.setGroup("");
    fTPFile0.setUser("?---------    0 d---------    3          ?---------   35                         97 null       10 null                -1 null");
    fTPFile0.setUser("?---------   10 ?---------    0                          0 null d---------    0                         10 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setName("?---------    0          hi!            10 null");
    boolean b16 = fTPFile0.isDirectory();
    java.lang.String str17 = fTPFile0.getUser();
    java.util.Calendar calendar18 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar18);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    fTPFile0.setSize((long)0);
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          hi!            10 null"+ "'", str10.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0          ?---------    0          hi!            10 null        0 null"+ "'", str11.equals("d---------    0          ?---------    0          hi!            10 null        0 null"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getUser();
    boolean b14 = fTPFile0.hasPermission(0, 2);
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setPermission((int)(byte)0, (int)(byte)1, true);
    java.lang.String str15 = fTPFile0.getName();
    java.lang.String str16 = fTPFile0.toString();
    int i17 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getLink();
    fTPFile0.setName("d---------    0 ?---------   10                         -1 null                10 null");
    java.lang.String str9 = fTPFile0.toFormattedString();
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null"+ "'", str9.equals("d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    boolean b11 = fTPFile0.isSymbolicLink();
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("hi!");
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.hasPermission(0, 0);
    fTPFile0.setGroup("?---------    0                         35 null");
    java.lang.String str14 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0 ?---------    0          hi!            10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0          ?---------    0                         35 null       10 null"+ "'", str14.equals("d---------    0          ?---------    0                         35 null       10 null"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    int i8 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    long long7 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str5.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    boolean b5 = fTPFile0.hasPermission(2, 0);
    fTPFile0.setSize((long)0);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.toFormattedString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(2, 10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setGroup("d---------    0          ?---------    0                         35 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         97 null"+ "'", str5.equals("?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    long long6 = fTPFile0.getSize();
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isFile();
    boolean b9 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isValid();
    boolean b3 = fTPFile0.isSymbolicLink();
    boolean b4 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(10, 3, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(35);
    boolean b15 = fTPFile0.isValid();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setRawListing("?---------   10 ?---------   10          hi!            10 null                -1 null");
    fTPFile0.setType((int)(byte)10);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setRawListing("?---------    0          ?---------    0                         10        -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setSize((long)(byte)0);
    boolean b11 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------    0          hi!             1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("?---------   10                         -1 null");
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0 ?---------   35 d---------    0                         10 null                10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str5.equals("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str8.equals("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    long long3 = fTPFile0.getSize();
    fTPFile0.setRawListing("");
    java.lang.String str6 = fTPFile0.toString();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(35, 3, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------   10                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------    0                         10 ");
    fTPFile0.setName("?---------    0                          2 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------    0          ?---------  100                         -1 null       10 null");
    java.lang.String str8 = fTPFile0.getUser();
    boolean b9 = fTPFile0.isValid();
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         10 "+ "'", str7.equals("?---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------   10                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------    0          ?---------   10          hi!            10 null       -1 null");
    fTPFile0.setLink("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getLink();
    java.lang.String str15 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setGroup("?---------   10          hi!            10 null");
    fTPFile0.setSize((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'a');
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setSize((long)(byte)1);
    java.lang.String str16 = fTPFile0.toFormattedString("?---------    0          ?---------    0          ?---------   10          hi!            10 null       -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------   10          hi!             1 null"+ "'", str16.equals("?---------   10          hi!             1 null"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    boolean b13 = fTPFile0.isSymbolicLink();
    boolean b14 = fTPFile0.isFile();
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)' ');
    java.lang.String str17 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    fTPFile0.setLink("d---------   35                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "d---------   32                         10 null"+ "'", str17.equals("d---------   32                         10 null"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str4 = fTPFile0.getName();
    java.lang.String str5 = fTPFile0.getLink();
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------   10                         -1 ?---------   10                         -1 null");
    fTPFile0.setUser("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         97 null"+ "'", str5.equals("?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 ?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str9 = fTPFile0.getRawListing();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------   35                         97 null");
    int i13 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setRawListing("?---------    0                         10 ");
    fTPFile0.setName("d---------   32                         10 null");
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str5.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setType((int)'#');
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setType((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setType(0);
    long long11 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    boolean b15 = fTPFile0.hasPermission(0, (int)(short)0);
    fTPFile0.setGroup("d---------    0                         10 null");
    fTPFile0.setUser("----------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   10                         -1 null"+ "'", str8.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setType((int)(short)100);
    fTPFile0.setSize(0L);
    fTPFile0.setType(10);
    boolean b13 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    long long4 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    fTPFile0.setUser("d---------    0          d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null       10 null");
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setRawListing("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("d---------    0                         10 ");
    fTPFile0.setRawListing("d---------   32                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0          hi!            10 null"+ "'", str11.equals("?---------    0          hi!            10 null"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b5 = fTPFile0.isFile();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    java.lang.String str8 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    fTPFile0.setSize((-1L));
    fTPFile0.setGroup("");
    java.lang.String str8 = fTPFile0.getUser();
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setName("?---------    0                         -1 ?---------    0                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, (int)(short)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'a');
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getUser();
    boolean b12 = fTPFile0.isFile();
    boolean b13 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar14 = fTPFile0.getTimestamp();
    java.lang.String str15 = fTPFile0.getName();
    boolean b16 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    int i14 = fTPFile0.getType();
    boolean b15 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    java.lang.String str9 = fTPFile0.getRawListing();
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    int i11 = fTPFile0.getHardLinkCount();
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setHardLinkCount(0);
    boolean b15 = fTPFile0.isDirectory();
    java.lang.String str16 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    java.lang.String str14 = fTPFile0.getGroup();
    long long15 = fTPFile0.getSize();
    boolean b16 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    java.lang.String str7 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setLink("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    int i10 = fTPFile0.getType();
    java.lang.String str11 = fTPFile0.getUser();
    boolean b14 = fTPFile0.hasPermission(0, 2);
    fTPFile0.setRawListing("?---------   35                         97 null");
    boolean b17 = fTPFile0.isSymbolicLink();
    java.lang.String str18 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------   35                         97 null"+ "'", str18.equals("?---------   35                         97 null"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setName("?---------   10 ?---------   10                         -1 null                -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.getUser();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setSize((long)(-1));
    java.lang.String str13 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          hi!            -1 null"+ "'", str13.equals("?---------    0          hi!            -1 null"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setHardLinkCount(0);
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0          ?---------  100                         -1 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(35);
    fTPFile0.setSize((long)2);
    fTPFile0.setHardLinkCount(2);
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    int i6 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setName("?---------  100                         -1 null");
    boolean b12 = fTPFile0.isUnknown();
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    int i16 = fTPFile0.getType();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    fTPFile0.setType(52);
    fTPFile0.setType((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0                         10 ");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    long long11 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str6.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    long long7 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.getRawListing();
    boolean b9 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, 32, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    int i3 = fTPFile0.getType();
    java.lang.String str4 = fTPFile0.getRawListing();
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------   10                         -1 null");
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setGroup("?---------   35          d---------    0                         10 null       97 null");
    fTPFile0.setGroup("?---------   10 d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null                -1 null");
    boolean b16 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize(0L);
    java.lang.String str12 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    fTPFile0.setType(3);
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    long long6 = fTPFile0.getSize();
    int i7 = fTPFile0.getHardLinkCount();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    boolean b11 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------   10                         10 null");
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(100);
    fTPFile0.setSize((long)0);
    fTPFile0.setGroup("?---------   10 ?---------   10          hi!            10 null                -1 null");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0                         -1 null");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setGroup("d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null");
    boolean b9 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.toFormattedString();
    java.lang.String str2 = fTPFile0.getLink();
    boolean b3 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "?---------    0                         -1 null"+ "'", str1.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("d---------    0                         10 ");
    fTPFile0.setRawListing("d---------    0 ?---------   10                         -1 null                10 ");
    boolean b16 = fTPFile0.isFile();
    fTPFile0.setType((int)' ');
    boolean b19 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b17 = fTPFile0.isDirectory();
    int i18 = fTPFile0.getType();
    boolean b21 = fTPFile0.hasPermission(1, 0);
    java.lang.String str22 = fTPFile0.getName();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = fTPFile0.hasPermission(97, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setUser("");
    java.lang.String str13 = fTPFile0.getUser();
    fTPFile0.setName("?---------    0                         -1 ");
    fTPFile0.setType((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(1L);
    java.lang.String str11 = fTPFile0.getUser();
    boolean b12 = fTPFile0.isDirectory();
    java.lang.String str13 = fTPFile0.getLink();
    boolean b14 = fTPFile0.isDirectory();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission((-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0          hi!            10 null"+ "'", str8.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   35                         97 null");
    long long8 = fTPFile0.getSize();
    fTPFile0.setLink("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    long long11 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)-1);
    fTPFile0.setHardLinkCount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    fTPFile0.setType((int)' ');
    long long8 = fTPFile0.getSize();
    fTPFile0.setGroup("d---------    0                         10 ");
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   10                         -1 ?---------   10                         -1 null");
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          d---------    0                         10        -1 "+ "'", str13.equals("?---------    0          d---------    0                         10        -1 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setName("?---------   10                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getName();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    fTPFile0.setUser("?---------   35 d---------    0                         10 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    fTPFile0.setSize((long)0);
    fTPFile0.setUser("?---------   10 ?---------    0          hi!            10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setHardLinkCount((int)(byte)10);
    java.lang.String str11 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   10                         -1 null"+ "'", str11.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setGroup("");
    fTPFile0.setLink("");
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isUnknown();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    boolean b15 = fTPFile0.hasPermission((int)(short)1, 0);
    java.lang.String str16 = fTPFile0.toFormattedString();
    int i17 = fTPFile0.getType();
    java.util.Calendar calendar18 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0                         -1 null"+ "'", str16.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar18);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    long long8 = fTPFile0.getSize();
    boolean b9 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(3, (int)(byte)10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    java.lang.String str6 = fTPFile0.toFormattedString("d---------    0 ?---------   10                         -1 null                10 null");
    java.lang.String str8 = fTPFile0.toFormattedString("?---------  100                         -1 null");
    java.lang.String str9 = fTPFile0.getRawListing();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------  100                         -1 null"+ "'", str6.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 null"+ "'", str8.equals("?---------  100                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str12 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount((int)(short)100);
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 null"+ "'", str11.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)100, (int)(short)-1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    long long3 = fTPFile0.getSize();
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    fTPFile0.setName("hi!");
    fTPFile0.setType((int)(byte)10);
    boolean b10 = fTPFile0.isUnknown();
    fTPFile0.setGroup("?---------    0          d---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    int i5 = fTPFile0.getHardLinkCount();
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setType((int)(byte)0);
    boolean b8 = fTPFile0.isUnknown();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    fTPFile0.setHardLinkCount((int)' ');
    java.lang.String str16 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("d---------    0                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d---------   32                         10 null"+ "'", str16.equals("d---------   32                         10 null"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    boolean b11 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isUnknown();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.lang.String str11 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setLink("?---------    0 ?---------   35 d---------    0                         10 null                10 null                -1 null");
    fTPFile0.setRawListing("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount(100);
    java.lang.String str13 = fTPFile0.getRawListing();
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getGroup();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getGroup();
    fTPFile0.setSize((long)2);
    java.lang.String str10 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.toString();
    int i13 = fTPFile0.getType();
    fTPFile0.setLink("d---------    0                         -1 null");
    boolean b16 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setHardLinkCount((int)(byte)10);
    fTPFile0.setGroup("");
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str12 = fTPFile0.toFormattedString("----------   35                         -1 ?---------    0                         97 null");
    fTPFile0.setRawListing("?---------    0                         35 null");
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10 ?---------    0          hi!            10 null                -1 null"+ "'", str12.equals("?---------   10 ?---------    0          hi!            10 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------  100 d---------    0                         10 null                10 null"+ "'", str12.equals("?---------  100 d---------    0                         10 null                10 null"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------   10 ?---------   10                         -1 null                -1 null");
    boolean b4 = fTPFile0.isFile();
    int i5 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(short)100);
    fTPFile0.setType((int)(short)0);
    java.lang.String str11 = fTPFile0.getGroup();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setUser("d---------    0 ?---------   10                         -1 null                10 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    int i10 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    int i6 = fTPFile0.getType();
    java.lang.String str7 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setName("?---------    0                         -1 null");
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0                         10 d---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getName();
    boolean b14 = fTPFile0.isFile();
    java.lang.String str15 = fTPFile0.getLink();
    java.lang.String str16 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setName("?---------    0          hi!            10 null");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         10 null");
    int i10 = fTPFile0.getType();
    fTPFile0.setType((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   10                         -1 ?---------    0          hi!            10 null"+ "'", str9.equals("?---------   10                         -1 ?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    int i6 = fTPFile0.getHardLinkCount();
    java.lang.String str7 = fTPFile0.getGroup();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setType(100);
    fTPFile0.setHardLinkCount(10);
    fTPFile0.setName("?---------    0 ?---------    0          hi!            10 null                -1 d---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setGroup("?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setType((-1));
    java.lang.String str14 = fTPFile0.getName();
    fTPFile0.setUser("?---------   10                         -1 null");
    boolean b17 = fTPFile0.isSymbolicLink();
    java.lang.String str18 = fTPFile0.getLink();
    java.lang.String str19 = fTPFile0.getName();
    java.lang.String str20 = fTPFile0.getName();
    java.lang.String str21 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = fTPFile0.hasPermission((int)(byte)10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "?---------    0 ?---------   10                         -1 null                10 null"+ "'", str21.equals("?---------    0 ?---------   10                         -1 null                10 null"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   35                         97 null");
    fTPFile0.setType((int)(byte)1);
    boolean b14 = fTPFile0.isSymbolicLink();
    java.lang.String str15 = fTPFile0.getLink();
    int i16 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getRawListing();
    java.lang.String str6 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setSize((long)(short)-1);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    fTPFile0.setRawListing("?---------    0                         10 ");
    boolean b17 = fTPFile0.isFile();
    java.lang.String str18 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    fTPFile0.setType((int)(short)1);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str14 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("");
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount((int)(short)100);
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setType((int)(byte)10);
    java.lang.String str15 = fTPFile0.getUser();
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    java.lang.String str18 = fTPFile0.getRawListing();
    java.util.Calendar calendar19 = null;
    fTPFile0.setTimestamp(calendar19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isUnknown();
    boolean b8 = fTPFile0.isSymbolicLink();
    long long9 = fTPFile0.getSize();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getLink();
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.getName();
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         97 null"+ "'", str9.equals("?---------   35                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   35                         97 null"+ "'", str10.equals("?---------   35                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    fTPFile0.setSize((long)0);
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    long long18 = fTPFile0.getSize();
    java.lang.String str19 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setName("?---------   10                         -1 null");
    fTPFile0.setName("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setType(0);
    fTPFile0.setSize((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("d---------    0                         10 ");
    java.lang.String str13 = fTPFile0.getName();
    fTPFile0.setGroup("?---------   35 d---------    0                         10 null                10 null");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b18 = fTPFile0.isFile();
    java.lang.String str19 = fTPFile0.getLink();
    java.lang.String str20 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         10 null"+ "'", str12.equals("?---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0                         -1 ?---------   10                         -1 null"+ "'", str20.equals("?---------    0                         -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getName();
    fTPFile0.setSize((long)(byte)0);
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setName("d---------    0 ?---------   10          hi!            10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b6 = fTPFile0.isDirectory();
    java.lang.String str7 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.toFormattedString("d---------    0          ?---------    0                         35 null       10 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------  100                         -1 null");
    long long16 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount(32);
    fTPFile0.setName("?---------    0                         10 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(short)10, (int)(byte)1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == (-1L));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.getName();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    int i6 = fTPFile0.getHardLinkCount();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)-1, 2, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   10                         -1 ?---------    0          hi!            10 null");
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setRawListing("?---------    0                         10 ");
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str14 = fTPFile0.toFormattedString();
    int i15 = fTPFile0.getType();
    boolean b16 = fTPFile0.isFile();
    int i17 = fTPFile0.getType();
    fTPFile0.setRawListing("?---------  100                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0                         10 "+ "'", str14.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(byte)10);
    int i10 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str12 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.isValid();
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         97 null"+ "'", str5.equals("?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getName();
    boolean b15 = fTPFile0.isSymbolicLink();
    fTPFile0.setSize((long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("?---------  100                          0 null");
    fTPFile0.setType((int)(short)10);
    java.lang.String str14 = fTPFile0.getName();
    int i15 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isValid();
    boolean b11 = fTPFile0.isValid();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission((int)(byte)-1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    fTPFile0.setName("?---------    0          hi!            97 null");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setType(52);
    boolean b17 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    java.lang.String str5 = fTPFile0.getRawListing();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    java.lang.String str9 = fTPFile0.getUser();
    boolean b10 = fTPFile0.isValid();
    fTPFile0.setSize((long)3);
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    boolean b11 = fTPFile0.isValid();
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setType((int)(byte)0);
    java.lang.String str9 = fTPFile0.toFormattedString("----------   35                         -1 ?---------    0                         97 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "----------   10                         -1 null"+ "'", str9.equals("----------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "----------   10                         -1 null"+ "'", str10.equals("----------   10                         -1 null"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setLink("d---------    0                         10 null");
    java.lang.String str13 = fTPFile0.toFormattedString();
    boolean b14 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0                         -1 null"+ "'", str13.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------   10                         -1 null");
    fTPFile0.setSize((long)(short)100);
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   -1          ?---------    0                         -1 null       -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)(byte)10, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    fTPFile0.setRawListing("?---------    0                         -1 null");
    fTPFile0.setGroup("d---------    0          ?---------    0                         10        10 null");
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setRawListing("?---------   10 ?---------   10                         -1 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    fTPFile0.setType((int)(short)100);
    fTPFile0.setSize(0L);
    int i11 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setSize((-1L));
    fTPFile0.setSize((long)(short)0);
    fTPFile0.setLink("?---------   -1          ?---------    0                         -1 null       -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString("d---------    0          ?---------    0                         35 null       10 null");
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------    0                          0 null"+ "'", str15.equals("?---------    0                          0 null"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("d---------    0                         10 null");
    boolean b10 = fTPFile0.isFile();
    long long11 = fTPFile0.getSize();
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("d---------    3 ?---------   -1          ?---------    0                         -1 null       -1 null ?---------   35                         97 null       10 null");
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    boolean b16 = fTPFile0.isValid();
    java.lang.String str17 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "d---------    3 ?---------   -1          ?---------    0                         -1 null       -1 null ?---------   35                         97 null       10 null"+ "'", str17.equals("d---------    3 ?---------   -1          ?---------    0                         -1 null       -1 null ?---------   35                         97 null       10 null"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    fTPFile0.setSize((long)0);
    java.lang.String str10 = fTPFile0.getGroup();
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          hi!            10 null"+ "'", str10.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.toFormattedString();
    java.lang.String str2 = fTPFile0.getLink();
    int i3 = fTPFile0.getHardLinkCount();
    java.lang.String str4 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "?---------    0                         -1 null"+ "'", str1.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)'#');
    fTPFile0.setHardLinkCount(0);
    java.util.Calendar calendar12 = null;
    fTPFile0.setTimestamp(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setGroup("d---------    0          ?---------    0          hi!            10 null       10 null");
    fTPFile0.setUser("?---------    0          ?---------  100                         -1 null       10 ?---------    0                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str10 = fTPFile0.getName();
    boolean b11 = fTPFile0.isValid();
    fTPFile0.setUser("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    java.lang.String str14 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0 d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null ?---------  100                         -1 null       10 null"+ "'", str14.equals("d---------    0 d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null ?---------  100                         -1 null       10 null"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    int i4 = fTPFile0.getHardLinkCount();
    fTPFile0.setLink("");
    fTPFile0.setRawListing("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    java.lang.String str10 = fTPFile0.toFormattedString("?---------    0          d---------    3          ?---------   35                         97 null       10 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    fTPFile0.setUser("");
    java.lang.String str11 = fTPFile0.toFormattedString("");
    fTPFile0.setName("?---------   10                         -1 null");
    int i14 = fTPFile0.getHardLinkCount();
    boolean b15 = fTPFile0.isDirectory();
    java.lang.String str16 = fTPFile0.getGroup();
    boolean b17 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         10 "+ "'", str11.equals("?---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getLink();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setGroup("d---------    3          ?---------   35                         97 null       10 null");
    fTPFile0.setSize(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    fTPFile0.setType((int)(short)1);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.toString();
    java.lang.String str14 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0          ?---------   10                         -1 null       10 null"+ "'", str14.equals("d---------    0          ?---------   10                         -1 null       10 null"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    fTPFile0.setSize((long)(byte)100);
    fTPFile0.setRawListing("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    java.lang.String str16 = fTPFile0.toString();
    java.lang.String str17 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null"+ "'", str16.equals("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null"+ "'", str17.equals("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    fTPFile0.setSize(1L);
    java.lang.String str11 = fTPFile0.getUser();
    boolean b12 = fTPFile0.isDirectory();
    java.lang.String str13 = fTPFile0.getUser();
    int i14 = fTPFile0.getType();
    boolean b15 = fTPFile0.isValid();
    boolean b16 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0          hi!            10 null"+ "'", str8.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   35                         97 null");
    int i15 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(3);
    java.lang.String str18 = fTPFile0.getName();
    java.lang.String str19 = fTPFile0.toFormattedString();
    boolean b20 = fTPFile0.isFile();
    fTPFile0.setSize(10L);
    java.lang.String str23 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d---------    3          ?---------   35                         97 null       10 null"+ "'", str19.equals("d---------    3          ?---------   35                         97 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.getName();
    java.lang.String str2 = fTPFile0.toString();
    java.lang.String str3 = fTPFile0.toFormattedString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    boolean b5 = fTPFile0.isDirectory();
    boolean b6 = fTPFile0.isFile();
    int i7 = fTPFile0.getHardLinkCount();
    long long8 = fTPFile0.getSize();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setGroup("d---------    0 d---------    0 ?---------   10                         -1 null                10 null                10 null");
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setName("hi!");
    boolean b5 = fTPFile0.isUnknown();
    fTPFile0.setHardLinkCount(1);
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getGroup();
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("hi!");
    boolean b14 = fTPFile0.isUnknown();
    boolean b15 = fTPFile0.isFile();
    long long16 = fTPFile0.getSize();
    fTPFile0.setRawListing("?---------    0 ?---------   10                         -1 null                10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 10L);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.getGroup();
    java.lang.String str13 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   10                         -1 null"+ "'", str11.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setName("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    java.lang.String str11 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str11.equals("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"+ "'", str12.equals("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str2 = fTPFile0.getUser();
    boolean b3 = fTPFile0.isUnknown();
    boolean b4 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getGroup();
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    fTPFile0.setType((int)' ');
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.toString();
    long long10 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == (-1L));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setRawListing("?---------    0                         10 ");
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 ?---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getUser();
    long long8 = fTPFile0.getSize();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.getGroup();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setGroup("d---------    0 d---------    0 ?---------   10                         -1 null                10 null                10 null");
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0          ?---------  100                         -1 null       10 ?---------    0                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0          d---------    0 d---------    0 ?---------   10                         -1 null                10 null                10 null       -1 null"+ "'", str9.equals("?---------    0          d---------    0 d---------    0 ?---------   10                         -1 null                10 null                10 null       -1 null"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isFile();
    fTPFile0.setSize((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setType((int)' ');
    fTPFile0.setUser("?---------   10 ?---------   10                         -1 null                -1 null");
    java.lang.String str13 = fTPFile0.toFormattedString();
    java.lang.String str14 = fTPFile0.getUser();
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null"+ "'", str13.equals("?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10 ?---------   10                         -1 null                -1 null"+ "'", str14.equals("?---------   10 ?---------   10                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setSize((-1L));
    boolean b10 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str2 = fTPFile0.getUser();
    boolean b3 = fTPFile0.isUnknown();
    java.lang.String str4 = fTPFile0.getName();
    boolean b5 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.toFormattedString("?---------    0          ?---------  100                         -1 null       10 null");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(35);
    fTPFile0.setHardLinkCount(0);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, 52, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0          ?---------    0                         -1 ?---------    0                         -1 null       -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    java.lang.String str6 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toString();
    java.lang.String str8 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setSize((long)(byte)100);
    fTPFile0.setUser("?---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getGroup();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("?---------    0          ?---------   10          hi!            10 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("?---------    0          hi!            10 null");
    java.lang.String str6 = fTPFile0.toFormattedString("d---------    0 ?---------   10                         -1 null                10 null");
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setUser("?---------   35 d---------    0                         10 null                10 null");
    fTPFile0.setUser("?---------    0                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setGroup("");
    fTPFile0.setLink("?---------    0          hi!            97 null");
    fTPFile0.setHardLinkCount(10);
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    boolean b16 = fTPFile0.isSymbolicLink();
    java.lang.String str17 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isDirectory();
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    fTPFile0.setType((int)' ');
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.toString();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setLink("?---------    0                         97 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    boolean b5 = fTPFile0.isFile();
    java.lang.String str6 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = fTPFile0.hasPermission((int)'#', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.toString();
    boolean b14 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("?---------  100                          0 null");
    fTPFile0.setType((int)(short)10);
    boolean b14 = fTPFile0.isUnknown();
    fTPFile0.setLink("?---------    0 ?---------    0          hi!            10 null                -1 ");
    boolean b17 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setUser("?---------   10                         -1 ?---------   10                         -1 null");
    fTPFile0.setUser("d---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.getLink();
    fTPFile0.setLink("d---------    0          d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   35                         97 null");
    int i15 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(3);
    java.lang.String str18 = fTPFile0.getName();
    java.lang.String str19 = fTPFile0.toFormattedString();
    boolean b20 = fTPFile0.isFile();
    fTPFile0.setSize(10L);
    java.lang.String str24 = fTPFile0.toFormattedString("?---------   10 ?---------    0          ?---------   10          hi!            10 null       -1 null                -1 ?---------   10                         -1 null");
    fTPFile0.setGroup("d---------    0          d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d---------    3          ?---------   35                         97 null       10 null"+ "'", str19.equals("d---------    3          ?---------   35                         97 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "d---------    3          ?---------   35                         97 null       10 null"+ "'", str24.equals("d---------    3          ?---------   35                         97 null       10 null"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'#');
    int i14 = fTPFile0.getType();
    boolean b15 = fTPFile0.isSymbolicLink();
    java.lang.String str16 = fTPFile0.getGroup();
    java.lang.String str17 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0                         -1 null"+ "'", str17.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isValid();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setRawListing("d---------    0                         10 ?---------    0          ?---------    0                         10        -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    fTPFile0.setType(100);
    fTPFile0.setHardLinkCount(10);
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         10 null"+ "'", str10.equals("?---------   10                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setRawListing("d---------    0                         10 null");
    int i7 = fTPFile0.getType();
    fTPFile0.setSize((long)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getRawListing();
    long long9 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b12 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setName("?---------   10 ?---------   10                         -1 null                -1 null");
    boolean b11 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str8 = fTPFile0.toFormattedString("d---------    0          ?---------    0                         97 null       10 null");
    java.lang.String str9 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------   10 d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setSize((-1L));
    boolean b13 = fTPFile0.isUnknown();
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------  100                         -1 null");
    java.util.Calendar calendar9 = fTPFile0.getTimestamp();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setName("?---------  100                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, (int)(short)100, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------   10                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(0, (int)'a', false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(0);
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getLink();
    fTPFile0.setLink("?---------    0          ?---------    0                         -1 null       -1 null");
    int i16 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    int i10 = fTPFile0.getType();
    fTPFile0.setType((int)(short)100);
    boolean b13 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setName("?---------    0          hi!            10 null");
    fTPFile0.setLink("?---------   10                         -1 null");
    int i18 = fTPFile0.getType();
    fTPFile0.setUser("?---------   10 ?---------  100                          0 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    int i8 = fTPFile0.getType();
    boolean b9 = fTPFile0.isFile();
    java.lang.String str10 = fTPFile0.getRawListing();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str12 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setRawListing("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setGroup("?---------  100                         -1 d---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.hasPermission(0, 0);
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    int i15 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    java.lang.String str15 = fTPFile0.getGroup();
    boolean b16 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setUser("?---------    0                         -1 ");
    boolean b10 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }


    FTPFile fTPFile0 = new FTPFile();
    java.lang.String str1 = fTPFile0.toFormattedString();
    java.lang.String str2 = fTPFile0.getLink();
    fTPFile0.setType((int)(byte)0);
    fTPFile0.setGroup("d---------    0          ?---------    0          hi!            10 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "?---------    0                         -1 null"+ "'", str1.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    java.lang.String str6 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.toFormattedString("");
    boolean b9 = fTPFile0.isValid();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setLink("d---------    0                         10 null");
    fTPFile0.setHardLinkCount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString();
    java.lang.String str16 = fTPFile0.getRawListing();
    java.lang.String str17 = fTPFile0.getUser();
    fTPFile0.setUser("d---------    0                          0 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   10 ?---------   10                         -1 null                -1 null"+ "'", str15.equals("?---------   10 ?---------   10                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------   10                         -1 null"+ "'", str17.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setSize((long)32);
    fTPFile0.setRawListing("?---------   10                         -1 ?---------   10                         -1 null");
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 32L);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setUser("?---------   10 ?---------   10          hi!            10 null                -1 null");
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------   10                         -1 null");
    fTPFile0.setGroup("hi!");
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.getRawListing();
    fTPFile0.setType((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setRawListing("d---------    0          ?---------    0          hi!            10 null       10 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    int i3 = fTPFile0.getType();
    java.lang.String str4 = fTPFile0.getRawListing();
    fTPFile0.setUser("?---------    0 ?---------    0          hi!            10 null                -1 d---------    0                         10 null");
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------    0                         97 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str13 = fTPFile0.toFormattedString("d---------    0                         -1 null");
    fTPFile0.setRawListing("?---------    0          hi!            97 null");
    int i16 = fTPFile0.getType();
    fTPFile0.setLink("?---------    0 d---------    0 ?---------   10                         -1 null                10 null ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(35);
    java.util.Calendar calendar15 = null;
    fTPFile0.setTimestamp(calendar15);
    java.lang.String str18 = fTPFile0.toFormattedString("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = fTPFile0.hasPermission((int)(short)0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "d---------   35                         10 "+ "'", str18.equals("d---------   35                         10 "));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setRawListing("?---------   52          hi!            -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString();
    fTPFile0.setType((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0 ?---------    0          hi!            10 null ?---------    0                         -1 null       -1 null"+ "'", str12.equals("?---------    0 ?---------    0          hi!            10 null ?---------    0                         -1 null       -1 null"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------  100                         -1 null");
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.util.Calendar calendar2 = fTPFile0.getTimestamp();
    fTPFile0.setLink("hi!");
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    fTPFile0.setUser("?---------    0                         -1 null");
    fTPFile0.setLink("d---------    0 d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null ?---------  100                         -1 null       10 null");

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    0          ?---------  100                         -1 null       10 null");
    fTPFile0.setType(52);
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    java.lang.String str16 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0 ?---------    0          ?---------  100                         -1 null       10 null                10 null"+ "'", str16.equals("?---------    0 ?---------    0          ?---------  100                         -1 null       10 null                10 null"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    boolean b6 = fTPFile0.isValid();
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("d---------    0                         10 ");
    fTPFile0.setType(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setUser("?---------   10                         -1 ?---------   10                         -1 null");
    fTPFile0.setUser("d---------    0                         -1 null");
    int i13 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    boolean b4 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   10                         -1 ?---------    0          hi!            10 null");
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission(0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setName("hi!");
    fTPFile0.setGroup("");
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    boolean b12 = fTPFile0.isUnknown();
    boolean b13 = fTPFile0.isValid();
    boolean b14 = fTPFile0.isValid();
    fTPFile0.setSize((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0          hi!            10 null"+ "'", str6.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    java.lang.String str8 = fTPFile0.getLink();
    boolean b9 = fTPFile0.isDirectory();
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(35, 1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    int i3 = fTPFile0.getType();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setPermission((int)(short)0, (int)(short)0, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(35);
    boolean b15 = fTPFile0.isValid();
    boolean b16 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setUser("d---------    0 ?---------   10                         -1 null                10 null");
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setSize((long)52);
    boolean b12 = fTPFile0.isFile();
    boolean b13 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str5.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setType((-1));
    java.lang.String str14 = fTPFile0.getName();
    java.lang.String str15 = fTPFile0.getLink();
    boolean b16 = fTPFile0.isUnknown();
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str19 = fTPFile0.getName();
    boolean b20 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d---------    0                         10 null"+ "'", str19.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("?---------  100                          0 null");
    fTPFile0.setType((int)(short)10);
    boolean b14 = fTPFile0.isUnknown();
    fTPFile0.setRawListing("?---------   10 ?---------    0          hi!            10 null                -1 null");
    boolean b17 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setPermission((int)(byte)0, (int)(byte)1, true);
    java.lang.String str15 = fTPFile0.getName();
    java.lang.String str16 = fTPFile0.toString();
    int i17 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    boolean b15 = fTPFile0.isUnknown();
    fTPFile0.setUser("d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null");
    java.lang.String str18 = fTPFile0.toFormattedString();
    fTPFile0.setName("?---------   -1          ?---------    0                         -1 null       -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------   10 d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null                -1 null"+ "'", str18.equals("?---------   10 d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null                -1 null"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getUser();
    java.lang.String str12 = fTPFile0.toString();
    int i13 = fTPFile0.getType();
    boolean b14 = fTPFile0.isSymbolicLink();
    int i15 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str6 = fTPFile0.toString();
    boolean b9 = fTPFile0.hasPermission(2, 1);
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(10, 0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    java.lang.String str9 = fTPFile0.getUser();
    fTPFile0.setRawListing("d---------    0 ?---------   10                         -1 null                10 null");
    java.lang.String str12 = fTPFile0.toString();
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setGroup("?-w-------   10 d---------    0          ?---------    0                         35 null       10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getLink();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount(100);
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setSize((long)(short)-1);
    boolean b12 = fTPFile0.isFile();
    fTPFile0.setRawListing("?---------  100                          0 null");
    int i15 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toString();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setHardLinkCount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setType((int)(byte)10);
    fTPFile0.setHardLinkCount(35);
    java.lang.String str17 = fTPFile0.toString();
    fTPFile0.setType((int)(short)1);
    java.lang.String str20 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    boolean b5 = fTPFile0.hasPermission(2, 0);
    fTPFile0.setSize((long)0);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    boolean b9 = fTPFile0.isUnknown();
    boolean b10 = fTPFile0.isFile();
    java.lang.String str11 = fTPFile0.toFormattedString();
    fTPFile0.setLink("?---------    0          hi!            10 null");
    fTPFile0.setRawListing("?---------    0          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                          0 null"+ "'", str11.equals("?---------    0                          0 null"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = fTPFile0.hasPermission(10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setSize((long)(short)100);
    java.lang.String str9 = fTPFile0.getGroup();
    int i10 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------    0                         32 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    boolean b5 = fTPFile0.hasPermission(2, 0);
    fTPFile0.setSize((long)0);
    fTPFile0.setHardLinkCount((int)'4');
    boolean b10 = fTPFile0.isDirectory();
    long long11 = fTPFile0.getSize();
    fTPFile0.setName("?---------    0 ?---------   10          hi!            10 null                10 ");
    java.lang.String str14 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("?---------    0 ?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null hi!            10 null");
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    fTPFile0.setRawListing("?---------    0                         35 null");
    fTPFile0.setGroup("?---------    0                         -1 ?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    fTPFile0.setUser("?---------   97          hi!            10 null");
    fTPFile0.setLink("?---------   10 d---------    0                         10 d---------    0 ?---------   10                         -1 null                10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         97 null"+ "'", str9.equals("?---------   35                         97 null"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   10                         -1 ?---------    0          hi!            10 null");
    java.lang.String str14 = fTPFile0.getGroup();
    boolean b15 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         10 null"+ "'", str13.equals("?---------   10                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.getGroup();
    java.lang.String str6 = fTPFile0.getName();
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str10 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    boolean b5 = fTPFile0.isUnknown();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    java.lang.String str8 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.getGroup();
    int i10 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    fTPFile0.setUser("d---------    0 ?---------   10                         -1 null                10 null");
    boolean b7 = fTPFile0.isFile();
    boolean b8 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("");
    fTPFile0.setType((int)' ');
    boolean b8 = fTPFile0.isValid();
    boolean b9 = fTPFile0.isFile();
    fTPFile0.setType(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------    0                         -1 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str11 = fTPFile0.getName();
    fTPFile0.setRawListing("d---------    0 ?---------   10                         -1 null                10 ");
    java.lang.String str14 = fTPFile0.getGroup();
    fTPFile0.setName("?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   35                         97 null"+ "'", str9.equals("?---------   35                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   35                         97 null"+ "'", str10.equals("?---------   35                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    java.lang.String str4 = fTPFile0.getLink();
    java.lang.String str5 = fTPFile0.getUser();
    boolean b6 = fTPFile0.isDirectory();
    boolean b7 = fTPFile0.isUnknown();
    boolean b8 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                         97 null");
    int i8 = fTPFile0.getType();
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'#', 32, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setName("?---------    0          ?---------    0                         10        -1 null");
    java.lang.String str8 = fTPFile0.getRawListing();
    int i9 = fTPFile0.getType();
    java.util.Calendar calendar10 = fTPFile0.getTimestamp();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    boolean b13 = fTPFile0.isDirectory();
    int i14 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    fTPFile0.setLink("hi!");
    java.util.Calendar calendar5 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar5);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    java.lang.String str9 = fTPFile0.getGroup();
    fTPFile0.setSize(0L);
    int i12 = fTPFile0.getHardLinkCount();
    boolean b13 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b17 = fTPFile0.isDirectory();
    int i18 = fTPFile0.getType();
    fTPFile0.setName("?---------   97          hi!            10 null");
    boolean b21 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getLink();
    boolean b11 = fTPFile0.isUnknown();
    java.lang.String str12 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getGroup();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setRawListing("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setRawListing("?---------   52          hi!            -1 null");
    fTPFile0.setUser("d---------    0          ?---------    0                         97 null       10 null");
    boolean b13 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setName("?---------   10 ?---------    0          ?---------   10          hi!            10 null       -1 null                -1 ?---------   10                         -1 null");
    fTPFile0.setGroup("?---------    0          ?---------    0                         -1 null       -1 null");
    java.lang.String str19 = fTPFile0.getGroup();
    fTPFile0.setUser("?---------    0          d---------    0                         -1 null       -1 ");
    java.lang.String str22 = fTPFile0.getGroup();
    java.lang.String str23 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str19.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 null"+ "'", str22.equals("?---------    0          ?---------    0                         -1 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "d---------    0 ?---------    0          d---------    0                         -1 null       -1  ?---------    0          ?---------    0                         -1 null       -1 null       10 ?---------   10 ?---------    0          ?---------   10          hi!            10 null       -1 null                -1 ?---------   10                         -1 null"+ "'", str23.equals("d---------    0 ?---------    0          d---------    0                         -1 null       -1  ?---------    0          ?---------    0                         -1 null       -1 null       10 ?---------   10 ?---------    0          ?---------   10          hi!            10 null       -1 null                -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setLink("d---------    3          ?---------   35                         97 null       10 null");
    boolean b10 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str15 = fTPFile0.toFormattedString();
    java.lang.String str16 = fTPFile0.getRawListing();
    java.lang.String str17 = fTPFile0.getUser();
    boolean b18 = fTPFile0.isUnknown();
    fTPFile0.setType(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "?---------   10 ?---------   10                         -1 null                -1 null"+ "'", str15.equals("?---------   10 ?---------   10                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------   10                         -1 null"+ "'", str17.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setLink("?---------  100                         -1 null");
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    java.lang.String str11 = fTPFile0.toString();
    java.lang.String str12 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    fTPFile0.setName("?-w-------   10                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    int i11 = fTPFile0.getHardLinkCount();
    java.lang.String str12 = fTPFile0.toString();
    int i13 = fTPFile0.getType();
    fTPFile0.setRawListing("d---------    0                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str6 = fTPFile0.toString();
    boolean b9 = fTPFile0.hasPermission(2, 1);
    fTPFile0.setGroup("?---------    0                         10 ");
    java.lang.String str13 = fTPFile0.toFormattedString("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    java.lang.String str14 = fTPFile0.getUser();
    fTPFile0.setSize((long)52);
    java.util.Calendar calendar17 = null;
    fTPFile0.setTimestamp(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------    0          ?---------    0                         10        -1 null"+ "'", str13.equals("?---------    0          ?---------    0                         10        -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setSize((-1L));
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getRawListing();
    fTPFile0.setGroup("d---------    3          ?---------   35                         97 null       10 null");
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.toFormattedString("?-w-------   10                         -1 null");
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------   10                         -1 null"+ "'", str10.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0          d---------    3          ?---------   35                         97 null       10 null       -1 null"+ "'", str12.equals("?---------    0          d---------    3          ?---------   35                         97 null       10 null       -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == (-1L));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    java.lang.String str6 = fTPFile0.getGroup();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.getUser();
    fTPFile0.setLink("?---------    0 d---------    3          ?---------   35                         97 null       10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isFile();
    fTPFile0.setType(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    java.lang.String str4 = fTPFile0.getGroup();
    java.lang.String str5 = fTPFile0.getLink();
    fTPFile0.setHardLinkCount(100);
    java.util.Calendar calendar8 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar8);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    fTPFile0.setType((int)(byte)0);
    fTPFile0.setRawListing("");
    fTPFile0.setName("?---------    0                         97 null");
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str15 = fTPFile0.toFormattedString("?---------   10                         -1 ?---------   10                         -1 null");
    java.util.Calendar calendar16 = null;
    fTPFile0.setTimestamp(calendar16);
    java.lang.String str18 = fTPFile0.getGroup();
    java.util.Calendar calendar19 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "----------   35                         -1 ?---------    0                         97 null"+ "'", str15.equals("----------   35                         -1 ?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar19);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    java.lang.String str7 = fTPFile0.getLink();
    fTPFile0.setLink("?---------   10          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.lang.String str13 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isUnknown();
    java.lang.String str6 = fTPFile0.getRawListing();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    fTPFile0.setHardLinkCount((int)'a');
    boolean b11 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0                         -1 null"+ "'", str8.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("?---------  100                          0 null");
    fTPFile0.setType((int)(short)10);
    boolean b14 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fTPFile0.hasPermission((int)(byte)-1, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getLink();
    fTPFile0.setName("?---------    0                         -1 null");
    java.lang.String str7 = fTPFile0.toFormattedString("?---------   10          hi!            10 null");
    long long8 = fTPFile0.getSize();
    java.lang.String str9 = fTPFile0.getRawListing();
    java.lang.String str10 = fTPFile0.toFormattedString();
    java.lang.String str12 = fTPFile0.toFormattedString("");
    java.lang.String str13 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 ?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 ?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setSize(10L);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("d---------    0                         10 ");
    java.lang.String str13 = fTPFile0.getName();
    fTPFile0.setGroup("?---------   35 d---------    0                         10 null                10 null");
    fTPFile0.setRawListing("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b18 = fTPFile0.isFile();
    java.lang.String str19 = fTPFile0.getLink();
    java.lang.String str20 = fTPFile0.toString();
    fTPFile0.setHardLinkCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         10 null"+ "'", str12.equals("?---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0                         -1 ?---------   10                         -1 null"+ "'", str20.equals("?---------    0                         -1 ?---------   10                         -1 null"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    boolean b11 = fTPFile0.hasPermission(0, 0);
    java.util.Calendar calendar12 = fTPFile0.getTimestamp();
    fTPFile0.setSize(0L);
    fTPFile0.setUser("?---------    0                          2 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)10, 10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar12);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setRawListing("?---------   10                         -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)(byte)0);
    java.lang.String str10 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.getUser();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setType(0);
    boolean b11 = fTPFile0.isFile();
    fTPFile0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         10 ");
    int i7 = fTPFile0.getHardLinkCount();
    long long8 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 97L);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.getName();
    fTPFile0.setType((-1));
    fTPFile0.setSize((long)(short)100);
    boolean b15 = fTPFile0.isValid();
    int i16 = fTPFile0.getHardLinkCount();
    fTPFile0.setUser("?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null");
    java.lang.String str20 = fTPFile0.toFormattedString("?---------   97          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "?---------    0 ?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null               100 null"+ "'", str20.equals("?---------    0 ?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null               100 null"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setUser("");
    java.util.Calendar calendar7 = null;
    fTPFile0.setTimestamp(calendar7);
    java.lang.String str9 = fTPFile0.getLink();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    1                         -1 hi!");
    java.lang.String str12 = fTPFile0.getRawListing();
    boolean b13 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------   10                         -1 null"+ "'", str4.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------   10                         -1 null"+ "'", str9.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    int i8 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         97 null"+ "'", str5.equals("?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str13 = fTPFile0.toFormattedString("?---------   10                         -1 ?---------    0          hi!            10 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission(35, (int)(byte)0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         10 null"+ "'", str13.equals("?---------   10                         10 null"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    fTPFile0.setSize(100L);
    long long13 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 100L);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setSize((long)2);
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------   10                         -1 null"+ "'", str4.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   10                         -1 null"+ "'", str8.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setType((int)(byte)10);
    int i15 = fTPFile0.getType();
    java.lang.String str16 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    java.lang.String str3 = fTPFile0.toFormattedString();
    java.util.Calendar calendar4 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)100, (int)(short)0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar4);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   10                         -1 ?---------    0          hi!            10 null");
    fTPFile0.setRawListing("?---------    0          ?---------  100                         -1 null       10 null");
    java.lang.String str16 = fTPFile0.toString();
    java.lang.String str17 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str16.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------   10                         10 null"+ "'", str17.equals("?---------   10                         10 null"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------   10                         -1 null");
    boolean b17 = fTPFile0.isDirectory();
    int i18 = fTPFile0.getType();
    boolean b21 = fTPFile0.hasPermission(1, 0);
    fTPFile0.setRawListing("?---------    0 ?---------   35 d---------    0                         10 null                10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getRawListing();
    fTPFile0.setGroup("?---------   35                         97 null");
    int i15 = fTPFile0.getType();
    fTPFile0.setHardLinkCount(3);
    java.lang.String str18 = fTPFile0.getName();
    java.lang.String str19 = fTPFile0.toFormattedString();
    boolean b20 = fTPFile0.isFile();
    fTPFile0.setSize(10L);
    java.util.Calendar calendar23 = null;
    fTPFile0.setTimestamp(calendar23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "d---------    3          ?---------   35                         97 null       10 null"+ "'", str19.equals("d---------    3          ?---------   35                         97 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    boolean b9 = fTPFile0.isValid();
    int i10 = fTPFile0.getHardLinkCount();
    java.lang.String str11 = fTPFile0.getUser();
    boolean b12 = fTPFile0.isSymbolicLink();
    boolean b13 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    java.lang.String str7 = fTPFile0.toFormattedString();
    java.lang.String str8 = fTPFile0.getUser();
    java.util.Calendar calendar9 = null;
    fTPFile0.setTimestamp(calendar9);
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------    0                         -1 null"+ "'", str7.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    long long5 = fTPFile0.getSize();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isSymbolicLink();
    fTPFile0.setRawListing("?---------   10 ?---------   10                         -1 null                -1 null");
    java.lang.String str11 = fTPFile0.toString();
    int i12 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------   10 ?---------   10                         -1 null                -1 null"+ "'", str11.equals("?---------   10 ?---------   10                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------  100                         -1 null");
    boolean b9 = fTPFile0.isFile();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission((int)(byte)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    java.lang.String str7 = fTPFile0.getUser();
    java.lang.String str9 = fTPFile0.toFormattedString("?---------   -1          ?---------    0                         -1 null       -1 null");
    java.lang.String str10 = fTPFile0.toString();
    boolean b11 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "?---------    0                         -1 null"+ "'", str9.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getName();
    fTPFile0.setLink("");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setLink("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    boolean b8 = fTPFile0.isValid();
    int i9 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                         97 null");
    fTPFile0.setName("?---------    0          hi!            10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    boolean b13 = fTPFile0.isFile();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setSize((long)' ');
    long long17 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 32L);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.util.Calendar calendar4 = null;
    fTPFile0.setTimestamp(calendar4);
    java.lang.String str6 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------    0 ?---------   10                         -1 null d---------    0                         10 null       10 null");
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    boolean b12 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    boolean b5 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(1);
    boolean b8 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setGroup("d---------    0 ?---------   10                         -1 null                10 null");
    boolean b6 = fTPFile0.isFile();
    int i7 = fTPFile0.getHardLinkCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setRawListing("?---------    0                         10 ");
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------   10 ?---------   10          hi!            10 null                -1 null");
    java.lang.String str16 = fTPFile0.getName();
    java.lang.String str17 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b5 = fTPFile0.isFile();
    long long6 = fTPFile0.getSize();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------    0          ?---------    0          hi!            10 null       -1 ?---------   10                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = fTPFile0.hasPermission((int)(short)10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------  100                         -1 null"+ "'", str8.equals("?---------  100                         -1 null"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    java.lang.String str3 = fTPFile0.toString();
    int i4 = fTPFile0.getHardLinkCount();
    java.lang.String str5 = fTPFile0.toString();
    java.util.Calendar calendar6 = null;
    fTPFile0.setTimestamp(calendar6);
    fTPFile0.setRawListing("d---------    0          ?---------    0          hi!            10 null       10 null");
    java.lang.String str10 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    boolean b12 = fTPFile0.isSymbolicLink();
    long long13 = fTPFile0.getSize();
    boolean b14 = fTPFile0.isUnknown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setName("?---------   10 ?---------   10                         -1 null                -1 null");
    boolean b11 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str14 = fTPFile0.toFormattedString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0                         10 ?---------   10 ?---------   10                         -1 null                -1 null"+ "'", str14.equals("d---------    0                         10 ?---------   10 ?---------   10                         -1 null                -1 null"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)'#');
    long long12 = fTPFile0.getSize();
    java.lang.String str13 = fTPFile0.getGroup();
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setRawListing("?---------   10                         -1 null");
    java.lang.String str6 = fTPFile0.toFormattedString();
    boolean b7 = fTPFile0.isUnknown();
    java.lang.String str8 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------   10                         -1 null"+ "'", str6.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------   10                         -1 null"+ "'", str8.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    java.lang.String str6 = fTPFile0.getRawListing();
    fTPFile0.setHardLinkCount((int)'a');
    long long9 = fTPFile0.getSize();
    boolean b10 = fTPFile0.isDirectory();
    fTPFile0.setHardLinkCount((int)(short)10);
    fTPFile0.setHardLinkCount((int)(short)0);
    java.lang.String str16 = fTPFile0.toFormattedString("d---------    0          ?---------    0                         35 null       10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------    0          hi!            10 null"+ "'", str16.equals("?---------    0          hi!            10 null"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    int i4 = fTPFile0.getHardLinkCount();
    boolean b5 = fTPFile0.isDirectory();
    java.lang.String str6 = fTPFile0.toString();
    fTPFile0.setSize((long)2);
    java.lang.String str9 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isValid();
    boolean b8 = fTPFile0.isDirectory();
    boolean b9 = fTPFile0.isUnknown();
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str12 = fTPFile0.getLink();
    fTPFile0.setType((int)(short)100);
    fTPFile0.setGroup("?---------    0                         10 null");
    fTPFile0.setLink("d---------    0          ?---------    0                         10        10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setGroup("");
    fTPFile0.setLink("?---------    0          hi!            97 null");
    fTPFile0.setLink("?---------    1                         -1 hi!");
    fTPFile0.setRawListing("?-w-------   10                         -1 null");
    boolean b17 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    boolean b10 = fTPFile0.isValid();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    fTPFile0.setRawListing("?---------    0                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    java.lang.String str6 = fTPFile0.getUser();
    fTPFile0.setName("hi!");
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setType(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0          hi!            10 null"+ "'", str6.equals("?---------    0          hi!            10 null"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setGroup("");
    fTPFile0.setLink("?---------    0          hi!            97 null");
    fTPFile0.setLink("?---------    1                         -1 hi!");
    fTPFile0.setGroup("?---------   10 ?---------    0          hi!            10 null                -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    long long6 = fTPFile0.getSize();
    java.lang.String str7 = fTPFile0.getName();
    boolean b8 = fTPFile0.isValid();
    fTPFile0.setGroup("");
    fTPFile0.setType((int)(byte)-1);
    fTPFile0.setName("----------   35                         -1 ?---------    0                         97 null");
    java.lang.String str15 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "----------   35                         -1 ?---------    0                         97 null"+ "'", str15.equals("----------   35                         -1 ?---------    0                         97 null"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isValid();
    boolean b3 = fTPFile0.isValid();
    java.lang.String str4 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    fTPFile0.setGroup("?---------  100                         -1 null");
    java.lang.String str8 = fTPFile0.getRawListing();
    long long9 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b5 = fTPFile0.isFile();
    java.lang.String str6 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    long long4 = fTPFile0.getSize();
    fTPFile0.setLink("d---------    0                         -1 null");
    boolean b7 = fTPFile0.isDirectory();
    fTPFile0.setLink("?---------    0                         35 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    long long4 = fTPFile0.getSize();
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isSymbolicLink();
    java.lang.String str7 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str7 = fTPFile0.getLink();
    boolean b8 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setSize((long)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setName("?---------    0          hi!            10 null");
    java.util.Calendar calendar16 = fTPFile0.getTimestamp();
    java.lang.String str17 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b9 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.getLink();
    java.lang.String str10 = fTPFile0.toFormattedString("d---------    0          ?---------  100                          0 null        1 ?---------    0                         -1 ?---------   10                         -1 null");
    fTPFile0.setHardLinkCount((int)(byte)0);
    fTPFile0.setType((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0          hi!            10 null"+ "'", str10.equals("?---------    0          hi!            10 null"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b4 = fTPFile0.hasPermission((int)(byte)1, (int)(short)1);
    java.lang.String str6 = fTPFile0.toFormattedString("?---------   10                         -1 null");
    fTPFile0.setGroup("hi!");
    fTPFile0.setLink("?---------    0          hi!            10 null");
    fTPFile0.setHardLinkCount((int)'4');
    fTPFile0.setGroup("?---------    0 d---------    0 ?---------   10                         -1 null                10 null                -1 ");
    fTPFile0.setRawListing("?---------   10 ?---------   10 ?---------   10                         -1 null                -1 null                -1 null");
    int i17 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "?---------    0                         -1 null"+ "'", str6.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setHardLinkCount(2);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    java.lang.String str11 = fTPFile0.toFormattedString();
    boolean b12 = fTPFile0.isValid();
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0                         -1 ");
    fTPFile0.setSize((long)10);
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 "+ "'", str11.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0                         10 "+ "'", str14.equals("d---------    0                         10 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    boolean b3 = fTPFile0.isDirectory();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setLink("?---------    0                         -1 ?---------    0                         -1 null");
    java.lang.String str8 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getName();
    long long14 = fTPFile0.getSize();
    boolean b15 = fTPFile0.isFile();
    java.lang.String str17 = fTPFile0.toFormattedString("?---------    0                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "d---------    0                         10 null"+ "'", str17.equals("d---------    0                         10 null"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setRawListing("d---------    0                         10 ");
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    fTPFile0.setHardLinkCount(3);
    java.lang.String str18 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setName("");
    boolean b3 = fTPFile0.isDirectory();
    int i4 = fTPFile0.getType();
    java.lang.String str5 = fTPFile0.getRawListing();
    fTPFile0.setGroup("d---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = fTPFile0.hasPermission((int)'a', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setSize((-1L));
    fTPFile0.setName("?---------    0          hi!            97 null");
    java.lang.String str12 = fTPFile0.getGroup();
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    fTPFile0.setUser("?---------   10                         -1 null");
    java.lang.String str12 = fTPFile0.toFormattedString("hi!");
    boolean b13 = fTPFile0.isSymbolicLink();
    java.util.Calendar calendar14 = null;
    fTPFile0.setTimestamp(calendar14);
    java.lang.String str16 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "d---------    0 ?---------   10                         -1 null                10 null"+ "'", str12.equals("d---------    0 ?---------   10                         -1 null                10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "?---------   10                         -1 null"+ "'", str16.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    java.lang.String str6 = fTPFile0.toString();
    boolean b9 = fTPFile0.hasPermission(2, 1);
    boolean b10 = fTPFile0.isFile();
    fTPFile0.setSize((long)100);
    fTPFile0.setType((-1));
    fTPFile0.setGroup("?---------    0 ?---------    0                         10 null                10 d---------    0                         10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    java.lang.String str10 = fTPFile0.toFormattedString();
    boolean b11 = fTPFile0.isDirectory();
    boolean b12 = fTPFile0.isDirectory();
    fTPFile0.setName("?---------    0          hi!            97 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "d---------    0                         10 null"+ "'", str10.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setGroup("d---------    0 ?---------   10                         -1 null                10 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)(byte)0, (-1), false);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    fTPFile0.setUser("d---------    0                         10 ");
    java.lang.String str8 = fTPFile0.getGroup();
    boolean b9 = fTPFile0.isDirectory();
    fTPFile0.setGroup("?---------    0          hi!             1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    fTPFile0.setName("d---------    0                         10 null");
    java.lang.String str7 = fTPFile0.getLink();
    java.lang.String str8 = fTPFile0.getRawListing();
    fTPFile0.setName("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    java.util.Calendar calendar10 = null;
    fTPFile0.setTimestamp(calendar10);
    java.lang.String str12 = fTPFile0.getName();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    fTPFile0.setUser("?---------    0                         -1 ?---------   10                         -1 null");
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    java.lang.String str18 = fTPFile0.toFormattedString();
    java.lang.String str19 = fTPFile0.toFormattedString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "?---------   10                         -1 null"+ "'", str13.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------   10                         -1 null"+ "'", str14.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "?---------   10 ?---------    0                         -1 ?---------   10                         -1 null                -1 null"+ "'", str18.equals("?---------   10 ?---------    0                         -1 ?---------   10                         -1 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------   10 ?---------    0                         -1 ?---------   10                         -1 null                -1 null"+ "'", str19.equals("?---------   10 ?---------    0                         -1 ?---------   10                         -1 null                -1 null"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isValid();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setType((int)(byte)10);
    int i10 = fTPFile0.getHardLinkCount();
    java.util.Calendar calendar11 = fTPFile0.getTimestamp();
    java.lang.String str12 = fTPFile0.getGroup();
    boolean b13 = fTPFile0.isValid();
    boolean b14 = fTPFile0.isSymbolicLink();
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         97 null"+ "'", str5.equals("?---------    0                         97 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    java.lang.String str8 = fTPFile0.getRawListing();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setHardLinkCount((int)'#');
    java.lang.String str12 = fTPFile0.getGroup();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(byte)10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getUser();
    fTPFile0.setSize((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    boolean b15 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setSize((long)(short)-1);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setName("?---------    0                         -1 ?---------   10                         -1 null");
    fTPFile0.setLink("?---------  100                          0 null");
    fTPFile0.setUser("?---------   10 ?---------   10                         -1 null                -1 null");
    fTPFile0.setUser("?---------    0 ?---------   10          hi!            10 null                10 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isSymbolicLink();
    long long11 = fTPFile0.getSize();
    java.lang.String str12 = fTPFile0.getGroup();
    fTPFile0.setType((int)(byte)10);
    int i15 = fTPFile0.getType();
    java.lang.String str17 = fTPFile0.toFormattedString("d---------   10                         -1 ?---------  100                         -1 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------   10                         -1 null"+ "'", str17.equals("?---------   10                         -1 null"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getLink();
    fTPFile0.setUser("d---------    0 ?---------   10                         -1 null                10 null");
    boolean b13 = fTPFile0.isValid();
    long long14 = fTPFile0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 10L);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    int i7 = fTPFile0.getHardLinkCount();
    boolean b8 = fTPFile0.isDirectory();
    boolean b11 = fTPFile0.hasPermission((int)(short)1, (int)(byte)1);
    java.lang.String str12 = fTPFile0.getLink();
    java.lang.String str13 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str7 = fTPFile0.toFormattedString("hi!");
    fTPFile0.setLink("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    java.lang.String str12 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str13 = fTPFile0.toString();
    fTPFile0.setName("?---------    0          hi!            10 null");
    boolean b16 = fTPFile0.isDirectory();
    java.lang.String str17 = fTPFile0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "?---------   10                         -1 null"+ "'", str7.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10                         -1 null"+ "'", str12.equals("?---------   10                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str11 = fTPFile0.getRawListing();
    java.lang.String str12 = fTPFile0.toString();
    java.lang.String str13 = fTPFile0.getUser();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fTPFile0.hasPermission(2, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                         -1 null"+ "'", str11.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------    0                         -1 null"+ "'", str12.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d---------    0                         10 null"+ "'", str13.equals("d---------    0                         10 null"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    java.lang.String str9 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.toFormattedString("?---------    0          hi!            10 null");
    java.lang.String str12 = fTPFile0.getLink();
    java.lang.String str13 = fTPFile0.getLink();
    java.lang.String str14 = fTPFile0.getLink();
    java.lang.String str15 = fTPFile0.getName();
    fTPFile0.setRawListing("d---------    0          ?---------  100                          0 null        1 ?---------    0                         -1 ?---------   10                         -1 null");
    fTPFile0.setUser("?---------   10                         10 null");
    boolean b20 = fTPFile0.isUnknown();
    fTPFile0.setGroup("d---------   10                         10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "d---------    0                         10 null"+ "'", str11.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getName();
    fTPFile0.setName("?---------    0          ?---------    0                         10        -1 null");
    fTPFile0.setUser("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.toString();
    int i8 = fTPFile0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    boolean b3 = fTPFile0.isFile();
    fTPFile0.setLink("?---------   10                         -1 null");
    java.lang.String str6 = fTPFile0.getGroup();
    java.lang.String str7 = fTPFile0.getUser();
    boolean b8 = fTPFile0.isSymbolicLink();
    java.lang.String str9 = fTPFile0.getRawListing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    java.util.Calendar calendar13 = null;
    fTPFile0.setTimestamp(calendar13);
    boolean b15 = fTPFile0.isUnknown();
    boolean b16 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setSize((long)'a');
    fTPFile0.setHardLinkCount((int)'#');
    int i7 = fTPFile0.getType();
    fTPFile0.setGroup("d---------    0                         10 null");
    boolean b10 = fTPFile0.isFile();
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    boolean b5 = fTPFile0.isFile();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setType((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setLink("d---------    0 d---------    0                         10 null ?---------    0          hi!            10 null       10 null");
    fTPFile0.setRawListing("");
    fTPFile0.setUser("?---------  100                          0 null");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fTPFile0.hasPermission((int)(short)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    java.util.Calendar calendar6 = fTPFile0.getTimestamp();
    boolean b7 = fTPFile0.isSymbolicLink();
    java.lang.String str8 = fTPFile0.toString();
    fTPFile0.setType(1);
    fTPFile0.setRawListing("?---------    0                         10 ");
    boolean b13 = fTPFile0.isSymbolicLink();
    fTPFile0.setGroup("?---------   10 ?---------   10          hi!            10 null                -1 null");
    java.lang.String str16 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    long long2 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)100);
    fTPFile0.setUser("d---------    0                         10 null");
    fTPFile0.setSize((long)(short)10);
    fTPFile0.setRawListing("?---------    0                         -1 null");
    // The following exception was thrown during execution in test generation
    try {
    fTPFile0.setPermission((int)'4', 0, true);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    boolean b5 = fTPFile0.isValid();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, 1);
    fTPFile0.setSize((long)'a');
    fTPFile0.setRawListing("?---------    0                         -1 null");
    java.lang.String str13 = fTPFile0.getName();
    boolean b14 = fTPFile0.isFile();
    fTPFile0.setGroup("?---------   10                         -1 ?---------    0          hi!            10 null");
    fTPFile0.setName("----------   10                         -1 null");
    boolean b19 = fTPFile0.isValid();
    boolean b22 = fTPFile0.hasPermission(1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    long long3 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(byte)0);
    boolean b6 = fTPFile0.isSymbolicLink();
    boolean b7 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)(short)100);
    java.lang.String str11 = fTPFile0.toFormattedString("d---------    0 ?---------   10                         -1 null                10 null");
    int i12 = fTPFile0.getType();
    fTPFile0.setSize(100L);
    java.lang.String str15 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "?---------    0                        100 null"+ "'", str11.equals("?---------    0                        100 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setGroup("hi!");
    java.lang.String str5 = fTPFile0.toFormattedString();
    boolean b6 = fTPFile0.isDirectory();
    java.util.Calendar calendar7 = fTPFile0.getTimestamp();
    fTPFile0.setGroup("?---------   10                         -1 null");
    boolean b10 = fTPFile0.isFile();
    boolean b11 = fTPFile0.isUnknown();
    boolean b12 = fTPFile0.isFile();
    java.lang.String str13 = fTPFile0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0          hi!            10 null"+ "'", str5.equals("?---------    0          hi!            10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    fTPFile0.setUser("?---------    0          ?---------  100                         -1 null       10 null");
    fTPFile0.setType(52);
    boolean b15 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    int i8 = fTPFile0.getHardLinkCount();
    fTPFile0.setName("?---------   10                         10 null");
    java.util.Calendar calendar11 = null;
    fTPFile0.setTimestamp(calendar11);
    java.lang.String str14 = fTPFile0.toFormattedString("?---------    0 ?---------    0                         10                 10 null");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "?---------    0          ?---------    0                         -1 null       -1 ?---------   10                         10 null"+ "'", str14.equals("?---------    0          ?---------    0                         -1 null       -1 ?---------   10                         10 null"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    fTPFile0.setHardLinkCount((int)'4');
    java.lang.String str10 = fTPFile0.toString();
    fTPFile0.setName("?---------  100                          0 null");
    fTPFile0.setSize((long)2);
    java.util.Calendar calendar15 = fTPFile0.getTimestamp();
    boolean b16 = fTPFile0.isSymbolicLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setRawListing("hi!");
    boolean b5 = fTPFile0.isSymbolicLink();
    boolean b6 = fTPFile0.isFile();
    fTPFile0.setSize((long)(byte)10);
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str11 = fTPFile0.getRawListing();
    fTPFile0.setLink("?---------   10                         -1 ?---------    0          hi!            10 null");
    fTPFile0.setRawListing("?---------    0          ?---------  100                         -1 null       10 null");
    java.util.Calendar calendar16 = fTPFile0.getTimestamp();
    java.lang.String str17 = fTPFile0.getRawListing();
    boolean b18 = fTPFile0.isUnknown();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = fTPFile0.hasPermission((int)(short)1, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "?---------    0          ?---------  100                         -1 null       10 null"+ "'", str17.equals("?---------    0          ?---------  100                         -1 null       10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    java.lang.String str5 = fTPFile0.getLink();
    boolean b8 = fTPFile0.hasPermission((int)(short)0, (int)(byte)1);
    long long9 = fTPFile0.getSize();
    java.lang.String str10 = fTPFile0.getUser();
    java.lang.String str11 = fTPFile0.getLink();
    java.lang.String str12 = fTPFile0.getName();
    boolean b13 = fTPFile0.isSymbolicLink();
    java.lang.String str14 = fTPFile0.toFormattedString();
    java.lang.String str15 = fTPFile0.toString();
    java.lang.String str16 = fTPFile0.getGroup();
    java.util.Calendar calendar17 = fTPFile0.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "d---------    0                         10 null"+ "'", str14.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar17);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    boolean b6 = fTPFile0.isValid();
    java.lang.String str7 = fTPFile0.toString();
    fTPFile0.setRawListing("?---------    0                          0 null");
    fTPFile0.setUser("?---------   10          hi!            10 null");
    java.lang.String str12 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "?---------   10          hi!            10 null"+ "'", str12.equals("?---------   10          hi!            10 null"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setName("");
    boolean b6 = fTPFile0.isValid();
    fTPFile0.setHardLinkCount(3);
    java.lang.String str9 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toFormattedString("");
    java.lang.String str5 = fTPFile0.toFormattedString("hi!");
    boolean b6 = fTPFile0.isUnknown();
    fTPFile0.setSize((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "?---------    0                         -1 null"+ "'", str3.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "?---------    0                         -1 null"+ "'", str5.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.util.Calendar calendar3 = null;
    fTPFile0.setTimestamp(calendar3);
    int i5 = fTPFile0.getHardLinkCount();
    fTPFile0.setHardLinkCount(100);
    java.lang.String str8 = fTPFile0.toString();
    java.lang.String str9 = fTPFile0.getLink();
    fTPFile0.setLink("?---------    0          d---------    0                         10        -1 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    fTPFile0.setSize((long)(byte)1);
    fTPFile0.setSize((long)(byte)100);
    java.lang.String str9 = fTPFile0.getRawListing();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fTPFile0.hasPermission((int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    java.lang.String str2 = fTPFile0.getGroup();
    fTPFile0.setGroup("?---------    0                         -1 null");
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setRawListing("hi!");
    fTPFile0.setHardLinkCount((int)(byte)-1);
    java.lang.String str10 = fTPFile0.getGroup();
    int i11 = fTPFile0.getType();
    boolean b12 = fTPFile0.isUnknown();
    java.util.Calendar calendar13 = fTPFile0.getTimestamp();
    java.lang.String str14 = fTPFile0.getRawListing();
    java.lang.String str15 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "?---------    0                         -1 null"+ "'", str10.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(calendar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.toString();
    fTPFile0.setUser("?---------    0          hi!            10 null");
    boolean b6 = fTPFile0.isValid();
    java.lang.String str8 = fTPFile0.toFormattedString("?---------  100                          0 null");
    long long9 = fTPFile0.getSize();
    fTPFile0.setLink("d---------    3          ?---------   35                         97 null       10 null");
    boolean b12 = fTPFile0.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "?---------    0 ?---------    0          hi!            10 null                -1 null"+ "'", str8.equals("?---------    0 ?---------    0          hi!            10 null                -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    boolean b2 = fTPFile0.isDirectory();
    java.lang.String str3 = fTPFile0.getGroup();
    java.lang.String str4 = fTPFile0.getLink();
    fTPFile0.setType((int)(byte)0);
    boolean b7 = fTPFile0.isDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    long long5 = fTPFile0.getSize();
    fTPFile0.setUser("?---------  100                         -1 null");
    java.util.Calendar calendar8 = null;
    fTPFile0.setTimestamp(calendar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    fTPFile0.setLink("");
    java.lang.String str7 = fTPFile0.toFormattedString();
    boolean b8 = fTPFile0.isUnknown();
    java.lang.String str9 = fTPFile0.getName();
    fTPFile0.setSize((long)(short)-1);
    boolean b12 = fTPFile0.isUnknown();
    fTPFile0.setLink("");
    fTPFile0.setUser("?---------   10          hi!            10 null");
    fTPFile0.setGroup("?---------    0          hi!            10 null");
    java.lang.String str19 = fTPFile0.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d---------    0                         10 null"+ "'", str7.equals("d---------    0                         10 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "?---------   10          hi!            10 null"+ "'", str19.equals("?---------   10          hi!            10 null"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }


    FTPFile fTPFile0 = new FTPFile();
    boolean b1 = fTPFile0.isValid();
    boolean b2 = fTPFile0.isValid();
    java.lang.String str3 = fTPFile0.getRawListing();
    java.lang.String str4 = fTPFile0.toFormattedString();
    java.lang.String str5 = fTPFile0.getUser();
    fTPFile0.setSize((long)(byte)-1);
    fTPFile0.setType((int)(byte)100);
    java.lang.String str10 = fTPFile0.getName();
    java.lang.String str11 = fTPFile0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "?---------    0                         -1 null"+ "'", str4.equals("?---------    0                         -1 null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }


    FTPFile fTPFile0 = new FTPFile();
    long long1 = fTPFile0.getSize();
    fTPFile0.setHardLinkCount((int)(short)10);
    java.lang.String str4 = fTPFile0.getUser();
    java.lang.String str5 = fTPFile0.toString();
    java.lang.String str6 = fTPFile0.getName();
    fTPFile0.setGroup("d---------    3          ?---------   35                         97 null       10 null");
    boolean b9 = fTPFile0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }


    FTPFile fTPFile0 = new FTPFile();
    fTPFile0.setSize(10L);
    fTPFile0.setType((int)(byte)1);
    int i5 = fTPFile0.getHardLinkCount();
    int i6 = fTPFile0.getType();
    int i7 = fTPFile0.getHardLinkCount();
    java.lang.String str8 = fTPFile0.getLink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

}
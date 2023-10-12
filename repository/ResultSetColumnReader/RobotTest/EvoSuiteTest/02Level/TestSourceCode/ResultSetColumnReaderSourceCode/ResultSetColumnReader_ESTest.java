/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 00:27:06 GMT 2023
 */

package ResultSetColumnReaderSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ResultSetColumnReaderSourceCode.ResultSetColumnReader;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Time;
import java.sql.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResultSetColumnReader_ESTest extends ResultSetColumnReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn((Timestamp) null).when(resultSet0).getTimestamp(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getTimeStamp((-1070));
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn((Time) null).when(resultSet0).getTime(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getTime((-1236));
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      Time time0 = mock(Time.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(time0).toString();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(time0).when(resultSet0).getTime(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getTime((-3));
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn("").when(resultSet0).getString(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getString(1944);
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn((String) null).when(resultSet0).getString(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getString(16);
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-4862)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.ResultSetMetaData$MockitoMock$1939060787@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-6)).when(resultSetMetaData0).getColumnType(anyInt());
      Byte byte0 = new Byte((byte) (-4));
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(byte0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getLong((-1));
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-5)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-2)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-1856), (-4)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0, resultSetMetaData0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getBoolean((-454));
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong((-454));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.ResultSetMetaData$MockitoMock$1939060787@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnType(anyInt());
      Boolean boolean0 = Boolean.FALSE;
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(boolean0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong((-3));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.Boolean@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getLong(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"codegen.java.sql.Date$MockitoMock$1369864259@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-3)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet1).getMetaData();
      doReturn(resultSetColumnReader0).when(resultSet1).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader1 = new ResultSetColumnReader(resultSet1);
      // Undeclared exception!
      try { 
        resultSetColumnReader1.getLong(0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ResultSetColumnReaderSourceCode.ResultSetColumnReader@0000000001\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnType(anyInt());
      Double double0 = new Double((-703.0));
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Date) null, double0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getDouble((-456));
      resultSetColumnReader0.getLong(16);
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn((Object) null).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getLong(16);
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(resultSetMetaData0).toString();
      doReturn(6).when(resultSetMetaData0).getColumnType(anyInt());
      Float float0 = new Float(4968.42991060893);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0, float0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getObject(4316);
      resultSetColumnReader0.getDouble((-1));
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      // Undeclared exception!
      try { 
        resultSetColumnReader0.getDouble((-1));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet1).getMetaData();
      doReturn((Date) null, (Object) null, resultSetColumnReader0).when(resultSet1).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader1 = new ResultSetColumnReader(resultSet1);
      resultSetColumnReader1.getObject((-543));
      resultSetColumnReader1.getBoolean(0);
      // Undeclared exception!
      try { 
        resultSetColumnReader1.getDouble(0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(date0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getDouble((-58));
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(resultSetMetaData0).toString();
      doReturn((-7)).when(resultSetMetaData0).getColumnType(anyInt());
      Boolean boolean0 = Boolean.valueOf("ResultSetColumnReaderSourceCode.ResultSetColumnReader");
      Boolean.valueOf("ResultSetColumnReaderSourceCode.ResultSetColumnReader");
      Time time0 = mock(Time.class, new ViolatedAssumptionAnswer());
      Timestamp timestamp0 = mock(Timestamp.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(timestamp0).toString();
      Timestamp timestamp1 = mock(Timestamp.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(timestamp1).toString();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0, boolean0, (Object) null, (Object) null).when(resultSet0).getObject(anyInt());
      doReturn(timestamp0, timestamp1).when(resultSet0).getTimestamp(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getObject(280);
      resultSetColumnReader0.getLong(3044);
      resultSetColumnReader0.getObject(0);
      resultSetColumnReader0.getTimeStamp(0);
      resultSetColumnReader0.getTimeStamp((-1));
      resultSetColumnReader0.getDouble((-2087));
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Date) null).when(resultSet0).getDate(anyInt());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getDate((-1236));
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(date0).toString();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(date0).when(resultSet0).getDate(anyInt());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getDate((-622));
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-7), (-7), (-7)).when(resultSetMetaData0).getColumnType(anyInt());
      Boolean boolean0 = Boolean.TRUE;
      Float float0 = new Float((double) (-7));
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(boolean0, resultSetMetaData0, float0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      Long long0 = resultSetColumnReader0.getLong((-7));
      assertEquals(0L, (long)long0);
      
      resultSetColumnReader0.getBoolean(2111);
      Boolean boolean1 = resultSetColumnReader0.getBoolean((-1207));
      assertFalse(resultSetColumnReader0.wasNull());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-7)).when(resultSetMetaData0).getColumnType(anyInt());
      Boolean boolean0 = Boolean.FALSE;
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(boolean0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getBoolean(2111);
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(16).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(resultSetMetaData0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getBoolean((-454));
      assertFalse(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnType(anyInt());
      Integer integer0 = new Integer(0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(integer0).when(resultSet0).getObject(anyInt());
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      resultSetColumnReader0.getBoolean(16);
      assertTrue(resultSetColumnReader0.wasNull());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResultSetColumnReader resultSetColumnReader0 = null;
      try {
        resultSetColumnReader0 = new ResultSetColumnReader((ResultSet) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ResultSet == null
         //
         verifyException("ResultSetColumnReaderSourceCode.ResultSetColumnReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      boolean boolean0 = resultSetColumnReader0.wasNull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      ResultSetColumnReader resultSetColumnReader0 = new ResultSetColumnReader(resultSet0);
      boolean boolean0 = resultSetColumnReader0.next();
      assertFalse(boolean0);
  }
}

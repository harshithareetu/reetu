package com.hexaware.MLP204.model;

import com.hexaware.MLP204.persistence.EmployeeDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;

// import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * Test class for Employee.
 */
@RunWith(JMockit.class)
public class EmployeeTest {
  Employee e;

  /**
   * setup method.
   */
  @Before
  public void initInput() {
    e = new Employee();
  }

  @After
  public void destroyObject() {
    e = null;
  }

  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  
  
  public final void testEmployee() throws ParseException{
    
    
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
    final Date doj1 = sdf.parse("1994-03-11");
    final Date doj2 = sdf.parse("1996-02-01");
    Employee emp= new Employee("stuti","gunjan",1000,"stuti@gmail.com",1236547896,"tvh padur","developer","B+",10,doj1, "harshitha","reetu","coder",001);
    assertEquals(1000,emp.getDept_id(),1);
    Employee emp1= new Employee("stuti","gunjan",1000,"stuti@gmail.com",1236547896,"tvh padur","developer","B+",10,doj1, "harshitha","reetu","coder",001);
    
    Employee emp3 = new Employee("gowtham","krishnal",1001,"gowtham@gmail.com",1236527896,"sholingnalur","developer","A+",10,doj2,"harshitha","reetu","coder",001);
    Employee emp4 = new Employee("stuti","gunjan",1000,"stuti@gmail.com",1236547896,"tvh padur","developer","B+",10,doj1, "harshitha","reetu","coder",001);
    assertNotEquals(emp1,emp3 );
    
    assertEquals(emp1, emp4);

    assertNotEquals(emp1.hashCode(), emp3.hashCode());
    
    assertEquals(emp1.hashCode(), emp4.hashCode());
   
   
   
  }



// default constructor
@Test
public void testEmployeeDefault() {
  Employee newEmployee = new Employee();
  assertEquals("hashcode", newEmployee.hashCode(), new Employee().hashCode());
}


//parameterized constructor

@Test
public void testemp() {
  Employee employee = new Employee("gowtham","krishnal",1001,"gowtham@gmail.com",1236527896,"sholingnalur","developer","A+",10,"1996-02-01","harshitha","reetu","coder",001);
  assertEquals(1001, e.getEmpId(), 1001);
}


// setters

@Test
public void testEmployeeSetters() {
  e = new Employee();
  e.setFirst_name("harshitha");
  e.setEmpId(1005);
  assertEquals("harshitha", e.getFirst_name());
}












  /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListAllEmpty(@Mocked final EmployeeDAO dao) {
    new Expectations() {
      {
        dao.list(); result = new ArrayList<Employee>();
      }
    };
    new MockUp<Employee>() {
      @Mock
      EmployeeDAO dao() {
        return dao;
      }
    };
    Employee[] es = Employee.listAll();
    assertEquals(0, es.length);
  }

  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */
}
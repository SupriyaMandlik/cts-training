package com.cts.training.tests;

import static org.junit.Assert.*;


import org.junit.BeforeClass;

import org.junit.Test;
import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeUnitTest {
	private static EmployeeDAO employeeDAO;
private static Employee employee;
	
	@BeforeClass
	public static void init() {
		employee=new Employee();
		employeeDAO=new EmployeeDAOImpl();
	}
	/*@Test
	public void test_add_employee_success() {
		Employee employee=new Employee(9,"Sammy","Mumbai","Software Programmer",22,45474,54452452);
		assertEquals(true,employeeDAO.saveEmployee(employee));
	}
	
/*	@Test
		public void get_employee_by_id_success() 
		{
			Employee emp=employeeDAO.getEmployeeById(1);	
			assertEquals("supriya",emp.getName());
		}
      @Test
      public void get_all_employee_success()
      {
    	  List<Employee> emp=employeeDAO.getAllEmployees();
    	  assertEquals("sam", emp.get(1).getName());
      }
     @Test
      public void test_update_employee_success() {
    	  Employee emp =employeeDAO.getEmployeeById(8);
    	  emp.setName("raju");
    	  employeeDAO.updateEmployee(emp);
    		assertEquals("raju",emp.getName());
      }
     @Test
     public void test_delete_employee_success() {
    	 Employee emp=employeeDAO.getEmployeeById(133);
    	 employeeDAO.deleteEmployee(emp);
    	 assertEquals(true,employeeDAO.deleteEmployee(employee));
     }*/
     
	@Test (expected=MySQLIntegrityViolationException.class)
    public void test_add_employee_fail() {
 	Employee employee=new Employee(9,"Sammy","Mumbai","Software Programmer",22,45474,54452452);
     assertEquals(true,employeeDAO.saveEmployee(employee));
	}
}


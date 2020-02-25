package com.cts.training.controller;

import java.util.List;
import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;


public class EmployeeController {

	public static void main(String[] args) {
		
	EmployeeDAO empObj=new EmployeeDAOImpl();
	//Employee employee=new Employee(4,"sam","Bhopal","s.e.",23,54434,56465);
	//empObj.saveEmployee(employee);
	// List<Employee> list=empObj.getAllEmployees();
   //  list.forEach(System.out::println);
	
	Employee emp=empObj.getEmployeeById(4);
	System.out.println(emp);	
	}
	
}


	
	



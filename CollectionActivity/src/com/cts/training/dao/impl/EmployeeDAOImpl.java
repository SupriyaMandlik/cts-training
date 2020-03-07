package com.cts.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee1;



public class EmployeeDAOImpl {
	static ArrayList<Employee1> employees = null;

	static {
		employees = new ArrayList<>();
		Employee1 emp1 = new Employee1(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
		Employee1 emp2 = new Employee1(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
		Employee1 emp3 = new Employee1(9987, "Sakshi", "Indore", "Test Engineer", 19, 19889.80, 979879798L);
		Employee1 emp4 = new Employee1(1234, "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
	}
	
	
	

	public void addEmployee(Employee1 employee) {
		employees.add(employee);
	}

	public void updateEmployee(Employee1 employee) {
		employees.set(employees.indexOf(employee), employee);
		
	}

	public Employee1 getEmployeeById(int id) {
		for(Employee1 emp:employees)
			if(emp.getId()== id)
				
			{
				return (emp);
			}
		return null;
	}
	public void deleteEmployee(int id) {
		for(Employee1 emp:employees) {
			if(emp.getId()== id)
				
			{
				employees.remove(emp);
			}
	}
	}
	
	
	public List<Employee1> getAllEmployees() {
		return employees;
	}
	 

}

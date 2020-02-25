package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
        Employee e=empObj.getEmployeeById(4234);
        e.setName("ram");
        empObj.updateEmployee(e);
        List<Employee> list=empObj.getAllEmployees();
        list.forEach(System.out::println);
		
		//empObj.addEmployee(emp);
		//empObj.deleteEmployee(111);
	    // empObj.updateEmployee(e);
		//System.out.println(empObj.getEmployeeById(111));
		
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.print("\nThe Choices:\n1>Add Employee\n2>Update Employee\n3>Remove Employee\n4>Get Employee By Id\n5>Display all employee\n6>Exit\n");
	System.out.println("Enter the choice: ");
	int num=sc.nextInt();
	if(num == -1)
	{
	break;
	}
	switch(num)
	{
	case 1:
	{
	System.out.print("\nId: ");
	int id=sc.nextInt();
	System.out.print("\nName: ");
	String name=sc.next();
	System.out.print("\nAddress: ");
	String address=sc.next();
	System.out.print("\nDesignation: ");
	String designation=sc.next();
	System.out.print("\nAge: ");
	int age=sc.nextInt();
	System.out.print("\nsalary: ");
	double Salary=sc.nextDouble();
	System.out.print("\nPhone: ");
	long phone=sc.nextLong();
	Employee emp1=new Employee(id,name,address,designation,
	age,Salary,phone);
	empObj.addEmployee(emp);
	}
	case 2:
	{
		
	}
	case 3:
	{
		
	}
	case 4:
	{
		
	}
	case 5:
	{
		
	}
	case 6:
	{
		
	}

	}
	}
	}
}


	
	



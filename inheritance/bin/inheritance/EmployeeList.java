package inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<>();
	    addEmployees(list);
		Collections.sort(list,new SortById());
		 
		Collections.sort(list,new SortByAge());
	
		Collections.sort(list,new SortByPhone());
	
		Collections.sort(list,new SortByName());
        for(Employee emp:list) {
 
	 System.out.println(emp);
 }
	 
	}

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1=new Employee(4234,"Supriya","Mumbai","Developer",20,4546.4,876745L);
		Employee emp2=new Employee(3247,"Neha","Pune","Software Engineer",21,21123.4,876745L);
	   Employee emp3=new Employee(1234,"Aayushi","Mumbai","Test Engineer",19,455546.4,4754415L);
	   Employee emp4=new Employee(5084,"Aarti","Banglore","Jr Engineer",16,5744.4,775445L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}

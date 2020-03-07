package com.cts.training.stream;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeStream {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		
		addEmployees(employees);
		
		//1.Employees with age greater than 20
		
		List<Employee> ageFilter = employees.stream().filter(e -> e.getAge()>20).collect(Collectors.toList());
		System.out.println("*******Employees with age greater than 20:*******");
		ageFilter.forEach(System.out::println);
		
		//2. Employees with names starting with N
		List <Employee> nameFilter= employees.stream().filter(e-> e.getName().startsWith("N")).collect(Collectors.toList());
		System.out.println(" *******Employees with names starting with N:******* ");
		nameFilter.forEach(System.out::println);
		
		//3. Employess with salary increased by 15%
		
		List<Employee> salaryrise = employees.stream().map(e ->{
			e.setSalary(e.getSalary()* 1.15);
			return e;}).collect(Collectors.toList());
		System.out.println("*******Employees with salary increased by 15%*******");
	salaryrise.forEach(System.out::println);
	
	//4. even list
	
	List<Employee> EvenList = employees.stream().map(e -> {
		if( e.getId() %2 == 0) 
			{
			e.setName("Mr" +e.getName());
			}
		else
		{
			e.setName("Ms" +e.getName());
		}
	return e;
	}).collect(Collectors.toList());
	EvenList.forEach(System.out::println);
	
	}
	
	
	private static void addEmployees(ArrayList<Employee> employees) {
		Employee emp1 = new Employee(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
		Employee emp2 = new Employee(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
		Employee emp3 = new Employee(9987, "Sakshi", "Indore", "Test Engineer", 19, 19889.80, 979879798L);
		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
		Employee emp5 = new Employee(8797, "Supriya", "Mumbai", "Tester", 23, 87988.30, 546448787L);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	
	
	}

}

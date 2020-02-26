package com.cts.training.bean;

import java.io.Serializable;

public class Employee1 implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient String address;
	String designation;
	transient int age;
	double salary;
	long phone;

	public Employee1() {
	}

	public Employee1(int id, String name, String address, String designation, int age, double salary, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", designation=" + designation
				+ ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}




}
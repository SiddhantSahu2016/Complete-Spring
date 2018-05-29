/**
 * 
 */
package com.tutorials.spring.AOP.bean;

import org.springframework.stereotype.Component;

/**
 * @author Siddhant sahu
 *
 */
@Component
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, int age, double salary,
			String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

}

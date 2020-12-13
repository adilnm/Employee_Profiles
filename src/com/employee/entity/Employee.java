package com.employee.entity;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String position;
	private String city;
	private String password;

	public Employee(String firstName, String lastName, String position, String city, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.city = city;
		this.password = password;
	}

	public Employee(int id, String firstName, String lastName, String position, String city, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.city = city;
		this.password = password;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", position=" + position
				+ ", city=" + city + ", password=" + password + "]";
	}

}

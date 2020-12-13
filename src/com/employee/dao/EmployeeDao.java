package com.employee.dao;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeDao {
	public boolean employeeRegistration(Employee employee);

	public List<Employee> employeeList();
}

package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.entity.Employee;
import com.employee.utils.DBConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean employeeRegistration(Employee employee) {
		boolean success = false;
		try {
			Connection con = DBConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO employee (FIRST_NAME, LAST_NAME, POSITION, CITY,PASSWORD) VALUES (?,?,?,?,?)");
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getPosition());
			ps.setString(4, employee.getCity());
			ps.setString(5, employee.getPassword());
			int rs = ps.executeUpdate();

			if (rs > 0) {
				success = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public List<Employee> employeeList() {

		List<Employee> employeesList = new ArrayList<Employee>();
		try {
			Connection con = DBConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM employee;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));

				employeesList.add(employee);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeesList;
	}

	@Override
	public boolean employeeDelete(int id) {

		boolean success = false;
		try {
			Connection con = DBConnectionUtil.getConnection();

			PreparedStatement ps = con.prepareStatement("delete FROM  employee WHERE id = ?");

			ps.setInt(1, id);

			int rs = ps.executeUpdate();

			if (rs > 0) {
				success = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return success;
	}

	@Override
	public Employee employeeDetail(int id) {
		Employee employee = null;
		try {
			Connection con = DBConnectionUtil.getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM  employee WHERE id = ?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public boolean employeeUpdate(Employee employee) {

		boolean success = false;
		try {
			Connection con = DBConnectionUtil.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"UPDATE employee SET FIRST_NAME = ?, LAST_NAME = ?, POSITION=?, CITY=?, PASSWORD=? WHERE id = ?");
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getPosition());
			ps.setString(4, employee.getCity());
			ps.setString(5, employee.getPassword());
			ps.setInt(6, employee.getId());

			int rs = ps.executeUpdate();

			if (rs > 0) {
				success = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public Employee employeeLogin(String firstName, String password) {

		Employee employee = null;
		try {
			Connection con = DBConnectionUtil.getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM  employee WHERE first_Name=? and password=?");
			ps.setString(1, firstName);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

}

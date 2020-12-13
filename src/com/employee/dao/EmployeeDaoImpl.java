package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}

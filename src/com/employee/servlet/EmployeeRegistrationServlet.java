package com.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.entity.Employee;

@WebServlet("/register")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean success;
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String position = request.getParameter("position");
		String city = request.getParameter("city");
		String password = request.getParameter("password");

		Employee emp = new Employee(firstName, lastName, position, city, password);

		EmployeeDao dao = new EmployeeDaoImpl();

		success = dao.employeeRegistration(emp);

		if (success) {
			request.setAttribute("message", "You successfully added a new employee");
		} else {
			request.setAttribute("mmessage", "ERROR");
		}

		request.getRequestDispatcher("list").forward(request, response);
	}

}

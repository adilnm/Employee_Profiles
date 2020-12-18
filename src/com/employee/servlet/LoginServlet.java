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

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String password = request.getParameter("password");

		EmployeeDao dao = new EmployeeDaoImpl();

		Employee employee = dao.employeeLogin(firstName, password);

		if (employee != null) {
			request.setAttribute("employee", employee);

			request.getRequestDispatcher("list").forward(request, response);
		} else {
			request.setAttribute("message", "Your name or password is not correct");

			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}

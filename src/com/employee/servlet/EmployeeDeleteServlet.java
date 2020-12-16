package com.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;

@WebServlet("/employeeDelete")
public class EmployeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean success;
		int empId = Integer.parseInt(request.getParameter("employee_id"));

		EmployeeDao dao = new EmployeeDaoImpl();
		success = dao.employeeDelete(empId);

		if (success) {
			request.setAttribute("deleteMessage", "Your selected employee got deleted");
		} else {
			request.setAttribute("deleteMessage", "ERROR");
		}

		request.getRequestDispatcher("list").forward(request, response);
	}

}

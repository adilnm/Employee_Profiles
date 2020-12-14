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

@WebServlet("/employeeDetail")
public class EmployeeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int empId = Integer.parseInt(request.getParameter("employee_id"));
		EmployeeDao dao = new EmployeeDaoImpl();

		Employee employee = dao.employeeDetail(empId);

		request.setAttribute("employee", employee);

		request.getRequestDispatcher("employeeDetail.jsp").forward(request, response);

	}

}

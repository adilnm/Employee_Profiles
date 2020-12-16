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

@WebServlet("/edit")
public class editEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int empId = Integer.parseInt(request.getParameter("employee_id"));
		EmployeeDao dao = new EmployeeDaoImpl();

		Employee employee = dao.employeeDetail(empId);

		request.setAttribute("employee", employee);

		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean success;
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String position = request.getParameter("position");
		String city = request.getParameter("city");
		String password = request.getParameter("password");
		Employee employee = new Employee(id, firstName, lastName, position, city, password);

		EmployeeDao dao = new EmployeeDaoImpl();
		success = dao.employeeUpdate(employee);

		if (success) {
			request.setAttribute("updateMessage", "Your selected employee got updated");
		} else {
			request.setAttribute("updateMessage", "ERROR");
		}

		request.getRequestDispatcher("list").forward(request, response);
	}

}

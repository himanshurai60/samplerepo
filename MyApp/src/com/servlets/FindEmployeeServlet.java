package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.pojo.Employee;

/**
 * Servlet implementation class FindEmployeeServlet
 */
@WebServlet("/showAll")
public class FindEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindEmployeeServlet() {
      
        // TODO Auto-generated constructor stub
    	
    	
    	super();
    	
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAO();
    	List<Employee> list=dao.findAllEmployees();
    	
    	request.setAttribute("employees",list);
    	RequestDispatcher dispatcher=request.getRequestDispatcher("show.jsp");
    	dispatcher.forward(request, response);
    	
	}

}

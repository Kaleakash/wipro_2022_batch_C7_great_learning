package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
				//doGet(request, response);
				PrintWriter pw = response.getWriter();
				// receive the value through forms. 
				
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				
				// Then create the bean class object and set the value which received from a form
				
				Login ll = new Login();
				ll.setEmail(email);
				ll.setPassword(password);
				
				// Create the Service class object and pass the bean class object and base upon the record it will re-direct to specific page 
				LoginService ls = new LoginService();
				String result = ls.checkLoginDetails(ll);
				//pw.println(result);
				RequestDispatcher rd1 = request.getRequestDispatcher("Home");
				RequestDispatcher rd2 = request.getRequestDispatcher("index.jsp");
				if(result.equals("success")) {
					rd1.forward(request, response);   // move to home page 
				}else {
					pw.println("InValid email or password");
					rd2.include(request, response);
				}
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		// receive the value through forms. 
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// Then create the bean class object and set the value which received from a form
		
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		// Create the Service class object and pass the bean class object and base upon the record it will re-direct to specific page 
		LoginService ls = new LoginService();
		String result = ls.createLoginDetals(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		pw.print(result);
		rd1.include(request, response);
				
		
	}

}

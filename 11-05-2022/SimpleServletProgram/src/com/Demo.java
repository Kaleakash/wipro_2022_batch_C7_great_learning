package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome to Servlet PRogram");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to Simple Servlet Program");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");    // using this method we can receive the value from text field. 
		String pass = request.getParameter("password");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2  = request.getRequestDispatcher("index.html");
		
		if(email.equals("raj@gmail.com") && pass.equals("123")) {
			pw.println("successfully login");
			rd1.forward(request, response);     // it will show only output of target page.
		}else {
			pw.println("failure try once again");
			rd2.include(request, response);    // we can see the output of source + target page as a one page. 
		}
	}

}

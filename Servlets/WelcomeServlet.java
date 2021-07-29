package com.ust.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
 name="WelcomeServlet",
 description="Servlet with Annotation",
 urlPatterns={"/WelcomeServlet","/HelloWorld"}
 )
 
public class WelcomeServlet extends HttpServlet {
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Get method of Welcome Servlet");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Post  method of Welcome Servlet");
	}

}

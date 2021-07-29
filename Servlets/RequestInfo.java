package com.ust.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><body><head><title>Request Information Example</title></head>");
	out.println("<h3>Request Information Example</h3>");
	out.println("Method: "+request.getMethod());
	out.println("Request URI:" +request.getRequestURI());
	out.println("Protocol:" +request.getProtocol());
	out.println("PathInfo: "+request.getPathInfo());
	out.println("Remote Address: "+request.getRemoteAddr());
	out.println("</body></html>");
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

package com.ust.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name= "WelcomeServlet1",
		description="Servlet with Annotation",
		initParams= {@WebInitParam(name="param1",value="value1"),
				@WebInitParam(name="param2",value="value2")},
		urlPatterns= {"/WelcomeServlet1","/HelloWorld"}
		
		)
		
public class WelcomeServlet1 extends HttpServlet {
	@Override
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ServletConfig config= getServletConfig();
		Enumeration<String> paramEnumeration= config.getInitParameterNames();
		StringBuffer buffer = new StringBuffer();
		while(paramEnumeration.hasMoreElements())
		{
			String paramName= paramEnumeration.nextElement();
			String paramValue = config.getInitParameter(paramName);
			buffer.append(paramName+"::"+ paramValue);
			buffer.append("<br/>");
			
		}
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println(buffer.toString());
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		doGet(request, response);
	}

}

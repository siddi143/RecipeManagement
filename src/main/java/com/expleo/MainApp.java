package com.expleo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebServlet("/register")
public class MainApp extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("radio");
		String qualification = request.getParameter("qualification");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String pincode = request.getParameter("pin");		
		
		response.sendRedirect("Welcome.jsp"); 
			
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		RegisterDAO registrationDao = (RegisterDAO) context.getBean("registrationDao");		
		     
		Register register = new Register(name, email, password, gender, qualification, address,city, state, pincode);
		System.out.println(register.getName());		
		registrationDao.insert(register);		
		
	}
	
	
}

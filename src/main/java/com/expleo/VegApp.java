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

@WebServlet("/veg")
public class VegApp extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String ingredients = request.getParameter("ingredients");
		String description = request.getParameter("description");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		RegisterDAO registrationDao = (RegisterDAO) context.getBean("registrationDao");		
		     
		Veg veg = new Veg(name,ingredients, description);
		registrationDao.insert1(veg);		
		out.print("data inserted successfully");
	}
	
	
}

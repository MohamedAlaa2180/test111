package test1;

import java.io.*;
import java.util.*;

import javax.security.auth.login.Configuration;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


public class InitSnoop<E> extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		
		out.println("Init Parameters: ");
		Enumeration<E> e= (Enumeration<E>) getInitParameterNames();
		while(e.hasMoreElements()){
			String name = (String) e.nextElement();
			out.println(name + ": " + getInitParameter(name));
		}
	}
	

}

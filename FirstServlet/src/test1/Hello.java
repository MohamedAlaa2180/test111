package test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hello() 
    {
    }
    
    int showMe,max,min,count;
    
   /* public void init(ServletConfig servletconfig)
    	    throws ServletException
    	{
    	    servletconfig = servletconfig;
    	    init();
    	    max = 100;
    		min = 1;
    	    showMe = min + rn.nextInt(max);
    	}
    
    HashMap<String,String> hm=new HashMap<String,String>(); 
    Random rn = new Random();
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String nas = String.valueOf(showMe);
		//System.out.println(showMe);
		hm.put("1234","loka");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user");
		String pass = req.getParameter("password");
		String num = req.getParameter("number");
		int rnum = Integer.parseInt(num);
		if(rnum == showMe){
	     	System.out.println("good");
		}
		else{
			res.sendRedirect("http://localhost:8080/FirstServlet/Login.html");
			count++;
			System.out.println(count);
			if(rnum > showMe)
				System.out.println("greater");
			if(rnum < showMe)
				System.out.println("lower");
		} */
		
		
		/*for(Map.Entry m:hm.entrySet()){  
			  
			if(name.equals(m.getValue()) && pass.equals(m.getKey())){
				System.out.println("eshta");
				out.println("<html>");
				out.println("<body>");
				out.println("<t1>" + "Login Succesfully" + "</t1>");
				out.println("</body>");
				out.println("</html>");
			}
			else
			{
				out.println("<html>");
			    out.println("<body>");
			    out.println("<t1>" + "Login Failed" + "</t1>");
			    out.println("</body>");
			    out.println("</html>");	
			}
		}
			   
		  
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}

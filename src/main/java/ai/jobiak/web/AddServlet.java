package ai.jobiak.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	
	
	
//Cookies
/*	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		Cookie cookie=new Cookie("k",k+"");//Cookie basically belongs to javax.servlet.http package.Cookie is a Class.
									//Integer appends a double quotes is String. 
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
*/
//HttpSession
/*	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		HttpSession session=req.getSession();
		session.setAttribute("k",k);
		res.sendRedirect("sq");
	}
*/
//Calling a servlet from servlet using sendRedirect
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException		//with get request in the method,doGet is Working
	{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//To call the Square Servlet we have two Methods 1)RequestDispatcher 2)Redirect
		res.sendRedirect("sq?k="+k);    //This technique comes under Session Management  //sendRedirect is a method belongs to response object
									   //where we have to transfer data from one servlet to other servlet with the help of three concepts 1)Session
		                              //2)cookies 3)URL Rewritng(used here)
	}

	*/
//Calling a servlet from servlet using RequestDispatcher
/*	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException		//with get request in the method,doGet is Working
	{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		req.setAttribute("k",k);
		//To call the Square Servlet we have two Methods 1)RequestDispatcher 2)Redirect
		RequestDispatcher rd=req.getRequestDispatcher("sq"); //inside Requestdispatcher we write the url of another(square) servlet
		rd.forward(req,res);
	}
*/
	
//	doPost and doGet Methods
	/*
	 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException //with post request in the method,doPost is Working 
	 { 
	  int i=Integer.parseInt(req.getParameter("num1"));
	  int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
	  //System.out.println("Result is "+k); (output prints on console)
	  
	  PrintWriter out=res.getWriter(); 
	  out.println("Result is "+k); //(output prints on browser) 
	  }
	 */
		
	/*
	  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	   {
	  
	  int i=Integer.parseInt(req.getParameter("num1")); 
	  int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
	  //System.out.println("Result is "+k); (output prints on console)
	  
	  PrintWriter out=res.getWriter(); 
	  out.println("Result is "+k);   //(output prints on browser) 
	   }
	 */
}

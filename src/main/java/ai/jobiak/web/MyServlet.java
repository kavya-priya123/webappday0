package ai.jobiak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ServletConfig and ServletContext -->We use these two things to get the Initial values for the Servlet/application
//ServetContext and ServletConfig both are Interfaces
//ServletContext is an object which will be shared by many/all Servlets.
//ServletConfig works with Particular Servlet. In the Servlet tag itself we use ServletConfig.
//If we have five Servlets ,in total we will get five ServletConfig Objects.But we have only one ServletContext Object. 
public class MyServlet extends HttpServlet 
{
	//ServletConfig
	/*protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		out.print("Hi ");
		ServletConfig cg=getServletConfig();  //We are getting this method from httpservlet.Because httpservlet extends GenericServlet
		String str=cg.getInitParameter("name");//getInitParameter is a method which will give the value of an attribute which is specified here.
		out.println(str);
	}*/
	
	//ServletContext
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		out.print("Hi ");
		ServletContext ctx=getServletContext();  //We are getting this method from httpservlet.Because httpservlet extends GenericServlet
		String str=ctx.getInitParameter("name");//getInitParameter is a method which will give the value of an attribute which is specified here.
		String str1=ctx.getInitParameter("Phone");
		out.println(str);
		out.println(str1);
	}
}

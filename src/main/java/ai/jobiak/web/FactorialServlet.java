package ai.jobiak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorialServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int n=Integer.parseInt(req.getParameter("num"));
		int fact=1;
		for(int i=1;i<=n;i++)
		{
				fact=fact*i;
		}
		
		PrintWriter out=res.getWriter();
		out.println("Factorial of the given number is "+fact);
	}
}

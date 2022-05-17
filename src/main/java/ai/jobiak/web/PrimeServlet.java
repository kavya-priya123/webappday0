package ai.jobiak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int n=Integer.parseInt(req.getParameter("num"));
		
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		PrintWriter out=res.getWriter();
		if(count==0)
		out.println("Given number "+ n +" is Prime");
		else
			out.println("Given number "+ n +" is not Prime");
	}
}

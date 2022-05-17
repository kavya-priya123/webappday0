package ai.jobiak.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//Calling a servlet from servlet
public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException		
	{
		
		
		
		//Cookies  -->//ex:- Restaurant
		/*int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);
		*/
		
		//HttpSession  -->to maintain login on your website
		/*HttpSession session=req.getSession();
	
			int k=(int)session.getAttribute("k");
			k=k*k;
			PrintWriter out=res.getWriter();
			out.println("Result is "+k);*/
		//Rewriting url
		/*int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);
		//System.out.println("sq called");*/
		//RequestDispatcher
		/*int k=(int)req.getAttribute("k");
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);*/
		
		/*		PrintWriter out=res.getWriter();
				out.println("Hello to Sq");			*/
	}
}

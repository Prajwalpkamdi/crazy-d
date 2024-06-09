package com.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bo.contact_bo;
import com.dao.contact_dao;

/**
 * Servlet implementation class contact
 */
@WebServlet("/contact")
public class contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String email=request.getParameter("email");
		String feedback=request.getParameter("feedback");
		
		contact_bo bo=new contact_bo(name, number, email, feedback);
		int status=contact_dao.contact(bo);
		if(status>0)
		{
			pw.print("<script>alert('contact Sucessfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("html/index.html");
			rd.forward(request, response);
		}
		else
		{
			pw.print("<script>alert('Somethomg went wrong plese try again')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("html/index.html");
			rd.include(request, response);
		}
	}

}

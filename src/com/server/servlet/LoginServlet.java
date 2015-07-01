package com.server.servlet;

import com.server.db.UserDB;
import com.server.strings.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	private UserDB db;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		UserDB db = new UserDB();
		db.createConnection();
		
		String id = request.getParameter("userid_input");
		String password = request.getParameter("password_input");
		
		String query_sql = String.format("select * from %s where id=%s and password=%s", IStringConstans.USER_TABLE_NAME, id, password);
		
		if (db.query(query_sql)) 
		{
			response.sendRedirect("JSP/mg_index.jsp");
		}
		else 
		{
			response.sendRedirect("JSP/fail.jsp");
		}
		
		db.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


		
}

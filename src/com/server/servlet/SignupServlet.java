package com.server.servlet;

import java.io.IOException;
import com.server.strings.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.db.UserDB;

public class SignupServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		String sql = String.format("insert into %s values(%s,%s,%s,%s,%s)", IStringConstans.USER_TABLE_NAME,id, password, name, email, phone);
		
		UserDB db = new UserDB();
		db.createConnection();
		
		if (db.save(sql) > 0) 
		{
			response.sendRedirect("JSP/index.jsp");
		}
		else 
		{
			response.sendRedirect("JSP/index.jsp");
		}	

		
		db.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 		
	{

	}
	
}

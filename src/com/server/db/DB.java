package com.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.server.strings.*;

public class DB 
{	
	protected Connection connection = null;
	
	protected Statement statement = null;
	
	protected ResultSet resultSet = null;
	
	public void createConnection()
	{
		try 
		{
			Class.forName(IStringConstans.MYSQL_DRIVER);
			
			String url = IStringConstans.LocalURL;
			String user = IStringConstans.USER;
			String password = IStringConstans.PASSWORD;
			
			connection = DriverManager.getConnection(url, user, password);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	public int excuteUpdate(String sql)
	{
		try 
		{
			statement = connection.createStatement();
			int row = statement.executeUpdate(sql);
			return row;			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public ResultSet executeQuery(String sql)
	{
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			return resultSet;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void close()
	{
		try 
		{
			if (connection != null) 
			{
				connection.close();
			}	
			
			if (statement != null) 
			{
				statement.close();
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}

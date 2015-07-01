package com.server.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDB extends DB 
{
	public int save(String sql)
	{
		return excuteUpdate(sql);
	}
	
	/*
	 * query successfully return true,or return false
	 * @param sql statement
	 * @return true or false
	 * */
	public boolean query(String sql)
	{
		ResultSet rs = executeQuery(sql);
		try {
			if (rs.next()) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}

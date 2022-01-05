package com.xworkz.train.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dto.TrainDTO;

public class TrainUtil {
	private static final String PASSWORD = null;
	private static final String NAME = null;
	private static final String URL = null;
	public static Connection creatConnection()
	{
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(URL,NAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return connection;
		
	}
	public static void closeConnection(Connection connection)
	{
		if(connection!=null)
		{
			try {
				connection.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}

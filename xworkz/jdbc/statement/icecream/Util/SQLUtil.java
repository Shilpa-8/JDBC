package com.xworkz.jdbc.statement.icecream.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbc.statement.*;
import com.xworkz.jdbc.statement.icecream.SQLConstants;


public class SQLUtil {
	public static Connection createConnection() {
		try {
	Connection connection=DriverManager.getConnection(SQLConstants.url,SQLConstants.userName,SQLConstants.password);
	     return connection;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void closeConnection(Connection sqlConnection) {
		if(sqlConnection!=null) {
			try {
				sqlConnection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

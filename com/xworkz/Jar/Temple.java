package com.xworkz.Jar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

public class Temple {
	public static void main(String[] args) {
		String temple= "com.mysql.cj.jdbc.Driver";
		try
		{
			Class.forName(temple);
	
			System.out.println("jdbc is created");
			String url="jdbc:mysql://localhost:3306";
			String uName="root";
			String pass="root";
			
			Connection conn=DriverManager.getConnection(url,uName,pass);
			
			String str="insert into waterfall.water value(3,'GokakFalls','Gokak',550";
			Statement sta=conn.createStatement();
			int value=sta.executeUpdate(str);
			System.out.println(value);
			
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (SQLException sh)
		{
			sh.printStackTrace();
		}
	}

}



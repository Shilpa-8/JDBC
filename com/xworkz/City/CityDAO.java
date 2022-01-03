package com.xworkz.City;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.Country.Resources;

public class CityDAO {
	public boolean save(CityDTO dto)
	{
		Connection con=null;
		try {
			Class.forName(CitySources.CLASS);
			
			con=DriverManager.getConnection(CitySources.URL,CitySources.UNAME,CitySources.PASSWORD);
			//con=DriverManager.getConnection(Resources.URL,Resources.UNAME,Resources.PASSWORD);
			
			String str="insert into city.city_table value("+dto.getId()+",'"+dto.getName()+"',"+dto.getPopulation()+",'"+dto.getFamousfor()+"')";
			
			Statement sta=con.createStatement();
			
			int val=sta.executeUpdate(str);
			System.out.println("number of rows affected="+ val);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
		
		
			
		}
	public void delete(int id)
	{
		Connection conn=null;
		try
		{
			Class.forName(CitySources.CLASS);
			
			conn=DriverManager.getConnection(CitySources.URL,CitySources.UNAME,CitySources.PASSWORD);
			
			String str="delete from  city.city_table where id="+id;
			
			Statement st=conn.createStatement();
			
			int value=st.executeUpdate(str);
			System.out.println("the rows are affected is="+" "+ value);
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
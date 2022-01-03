package com.xworkz.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryDAO {
	public void save(CountryDTO dto)
	{
	Connection con=null;
	
	try
	{
		Class.forName(Resources.CLASS);
		
		con=DriverManager.getConnection(Resources.URL,Resources.UNAME,Resources.PASSWORD);
		
		String str="insert into country.country value("+dto.getId()+",'"+dto.getName()+"',"+dto.getCode()+",'"+dto.getContinent()+"')";
		Statement sta=con.createStatement();
		
		int val=sta.executeUpdate(str);
		
		
		
		
	}
	catch (ClassNotFoundException | SQLException e) {
	
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

	

	
}
	public void delete(int id)
	{
		Connection con=null;
		try{
			Class.forName(Resources.CLASS);
			
			con=DriverManager.getConnection(Resources.URL,Resources.UNAME,Resources.PASSWORD);
			
			String str="delete from country.country where id="+id;
			
			Statement st=con.createStatement();
			
			int value=st.executeUpdate(str);
		}
		catch (ClassNotFoundException |SQLException e) {
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
		
		
	}


}

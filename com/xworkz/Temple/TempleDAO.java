package com.xworkz.Temple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TempleDAO {
	public boolean save(TempleDTO dto)
	{
		Connection conn=null;
		try{
			Class.forName(Sources.CLASSNAME);
			System.out.println("jdbc has been loaded");
			conn=DriverManager.getConnection(Sources.URL,Sources.UNAME,Sources.PASSWORD);
			System.out.println("connection succesful");
        			
			String str="insert into temple.temple_file value("+dto.getId()+",'"+dto.getName()+"','"+dto.getMainGod()+"','"+dto.getState()+"')";
			Statement st=conn.createStatement();
			int val=st.executeUpdate(str);
		System.out.println(val);
		}
		catch (ClassNotFoundException | SQLException e) {
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
		
		
		
		
		
		
		
		return false;
		
	}

	public void delete(int id)
	{
		Connection conn=null;
		try{
			
			Class.forName(Sources.CLASSNAME);
			
			conn=DriverManager.getConnection(Sources.URL,Sources.UNAME,Sources.PASSWORD);
			
			
			Statement st=conn.createStatement();
			String str="delete from temple.temple_file where id="+id;
			int val=st.executeUpdate(str);
			System.out.println(val);
		}
		catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			if(conn!=null){
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

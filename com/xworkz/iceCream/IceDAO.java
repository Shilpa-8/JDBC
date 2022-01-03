package com.xworkz.iceCream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IceDAO {
	public boolean save(IceDTO dto)
	{
		
	
	Connection con=null;
	try
	{
	Class.forName(IceResources.CLASS);
	System.out.println("--jdbc has been loaded------");
	 
	con=DriverManager.getConnection(IceResources.URL,IceResources.UNAME,IceResources.PASSWORD);
	System.out.println("------connection sucess-----------");
	String str="insert into icecream.ice value("+dto.getId()+",'"+dto.getFlavour()+"','"+dto.getName()+"','"+dto.getPrice()+"')";
	Statement st=con.createStatement();
	System.out.println("---statement added------");
	int val=st.executeUpdate(str);
	System.out.println("total no of rows affected"+val);
	
	 
	
	}
	catch(ClassNotFoundException | SQLException e)
	{
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
		Connection co=null;
		try {
			Class.forName(IceResources.CLASS);
			
			co=DriverManager.getConnection(IceResources.URL,IceResources.UNAME,IceResources.PASSWORD);
			
			
			String str="delete from icecream.ice where id="+id;
			Statement st=co.createStatement();
			int val=st.executeUpdate(str);
			System.out.println("deleted rows are"+ val);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(co!=null)
			{
				try {
					co.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

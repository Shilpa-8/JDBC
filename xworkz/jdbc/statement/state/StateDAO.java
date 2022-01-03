package com.xworkz.jdbc.statement.state;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.statement.util.SQLUtil;


public class StateDAO {
Connection connection=null;
	
	public boolean saveDTO(StateDTO dto) {
		
		try {
			Class.forName(SQLConstants.driverFQN);
		    connection=DriverManager.getConnection(SQLConstants.url,SQLConstants.userName,SQLConstants.password);
			if(!connection.isClosed()) {
				System.out.println("Connection is successful");
				
	  String query="insert into state values("+dto.getSid()+",'"+dto.getSname()+"',"+dto.getScode()+",'"+dto.getScapital()+"')";
				Statement insertQuery=connection.createStatement();
				int rowsAffected=insertQuery.executeUpdate(query);
				System.out.println(rowsAffected+"Rows Affected");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(connection!=null) {
					connection.close();
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			
		}
		return false;
	}
	

   public boolean deleteById(int id) {
		
		Connection connection=null;
	
	
		try {
			Class.forName(SQLConstants.driverFQN);
		    connection=DriverManager.getConnection(SQLConstants.url,SQLConstants.userName,SQLConstants.password);
			if(!connection.isClosed()) {
				System.out.println("Connection is successful");
				
	            String query="delete from state where sid = "+id;
				Statement insertQuery=connection.createStatement();
				int rowsDeleted=insertQuery.executeUpdate(query);
				System.out.println(rowsDeleted+"Rows Deleted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(connection!=null) {
					connection.close();
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			
		}
		return false;
	}
    
   
   public void displayById(int id) {
	   try {
		   connection = SQLUtil.createConnection();
		   String sql="select * from state where sid=?";
		   PreparedStatement prepareStatement =connection.prepareStatement(sql);
		   prepareStatement.setObject(1,id);
		   ResultSet result = prepareStatement.executeQuery();
		   while(result.next()) {
			   Object col1=result.getObject(1);
			   Object col2=result.getObject(2);
			   Object col3=result.getObject(3);
			System.out.println(col1+""+col2+""+col3+"");   
		   }
		 }catch(SQLException e) {
			  e.printStackTrace();
		  }
	   finally {
		   SQLUtil.closeConnection(connection);
	   }
   }

   public void displayAll() {
	   try {
		   connection = SQLUtil.createConnection();
		   String sql="select * from state";
		   PreparedStatement prepareStatement =connection.prepareStatement(sql);
		   ResultSet result = prepareStatement.executeQuery();
		   while(result.next()) {
			   Object col1=result.getObject(1);
			   Object col2=result.getObject(2);
			   Object col3=result.getObject(3);
			System.out.println(col1+""+col2+""+col3+"");   
		   }
		 }catch(SQLException e) {
			  e.printStackTrace();
		  }
	   finally {
		   SQLUtil.closeConnection(connection);
	   }
   }
   
   public void displayTotalNoOfRecords() {
	   try {
		   connection = SQLUtil.createConnection();
		   String sql="select count(*) from state";
		   PreparedStatement prepareStatement =connection.prepareStatement(sql);
		   ResultSet result = prepareStatement.executeQuery();
		   while(result.next()) {
			   Object col1=result.getObject(1);
			System.out.println(col1);   
		   }
		 }catch(SQLException e) {
			  e.printStackTrace();
		  }
	   finally {
		   SQLUtil.closeConnection(connection);
	   }
   }

}

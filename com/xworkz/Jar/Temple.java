package com.xworkz.Jar;

public class Temple {
	public static void main(String[] args) {
		String temple= "com.mysql.cj.jdbc.Driver";
		try
		{
			Class.forName(temple);
	
			System.out.println("jdbc is created");
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}



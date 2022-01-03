package com.xworkz.jdbc.statement.city;

import com.xworkz.jdbc.statement.city.*;

public class CityDTOTester {
	public static void main(String[] args) {
		CityDTO city=new CityDTO(8,"Agra",187699,"Tajmahal");
		
		CityDAO dao=new CityDAO();
		boolean save=dao.saveDTO(city);
		//System.out.println(save);
		//dao.deleteById(3);
		dao.displayById(1);
		dao.displayAll();
		dao.displayTotalNoOfRecords();

				
		
}

}

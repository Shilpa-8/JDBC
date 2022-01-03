package com.xworkz.jdbc.statement.country.Util;

import com.xworkz.jdbc.statement.country.*;

public class CountryDTOTester {
	public static void main(String[] args) {
		CountryDTO country=new CountryDTO(9,"Australia",61,"Australia");
		
		CountryDAO dao=new CountryDAO();
		boolean save=dao.saveDTO(country);
		//System.out.println(save);
		//dao.deleteById(3);
		dao.displayById(5);
		dao.displayAll();
		dao.displayTotalNoOfRecords();
				

}
}

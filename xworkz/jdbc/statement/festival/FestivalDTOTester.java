package com.xworkz.jdbc.statement.festival;
import com.xworkz.jdbc.statement.festival.*;

public class FestivalDTOTester {
	public static void main(String[] args) {
	
	FestivalDTO festival=new FestivalDTO(8,"Onam","2022-08-12","Kerala");
	
	FestivalDAO dao=new FestivalDAO();
	boolean save=dao.saveDTO(festival);
	//System.out.println(save);
	//dao.deleteById(2);
	dao.displayById(1);
	dao.displayAll();
	dao.displayTotalNoOfRecords();
	}

			
}



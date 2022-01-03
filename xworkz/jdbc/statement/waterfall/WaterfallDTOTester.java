package com.xworkz.jdbc.statement.waterfall;

public class WaterfallDTOTester {
	
	public static void main(String[] args) {
		WaterfallDTO waterfall=new WaterfallDTO(3,"Sathodi","Balagar",157,"Khali");
		
		WaterfallDAO dao=new WaterfallDAO();
		boolean save=dao.saveDTO(waterfall);
		//System.out.println(waterfall);
		//dao.deleteById(3);
		dao.displayById(2);
		dao.displayAll();
		dao.displayTotalNoOfRecords();		
		
	}

}

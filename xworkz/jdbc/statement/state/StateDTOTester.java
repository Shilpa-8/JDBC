package com.xworkz.jdbc.statement.state;


public class StateDTOTester {
public static void main(String[] args) {
		
		StateDTO state=new StateDTO(2,"Karnataka",80,"Bengaluru");
			
			StateDAO dao=new StateDAO();
			boolean save=dao.saveDTO(state);
			//System.out.println(save);
			//dao.deleteById(1);
			dao.displayById(2);
			dao.displayAll();
			dao.displayTotalNoOfRecords();
					
					
		}


}

package com.xworkz.Temple;

public class TempleTester {
public static void main(String[] args) {
		
		TempleDTO dto[]=new TempleDTO[5];
		
		
	      dto[0]=new TempleDTO(1, "murudeshwara", "shiva", "karnataka");
	      dto[1]=new TempleDTO(2, "Nanjangudu", "Nanjundeshwara", "karnataka");
	      dto[2]=new TempleDTO(3, "iskon", "krishna", "karnataka");
	      dto[3]=new TempleDTO(4, "kambada narasimha swamy", "narasimha", "karnataka");
	      dto[4]=new TempleDTO(5, "durgamba temple", "durga", "karnataka");
	      
	      
		TempleDAO dao1=new TempleDAO();
		
		System.out.println("-----------adding elements-------------");
		for (int i = 0; i < dto.length; i++) {
			dao1.save(dto[i]);
		}
		
		
		System.out.println("------------deleting element------------");
		for (int i = 0; i < dto.length-1; i++) {
			int val=dto[i].getId();
			
			dao1.delete(val);
		   }
		
		
		//dao.delete(1);
	}


}

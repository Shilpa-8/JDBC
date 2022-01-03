package com.xworkz.City;

public class CityTester {
public static void main(String[] args) {
		
		CityDTO dto[]=new CityDTO[5];
		dto[0]=new CityDTO(1, "chikkamagaluru", 118401, "cofee");
		dto[1]=new CityDTO(2, "shivmogga", 322650, "areka");
		dto[2]=new CityDTO(3, "davanagere", 435125, "benne dose");
		dto[3]=new CityDTO(4, "mysore", 920650, "tourist places");
		dto[4]=new CityDTO(5, "bangalore", 8410000, "shopping food culture");
		
		CityDAO dao=new CityDAO();
		
		for (int i = 0; i < dto.length; i++) {
		 //dao.save(dto[i]);
		}
		for (int i = 0; i < dto.length-3; i++) {
			
	    dao.delete(dto[i].getId());
			
			
			
		}
		
		
	}


}

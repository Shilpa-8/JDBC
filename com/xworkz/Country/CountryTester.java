package com.xworkz.Country;

public class CountryTester {
public static void main(String[] args) {
		
		CountryDTO dto[]=new CountryDTO[5];
		dto[0]=new CountryDTO(1, "india", 91l, "Asia");
		dto[1]=new CountryDTO(2, "australia", 61l, "canberra");
		dto[2]=new CountryDTO(3, "Colombia", 32l, "Bogotá");
		dto[3]=new CountryDTO(4, "Cuba", 345l, "Havana");
		dto[4]=new CountryDTO(5, "United Kingdom", 1l, "London");
		
		CountryDAO dao=new CountryDAO();
		
		for (int i = 0; i < dto.length; i++) {
			
			//dao.save(dto[i]);
			
		}
		
		for (int i = dto.length-1; i > dto.length-2; i--) {
			dao.delete(dto[i].getId());
			
		}
		
	}


}

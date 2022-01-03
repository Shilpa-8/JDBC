package com.xworkz.iceCream;

public class IceTester {
	
public static void main(String[] args) {
		
		IceDTO dto[]=new IceDTO[5];
		dto[0]=new IceDTO(1, "Chacolate","Chacobar", "10");
		dto[1]=new IceDTO(2, "vanilla","cup", "10");
		dto[2]=new IceDTO(3, "strawberry","cone", "15");
		dto[3]=new IceDTO(4, "butterscotch","large-cup", "30");
		dto[4]=new IceDTO(5, "mango","Candy", "10");
		IceDAO dao=new IceDAO();
		for (int i = 0; i < dto.length; i++) {
			
			dao.save(dto[i]);
			
		}
		
		for (int i = dto.length-1; i >= dto.length-2; i--) {
			
			 //dao.delete(dto[i].getId());
		}
		
		
	}


}

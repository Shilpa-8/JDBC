package com.xworkz.train;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dto.TrainDTO;

public class TrainTester {
	public static void main(String[] args) {
		
		TrainDTO dto[] = new TrainDTO[5];
		dto[0] = new TrainDTO(1,20651,"Bangalore","Shivamogga",15,150,"AC","Talguppa InterCity Express");
		dto[1] = new TrainDTO(2,12089,"Yesvanthpur","Bhadravathi",20,100,"General","Jan Shatabdi Express");
		dto[2] = new TrainDTO(3,17326,"Mysuru","Arsikere",10,120,"Sleeper","Vishwamanava Express");
		dto[3] = new TrainDTO(4,12725,"Bangalore","sss Hubballi",37,120,"General","Siddhaganga SF Express");
		dto[4] = new TrainDTO(5,16589,"Bangalore","Belagavi",45,190,"AC","Rani Chennamma Express");
		
		TrainDAO dao = new TrainDAO();
		
		for (int i = 0; i < dto.length; i++) {

			// dao.save(dto[i]);
	}
		// dao.deleteByNo(20651);
				// dao.deleteByNoAndId(17326, 3);
				Collection<TrainDTO> col = new ArrayList<TrainDTO>();
				col=dao.getAllByBoarding("Mysuru");
				
				col.forEach((e) -> System.out.println(e));

				// dao.updateDestinationByTrainNo("sss Hubballi", 4);

				dao.getTotal();
	}

		
}


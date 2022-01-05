package com.xworkz.train.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.train.dto.TrainDTO;
import com.xworkz.train.util.TrainUtil;


public class TrainDAO {
	private TrainDTO dto;
	public boolean  sava(TrainDTO dto) {
		Connection con=null;
		try {
			con=TrainUtil.createConnection();
			String str = "insert into Train.Train_table value(?,?,?,?,?,?,?,?)";
			PreparedStatement prep = con.PreparedStatement(str);
			
			prep.setObject(1,dto.getTid());
			prep.setObject(2,dto.getTrainNo());
			prep.setObject(3,dto.getBoarding());
			prep.setObject(4,dto.getDestination());
			prep.setObject(5,dto.getSeatNo());
			prep.setObject(6,dto.getPrice());
			prep.setObject(7,dto.getCls());
			prep.setObject(8,dto.getName());
			
			int val = prep.executeUpdate();
			return val > 0 ? true : false;
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			TrainUtil.closeConnection(con);
		}
		return false;
		}
	
	public boolean deleteByNo(int no) {

		Connection con = null;
		try {
			con = TrainUtil.creatConnection();
			String str = "delete from Train.Train_Table where no=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, no);
			int val = preparedStatement.executeUpdate();
			return val > 0 ? true : false;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			TrainUtil.closeConnection(con);
		}
		return false;
		
		}
	public boolean deleteByNoANDId(int no,int id) {
		Connection con = null;
		try {
			con = TrainUtil.creatConnection();
			String str ="delete from Train.Train_Table where no=? and id=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1,no);
			preparedStatement.setObject(2,id);
			int val = preparedStatement.executeUpdate();

			return val > 0 ? true : false;

		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			TrainUtil.closeConnection(con);
		}
		return false;
	}
	public TrainDTO getByTrainNo(int no) {
		Connection con = null;
		try {
			con = TrainUtil.creatConnection();
			String str = "select * from Train.Train_Table where no=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, no);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(1));
				dto.setBoarding(resultSet.getString(1));
				dto.setDestination(resultSet.getString(1));
				dto.setSeatNo(resultSet.getInt(1));
				dto.setPrice(resultSet.getFloat(1));
				dto.setCls(resultSet.getString(1));
				dto.setName(resultSet.getString(1));
				
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			TrainUtil.closeConnection(con);
		}
		return dto;
		
	}
	public TrainDTO getAll() {
		Connection con = null;
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		TrainDTO dto = new TrainDTO();
		
		try {
			con = TrainUtil.createConnection();
			String str = "select * from Train.Train_table";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getFloat(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
			
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		TrainUtil.closeConnection(con);
	}
	return (TrainDTO) collection;
	}
	
	public Collection<TrainDTO> getAllByBoarding(String Boarding){
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		TrainDTO dto = new TrainDTO();
		Connection con = null;
		try {
			con = TrainUtil.createConnection();
			String str = "select * from Train.Train_table where board=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, Boarding);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getFloat(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
				Iterator<TrainDTO> itr=collection.iterator(); 
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
		}
	}
		catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			TrainUtil.closeConnection(con);
		
		}
		return collection;
	}
	public TrainDTO getAllByDestination(String Destination) {
		Connection con = null;
		Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
		TrainDTO dto = new TrainDTO();
		try {
			con = TrainUtil.createConnection();
			String str = "select * from Train.Train_Table where dest=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, Destination);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNo(resultSet.getInt(5));
				dto.setPrice(resultSet.getFloat(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				collection.add(dto);
		}
			
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		TrainUtil.closeConnection(con);
	}
		return (TrainDTO) collection;
	}
	public boolean updateDestinationByTrainNo(String dest, int trainNo) {
		Connection con = null;
		try {
			con = TrainUtil.createConnection();
			String str = "update Train.Train_table set dest=? where id=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, dest);
			preparedStatement.setObject(2, trainNo);
			int resultSet = preparedStatement.executeUpdate();

			return resultSet > 0 ? true : false;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return false;
	}
	public boolean updateDestinatoinAndBoardingbyTrainNo(String desti, String boarding, int no) {
		Connection con = null;
		try {
			con = TrainUtil.createConnection();
			String str = "update train_Train_table set dest=?, board=? where no=?";
			PreparedStatement preparedStatement = con.prepareStatement(str);
			preparedStatement.setObject(1, desti);
			preparedStatement.setObject(2, boarding);
			preparedStatement.setObject(3, no);

			int val = preparedStatement.executeUpdate();
			return val > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			TrainUtil.closeConnection(con);
		}
		return false;
	}
	public int getTotal() {
		Connection con = null;
		int count1 = 0;
		try {
			con = TrainUtil.createConnection();
			String str = "select count(*) from Train.Train_table";
			PreparedStatement preparedStatement = con.prepareStatement(str);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				count1 = resultSet.getInt(1);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			TrainUtil.closeConnection(con);
		}
		return count1;
	}

		}
		
	


	

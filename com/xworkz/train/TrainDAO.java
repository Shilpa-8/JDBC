package com.xworkz.train;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

//import com.mysql.cj.x.protobuf.MysqlxSession.Reset;




public class TrainDAO {
	public boolean save(TrainDTO dto) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();

		try {
			String str = "insert into constants values(?,?,?,?,?,?,?,?)";

			PreparedStatement stm = connection.prepareStatement(str);
			stm.setInt(1, dto.getId());
			stm.setInt(2, dto.getTrainNo());
			stm.setString(3, dto.getBoarding());
			stm.setString(4, dto.getDestination());
			stm.setInt(5, dto.getSeatNo());
			stm.setInt(6, dto.getPrice());
			stm.setString(7, dto.getCls());
			stm.setString(8, dto.getName());

			int row = stm.executeUpdate(str);
			if (row == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleteByNo(String no) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		try {
			String str = "delete from tra where no=?";
			Statement stm = connection.createStatement();
			int row = stm.executeUpdate(str);
			if (row == 1) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String str = "";

		return false;

	}

	public boolean deleteByNoAndId(String no, int id) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		String str = "delete from tra where no=" + no + " and  id=" + id;
		try {
			Statement stm = connection.createStatement();
			int row = stm.executeUpdate(str);
			if (row == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public TrainDTO getByNo(int i) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			String str = "select * from tra where no=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			preparedStatement.setObject(1, i);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setId(resultSet.getInt(1));
				d.setTrainNo(resultSet.getInt(2));
				d.setBoarding(resultSet.getString(3));
				d.setDestination(resultSet.getString(4));
				d.setSeatNo(resultSet.getInt(5));
				d.setPrice(resultSet.getInt(str));
				d.setCls(resultSet.getString(7));
				d.setName(resultSet.getString(8));
				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> getAll(TrainDTO dto) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setId(resultSet.getInt(1));
				d.setTrainNo(resultSet.getInt(2));
				d.setBoarding(resultSet.getString(3));
				d.setDestination(resultSet.getString(4));
				d.setSeatNo(resultSet.getInt(5));
				d.setPrice(resultSet.getInt(str));
				d.setCls(resultSet.getString(7));
				d.setName(resultSet.getString(8));
				collection.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public Collection<TrainDTO> getAllByBording() {
		Connection connection = null;

		try {

			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra value bording=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next());
			
			TrainDTO d = new TrainDTO();
			d.setId(resultSet.getInt(1));
			d.setTrainNo(resultSet.getInt(2));
			d.setBoarding(resultSet.getString(3));
			d.setDestination(resultSet.getString(4));
			d.setSeatNo(resultSet.getInt(5));
			d.setPrice(resultSet.getInt(str));
			d.setCls(resultSet.getString(7));
			d.setName(resultSet.getString(8));
			collection.add(d);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> AllByDestination() {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra value destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next());
			
			
			TrainDTO d = new TrainDTO();
			d.setId(resultSet.getInt(1));
			d.setTrainNo(resultSet.getInt(2));
			d.setBoarding(resultSet.getString(3));
			d.setDestination(resultSet.getString(4));
			d.setSeatNo(resultSet.getInt(5));
			d.setPrice(resultSet.getInt(str));
			d.setCls(resultSet.getString(7));
			d.setName(resultSet.getString(8));
			collection.add(d);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	
	}

	
		
	





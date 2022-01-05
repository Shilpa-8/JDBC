package com.xworkz.train.dto;

public class TrainDTO {
	private int tid;
	private int trainNo;
	private String boarding;
	private String destination;
	private int seatNo;
	private float price;
	private String cls;
	private String name;
	
	public TrainDTO(int tid, int trainNo, String boarding, String destination, int seatNo, float price, String cls,
			String name) {
		super();
		this.tid = tid;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.price = price;
		this.cls = cls;
		this.name = name;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TrainDTO [tid=" + tid + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination="
				+ destination + ", seatNo=" + seatNo + ", price=" + price + ", cls=" + cls + ", name=" + name + "]";
	}
	
	

}

package com.xworkz.train;

public class TrainDTO {
	private Integer trainNo;
	private Integer id;
    private String boarding;
	private String destination;
	private Integer seatNo;
	private Integer price;
	private String cls;
	private String name;
	
	public TrainDTO(Integer trainNo, Integer id, String boarding, String destination, Integer seatNo, Integer price,
			String cls, String name) {
		super();
		this.trainNo = trainNo;
		this.id = id;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.price = price;
		this.cls = cls;
		this.name = name;
	}
	public Integer getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
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
		return "TrainDTO [trainNo=" + trainNo + ", id=" + id + ", boarding=" + boarding + ", destination=" + destination
				+ ", seatNo=" + seatNo + ", price=" + price + ", cls=" + cls + ", name=" + name + "]";
	}
	

}

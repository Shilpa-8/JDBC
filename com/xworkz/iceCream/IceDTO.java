package com.xworkz.iceCream;

public class IceDTO {
	private int id;
	private String flavour;
	private String name;
	private String price;


	public IceDTO() {
		
	}


	public IceDTO(int id, String flavour, String name, String price) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public String getFlavour() {
		return flavour;
	}


	public String getName() {
		return name;
	}


	public String getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "IceDTO [id=" + id + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}
}

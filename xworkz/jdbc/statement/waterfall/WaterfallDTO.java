package com.xworkz.jdbc.statement.waterfall;

import java.io.Serializable;

public class WaterfallDTO implements Serializable{
	private int w_id;
	private String w_name;
	private String w_location;
	private double w_height;
	private String w_river;
	
	public WaterfallDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

public WaterfallDTO(int w_id, String w_name, String w_location, double w_height, String w_river) {
		this.w_id = w_id;
		this.w_name = w_name;
		this.w_location = w_location;
		this.w_height = w_height;
		this.w_river = w_river;
	}

public int getW_id() {
	return w_id;
}

public String getW_name() {
	return w_name;
}

public String getW_location() {
	return w_location;
}

public double getW_height() {
	return w_height;
}

public String getW_river() {
	return w_river;
}

@Override
public String toString() {
	return "WaterfallDTO [w_id=" + w_id + ", w_name=" + w_name + ", w_location=" + w_location + ", w_height=" + w_height
			+ ", w_river=" + w_river + "]";
}


}

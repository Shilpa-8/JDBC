package com.xworkz.jdbc.statement.city;
import java.io.Serializable;

public class CityDTO implements Serializable {
	private int cid;
	private String cname;
	private long cpopulation;
	private String famousFor;
	
	public CityDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityDTO(int cid, String cname, long cpopulation, String famousFor) {
		this.cid = cid;
		this.cname = cname;
		this.cpopulation = cpopulation;
		this.famousFor = famousFor;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public long getCpopulation() {
		return cpopulation;
	}

	public String getFamousFor() {
		return famousFor;
	}

	@Override
	public String toString() {
		return "CityDTO [c_id=" + cid + ", c_name=" + cname + ", c_population=" + cpopulation + ", famousFor="
				+ famousFor + "]";
	}
	
	


}

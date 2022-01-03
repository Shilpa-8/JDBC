package com.xworkz.jdbc.statement.icecream;
import java.io.Serializable;


public class IcecreamDTO implements Serializable {
	private int creamid;
	private String cflavour;
	private String cname;
	private int cprice;
	
	public IcecreamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IcecreamDTO(int creamid, String cflavour, String cname, int cprice) {
		this.creamid = creamid;
		this.cflavour = cflavour;
		this.cname = cname;
		this.cprice = cprice;
	}

	public int getCreamid() {
		return creamid;
	}

	public String getCflavour() {
		return cflavour;
	}

	public String getCname() {
		return cname;
	}

	public int getCprice() {
		return cprice;
	}

	@Override
	public String toString() {
		return "IcecreamDTO [creamid=" + creamid + ", cflavour=" + cflavour + ", cname=" + cname + ", cprice=" + cprice
				+ "]";
	}
	
	

}

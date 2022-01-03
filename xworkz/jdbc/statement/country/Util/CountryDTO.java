package com.xworkz.jdbc.statement.country.Util;
import java.io.Serializable;

public class CountryDTO implements Serializable {
	private int cid;
	private String cname;
	private long ccode;
	private String continent;
	
	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryDTO(int cid, String cname, long ccode, String continent) {
		this.cid = cid;
		this.cname = cname;
		this.ccode = ccode;
		this.continent = continent;
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public long getCcode() {
		return ccode;
	}
	public String getContinent() {
		return continent;
	}
	@Override
	public String toString() {
		return "CountryDTO [c_id=" + cid + ", c_name=" + cname + ", c_code=" + ccode + ", continent=" + continent
				+ "]";
	}
	
	
	

}

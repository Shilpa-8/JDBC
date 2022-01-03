package com.xworkz.jdbc.statement.state;

import java.io.Serializable;

public class StateDTO implements Serializable  {
	private int sid;
	private String sname;
	private int scode;
	private String scapital;
	
	public StateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StateDTO(int sid, String sname, int scode, String scapital) {
		this.sid = sid;
		this.sname = sname;
		this.scode = scode;
		this.scapital = scapital;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public int getScode() {
		return scode;
	}

	public String getScapital() {
		return scapital;
	}

	@Override
	public String toString() {
		return "StateDTO [sid=" + sid + ", sname=" + sname + ", scode=" + scode + ", scapital=" + scapital + "]";
	}
	
	

	

}

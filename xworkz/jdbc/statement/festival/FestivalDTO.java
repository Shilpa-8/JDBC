package com.xworkz.jdbc.statement.festival;


import java.io.Serializable;

public class FestivalDTO  implements Serializable {

	private int fid;
	private String fname;
	private String fdate;
    private String fstate;
	
    public FestivalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FestivalDTO(int fid, String fname, String fdate, String fstate) {
		this.fid = fid;
		this.fname = fname;
		this.fdate = fdate;
		this.fstate = fstate;
	}

	public int getFid() {
		return fid;
	}

	public String getFname() {
		return fname;
	}

	public String getFdate() {
		return fdate;
	}

	public String getFstate() {
		return fstate;
	}

	@Override
	public String toString() {
		return "FestivalDTO [fid=" + fid + ", fname=" + fname + ", fdate=" + fdate + ", fstate=" + fstate + "]";
	}
    
	

}

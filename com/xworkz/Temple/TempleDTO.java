package com.xworkz.Temple;
import java.io.Serializable;

public class TempleDTO  implements Serializable{
	private int id;
	private String name;
	private String mainGod;
	private String State;
	
	public TempleDTO()
	{
		
	}
	public TempleDTO(int id, String name, String mainGod, String state) {
		super();
		this.id = id;
		this.name = name;
		this.mainGod = mainGod;
		State = state;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMainGod() {
		return mainGod;
	}
	public String getState() {
		return State;
	}
	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", mainGod=" + mainGod + ", State=" + State + "]";
	}

 

}

package com.xworkz.City;

import java.io.Serializable;

public class CityDTO implements Serializable {
	private int id;
	private String name;
	private int population;
	private String famousfor;
	
	public CityDTO()
	{
		
	}

	public CityDTO(int id, String name, int population, String famousfor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousfor = famousfor;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public String getFamousfor() {
		return famousfor;
	}

	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", name=" + name + ", population=" + population + ", famousfor=" + famousfor + "]";
	}
	

	

}

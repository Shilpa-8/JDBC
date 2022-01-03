package com.xworkz.Country;


public class CountryDTO {
	private int id;
	private String name;
    private long code;
    private String continent;
    
    public CountryDTO()
    {
    	
    }

	public CountryDTO(int id, String name, long code, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.continent = continent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getCode() {
		return code;
	}

	public String getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", code=" + code + ", continent=" + continent + "]";
	}

}

package org.bdWorld_X.theone.modele;

public class City {
	private int idCity;
	private String name;
	private Country country;
	private String district;
	private String info;
	
	public City() {
		this(0,"default",null,"ZZ","nada");
	}

	public City(int id, String n, Country c, String d, String i) {
		setIdCity(id);
		 setName(n);
		 setDistrict(d);
		 setInfo(i);
		 setCountry(c);;
	}

	private void setName(String n) {
		name = n ;
	}

	/**
	 * @param id the id to set
	 */
	public void setIdCity(int id) {
		this.idCity = id;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "City [idCity=" + idCity + ", name=" + name + ", countryCode=" + country.getCode() + ", district=" + district
				+ ", info=" + info + "]";
	}

	/**
	 * @return the idCity
	 */
	public int getIdCity() {
		return idCity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the countryCode
	 */
	public Country getCountry() {
		return this.country;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	
}

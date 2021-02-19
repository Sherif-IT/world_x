package org.bdWorld_X.theone.controleur;

import java.sql.Connection;
import java.util.ArrayList;

import org.bdWorld_X.theone.modele.City;
import org.bdWorld_X.theone.modele.Country;
import org.bdWorld_X.theone.stockage.DaoFactory;

public class Manageur {
	private static Manageur instance = new Manageur();
	ArrayList<City> cities;
	ArrayList<Country> countries;
	
	private Manageur() {
		cities = new ArrayList<City>();
		countries = new ArrayList<Country>();
		remplir();
	}
	private void remplir() {
		DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.MYSQL);
		cities = factory.getCityDao().lireTous();
		countries = factory.getCountryDao().lireTous();
		
		City c = new City(5222,"NewTown",new Country(),"dst","{\"Population\": 1780000}");
		
		factory.getCityDao().inserer(c);
		//Country d = new Country("1","def", 111,"de");
		//factory.getCountryDao().inserer(d);

	}
	/**
	 * 
	 */
	public static Manageur getInstance() {
		
		return instance;
	

	}
	public ArrayList<String> getInfosCities() {
		ArrayList<String> ret = new ArrayList<>();
		cities.stream().forEach(c->ret.add(c.toString()));
		return ret;
	}
	public ArrayList<String> getInfosCountries() {
		ArrayList<String> ret = new ArrayList<>();
		countries.stream().forEach(c->ret.add(c.toString()));
		return ret;
	}
}

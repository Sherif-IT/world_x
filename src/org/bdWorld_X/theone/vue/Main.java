package org.bdWorld_X.theone.vue;

import java.util.ArrayList;

import org.bdWorld_X.theone.controleur.Manageur;

public class Main {
	Main(){
		
	}
	public void getInfoCities(){
		Manageur.getInstance().getInfosCities().stream().forEach(s->System.out.println(s));
	
	}
	public void getInfoCountries(){
		Manageur.getInstance().getInfosCountries().stream().forEach(s->System.out.println(s));
	
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.getInfoCities();
		m.getInfoCountries();
	}

}

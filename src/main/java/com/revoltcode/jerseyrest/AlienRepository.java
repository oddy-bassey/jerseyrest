package com.revoltcode.jerseyrest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	private List<Alien> alien;
	
	public AlienRepository() {
		
		alien = new ArrayList<Alien>();
		
		Alien alien0 = new Alien("Alaribe", 1, "10", "Germany");
		Alien alien1= new Alien("Justin", 2, "10", "Lagos");
		Alien alien2 = new Alien("Israel", 3, "10", "Calabar");
		Alien alien3 = new Alien("Princewill", 4, "9", "Calabar");
		
		alien.add(alien0);  
		alien.add(alien1); 
		alien.add(alien2); 
		alien.add(alien3);
	}
	
	public List<Alien> getAliens(){
		return alien;
	}
	
	public Alien getAlien(int id) {
		
		for(Alien obj : alien) {
			if(obj.getId() == id) {
				return obj;
			}
		}
		
		return null;
	}
	
	public void createAlien(Alien obj) {
		alien.add(obj);
	}
}

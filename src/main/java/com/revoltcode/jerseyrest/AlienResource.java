package com.revoltcode.jerseyrest;
 

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path("/aliens")
public class AlienResource {
	
	private AlienRepository repo;

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() { 
		
		return repo.getAliens();
	}
	
	@POST
	public void createAlien(Alien alien) {
		repo.createAlien(alien);
	}
}

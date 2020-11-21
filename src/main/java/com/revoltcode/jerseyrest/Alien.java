package com.revoltcode.jerseyrest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	private String name;
	private int id;
	private String points;
	private String origin;
	
	
	public Alien() {}
	
	public Alien(String name, int id, String points, String origin) {
		super();
		this.name = name;
		this.id = id;
		this.points = points;
		this.origin = origin;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

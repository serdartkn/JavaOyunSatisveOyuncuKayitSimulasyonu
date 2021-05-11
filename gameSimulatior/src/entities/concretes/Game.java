package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity{
	
	private int id;
	private String gameName; 
	private double price;
	private String description;
	
	public Game() 
	{
	// TODO Auto-generated constructor stub
	}	
	
	public Game(int id, String gameName, double price, String description) 
	{
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

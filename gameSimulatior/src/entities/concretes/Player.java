package entities.concretes;

import java.time.LocalDate;

import entities.abstracts.Entity;

public class Player implements Entity{

	private int id;
	private String firstNameString;
	private String lastName;
	private LocalDate dateOfBirthDate;
	private String nationalityId;
	private String level = "1";
	
	public Player() 
	{
		
	}

	public Player(int id, String firstNameString, String lastName, LocalDate dateOfBirthDate, String nationalityId)
	{
		this.id = id;
		this.firstNameString = firstNameString;
		this.lastName = lastName;
		this.dateOfBirthDate = dateOfBirthDate;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirthDate() {
		return dateOfBirthDate;
	}

	public void setDateOfBirthDate(LocalDate dateOfBirthDate) {
		this.dateOfBirthDate = dateOfBirthDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getLevel() {
		return level;
	}	
	
}

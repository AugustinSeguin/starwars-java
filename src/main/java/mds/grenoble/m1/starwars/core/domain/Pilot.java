package mds.grenoble.m1.starwars.core.domain;

public class Pilot {

	public enum Gender {
		MALE, 
		FEMALE, 
		OTHER
	}
	
	public final long id;
	
	public String name;
	
	public Gender gender;

	public Species species;
		
	public Starship starship;	

	public Pilot(long id)
	{
		this.id = id;
	}
}

package mds.grenoble.m1.starwars.core.domain;

import java.util.List;

public class Starship {
	
	 public enum Category {
	  CORVETTE,
	  DESTROYER,
	  DREADNOUGHT,
	  STATION,
	  CRAFT,
	  CARGO,
	  FIGHTER,
	  OTHER
	 }
	 
	 public Long id;
	 
	 public String name;
	 
	 public int crew;
	 public int passengers;
	 
	 public Category category;
	 
	 public List<Pilot> pilots;
	 
	 public Starship(long id)
	 {
		 this.id = id;
	 }
}
 
package mds.grenoble.m1.starwars.core.domain;

public class Species {

	 public enum Classification {
	  ARTIFICIAL, 
	  MAMMAL,
	  REPTILE,
	  GASTROPOD,
	  AMPHIBIAN
	 }
	 
	 public long id;

	 public String name;
	 
	 public Classification classification;
	 
	 public boolean sentient;

	 public Species(long id)
	 {
		 this.id = id;
	 }
}
 
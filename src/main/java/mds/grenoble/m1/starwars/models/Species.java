package mds.grenoble.m1.starwars.models;

import jakarta.persistence.*;

@Entity
public class Species {

	 public enum Classification {
	  ARTIFICIAL, 
	  MAMMAL,
	  REPTILE,
	  GASTROPOD,
	  AMPHIBIAN
	 }
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 public long id;
	 
	 @Column(unique=true)
	 public String name;
	 
	 @Enumerated(EnumType.STRING)
	 public Classification classification;
	 
	 public boolean sentient;
}
 
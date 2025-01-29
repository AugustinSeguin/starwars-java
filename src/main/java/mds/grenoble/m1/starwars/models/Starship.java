package mds.grenoble.m1.starwars.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
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
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @JsonIgnore
	 public Long id;
	 
	 @Column(unique=true)
	 public String name;
	 
	 public int crew;
	 public int passengers;
	 
	 @Enumerated(EnumType.STRING)
	 public Category category;
	 
	 @JsonIgnore
	 @OneToMany(mappedBy="starship")
	 public final List<Pilot> pilots = new ArrayList<>();
}
 
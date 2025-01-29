package mds.grenoble.m1.starwars.models;

import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.*;

@Entity
public class Pilot {

	public enum Gender {
		MALE, 
		FEMALE, 
		OTHER
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@Column(unique=true)
	public String name;
	
	@Enumerated(EnumType.STRING)
	public Gender gender;
	
	@ManyToOne
	@JoinColumn(nullable=true)
	public Species species;
		
	@ManyToOne
	@JoinColumn
	public Starship starship;	
}

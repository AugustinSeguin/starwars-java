package mds.grenoble.m1.starwars.infrastructure.orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import mds.grenoble.m1.starwars.core.domain.Pilot;

@Entity(name = "pilot")
public class PilotEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column(unique = true)
	public String name;

	@Enumerated(EnumType.STRING)
	public Pilot.Gender gender;

	@ManyToOne
	@JoinColumn(nullable = true)
	public SpeciesEntity species;

	@ManyToOne
	@JoinColumn
	public StarshipEntity starship;
}

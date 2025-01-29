package mds.grenoble.m1.starwars.infrastructure.orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import mds.grenoble.m1.starwars.core.domain.Species;

@Entity(name = "species")
public class SpeciesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column(unique = true)
	public String name;

	@Enumerated(EnumType.STRING)
	public Species.Classification classification;

	public boolean sentient;
}

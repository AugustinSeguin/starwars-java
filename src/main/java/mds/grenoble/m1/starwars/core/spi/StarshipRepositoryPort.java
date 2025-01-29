package mds.grenoble.m1.starwars.core.spi;

import java.util.List;

import mds.grenoble.m1.starwars.core.domain.Starship;

public interface StarshipRepositoryPort {
	List<Starship> findAll();	
}

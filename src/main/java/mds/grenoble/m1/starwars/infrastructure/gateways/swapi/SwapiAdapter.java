package mds.grenoble.m1.starwars.infrastructure.gateways.swapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import mds.grenoble.m1.starwars.core.domain.Starship;
import mds.grenoble.m1.starwars.core.spi.StarshipRepositoryPort;
import mds.grenoble.m1.starwars.infrastructure.gateways.swapi.response.SwapiStarship;

@Service
@ConditionalOnProperty(value = "starwars.settings.source", havingValue = "swapi", matchIfMissing = true)
public class SwapiAdapter implements StarshipRepositoryPort {

	@Autowired
	Swapi swapi;

	@Override
	public List<Starship> findAll() {
		List<Starship> starships = new ArrayList<>();
		List<SwapiStarship> originals = swapi.getStarships();
		int id = 1;
		for (SwapiStarship original : originals) {
			starships.add(original.toDomain(id));
			id += 1;
		}
		return starships;
	}
}
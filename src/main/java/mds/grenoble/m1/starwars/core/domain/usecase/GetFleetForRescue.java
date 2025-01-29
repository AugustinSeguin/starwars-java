package mds.grenoble.m1.starwars.core.domain.usecase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mds.grenoble.m1.starwars.core.api.GetFleetForRescuePort;
import mds.grenoble.m1.starwars.core.domain.Starship;
import mds.grenoble.m1.starwars.core.spi.StarshipRepositoryPort;
import mds.grenoble.m1.starwars.utils.logs.LoggerAdapter;

@slf4j
@Service
public class GetFleetForRescue implements GetFleetForRescuePort {

	@Autowired
	StarshipRepositoryPort repository;

	@Autowired
	LoggerAdapter logger;

	@Override
	public List<Starship> fleetForPassengers(int nbPassengers) {

		List<Starship> found = StreamSupport.stream(repository.findAll().spliterator(), false)
				.filter(starship -> starship.passengers > 0)
				.sorted(Comparator.comparingInt(starship -> starship.passengers)).collect(Collectors.toList());

		List<Starship> fleet = new ArrayList<>();
		while (nbPassengers > 0 && found.size() > 0) {
			Starship starship = found.remove(0);
			fleet.add(starship);
			nbPassengers -= starship.passengers;

			LoggerAdapter.getLogger().info("Fleet += " + starship.name);
		}
		return fleet;
	}
}

package mds.grenoble.m1.starwars.core.api;

import mds.grenoble.m1.starwars.core.domain.Starship;
import java.util.List;

public interface GetFleetForRescuePort {

	List<Starship> fleetForPassengers(int nbPassengers);
	
}

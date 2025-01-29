package mds.grenoble.m1.starwars.services;

import mds.grenoble.m1.starwars.repositories.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import mds.grenoble.m1.starwars.models.*;

@Service
public class StarshipService {

    private final StarshipRepository starshipRepository;

    public StarshipService(StarshipRepository starshipRepository) {
        this.starshipRepository = starshipRepository;
    }
    
    public List<Starship> fleetForPassengers(int nbPassengers) {
    	
        List<Starship> selectedStarships = starshipRepository.findTopByNbPassengers(nbPassengers);
    	if(!selectedStarships.isEmpty())
    	{
    		return selectedStarships;
    	}
    	
    	List<Starship> starshipByNbPassengersRoundedAbove = starshipRepository.findByNbPassengersRoundedAbove(nbPassengers);
       	if(selectedStarships.isEmpty())
    	{
       		selectedStarships.add(starshipByNbPassengersRoundedAbove.getFirst());
    		return selectedStarships; 
    	}
    	
        List<Starship> allStarships = starshipRepository.findAllOrderByNbPassengersAsc();
    
        int totalSeats = 0;
        for (Starship starship : allStarships) {
            if (totalSeats >= nbPassengers) break;
            selectedStarships.add(starship);
            totalSeats += starship.passengers;
        }

        return (totalSeats >= nbPassengers) ? selectedStarships : new ArrayList<>(); 
    }
}
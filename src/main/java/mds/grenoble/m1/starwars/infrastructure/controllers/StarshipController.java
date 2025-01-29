package mds.grenoble.m1.starwars.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import mds.grenoble.m1.starwars.core.api.GetFleetForRescuePort;
import mds.grenoble.m1.starwars.infrastructure.controllers.dto.StarshipDto;

import java.util.List;

@RestController
@RequestMapping(path="/api/fleet")
public class StarshipController {

	@Autowired
    GetFleetForRescuePort starshipService;
    
    @GetMapping()
    public List<StarshipDto> getFleetForPassengers(@RequestParam("passengers") int nbPassengers) {
        return starshipService.fleetForPassengers(nbPassengers)
        		.stream()
        		.map(StarshipDto::of)
        		.toList();
    }
}

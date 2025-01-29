package mds.grenoble.m1.starwars.controllers;
import org.springframework.web.bind.annotation.*;

import mds.grenoble.m1.starwars.models.Starship;
import mds.grenoble.m1.starwars.services.StarshipService;

import java.util.List;

@RestController
@RequestMapping(path="/api/fleet")
public class StarshipController {

    private final StarshipService starshipService;

    public StarshipController(StarshipService starshipService) {
        this.starshipService = starshipService;
    }

    @GetMapping()
    public List<Starship> getFleetForPassengers(@RequestParam("passengers") int nbPassengers) {
        return starshipService.fleetForPassengers(nbPassengers);
    }
}
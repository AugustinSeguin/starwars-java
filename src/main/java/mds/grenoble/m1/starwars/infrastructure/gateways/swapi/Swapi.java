package mds.grenoble.m1.starwars.infrastructure.gateways.swapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mds.grenoble.m1.starwars.infrastructure.gateways.swapi.response.SwapiStarship;
import mds.grenoble.m1.starwars.infrastructure.gateways.swapi.response.SwapiStarshipPage;

@Service
public class Swapi {
	private static final String URL = "https://swapi.dev/api/";
	private List<SwapiStarship> cache;

	public List<SwapiStarship> getStarships() {
		if (cache == null) {
			RestTemplate template = new RestTemplate();
			List<SwapiStarship> starships = new ArrayList<>();
			String url = URL + "starships";
			while (url != null) {
				var response = template.getForEntity(url, SwapiStarshipPage.class);
				var body = response.getBody();
				starships.addAll(body.results);
				url = body.next;
			}
			cache = starships;
		}
		return cache;
	}
}
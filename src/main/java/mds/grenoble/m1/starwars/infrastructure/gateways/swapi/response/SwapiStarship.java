package mds.grenoble.m1.starwars.infrastructure.gateways.swapi.response;

import mds.grenoble.m1.starwars.core.domain.Starship;

public class SwapiStarship {
	public String name;
	public String crew;
	public String passengers;
	public String starship_class;

	public Starship toDomain(int id) {
		Starship bo = new Starship(id);
		bo.name = name;
		bo.crew = ParseCount(crew);
		bo.passengers = ParseCount(passengers);
		bo.category = ParseCategory(starship_class);
		return bo;
	}

	private static int ParseCount(String value) {
		try {
			return value != null ? Integer.parseInt(value) : 0;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}

	private static Starship.Category ParseCategory(String value) {
		try {
			return Starship.Category.valueOf(value);
		} catch (IllegalArgumentException ex) {
			return Starship.Category.OTHER;
		}
	}
}
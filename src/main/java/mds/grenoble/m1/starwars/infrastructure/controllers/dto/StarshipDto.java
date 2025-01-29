package mds.grenoble.m1.starwars.infrastructure.controllers.dto;

import mds.grenoble.m1.starwars.core.domain.Starship;

public record StarshipDto (String name,
		int crew,
		int passengers,
		Starship.Category category)
{
	
	public static StarshipDto of(Starship starship)
	{
		return new StarshipDto(starship.name, starship.crew, starship.passengers, starship.category);
	}	
}

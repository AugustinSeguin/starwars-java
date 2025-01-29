package mds.grenoble.m1.starwars.infrastructure.gateways.adaptaters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.StreamUtils;
import org.springframework.stereotype.Service;

import mds.grenoble.m1.starwars.core.domain.Starship;
import mds.grenoble.m1.starwars.core.spi.StarshipRepositoryPort;
import mds.grenoble.m1.starwars.infrastructure.gateways.StarshipRepository;
import mds.grenoble.m1.starwars.infrastructure.orm.StarshipEntity;

@Service
public class StarshipRepositoryAdapter implements StarshipRepositoryPort {

	@Autowired
	StarshipRepository repository;

	@Override
	public List<Starship> findAll() {
		return StreamUtils.createStreamFromIterator(repository.findAll().iterator()).map(StarshipEntity::toDomain)
				.toList();
	}
}
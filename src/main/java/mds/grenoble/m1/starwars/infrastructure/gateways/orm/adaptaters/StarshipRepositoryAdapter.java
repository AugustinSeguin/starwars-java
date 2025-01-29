package mds.grenoble.m1.starwars.infrastructure.gateways.orm.adaptaters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.util.StreamUtils;
import org.springframework.stereotype.Service;

import mds.grenoble.m1.starwars.core.domain.Starship;
import mds.grenoble.m1.starwars.core.spi.StarshipRepositoryPort;
import mds.grenoble.m1.starwars.infrastructure.gateways.orm.StarshipRepository;
import mds.grenoble.m1.starwars.infrastructure.gateways.orm.entities.StarshipEntity;

@Service
@ConditionalOnProperty(value = "starwars.settings.source", havingValue = "database")
public class StarshipRepositoryAdapter implements StarshipRepositoryPort {

	@Autowired
	StarshipRepository repository;

	@Override
	public List<Starship> findAll() {
		return StreamUtils.createStreamFromIterator(repository.findAll().iterator()).map(StarshipEntity::toDomain)
				.toList();
	}
}
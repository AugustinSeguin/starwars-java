package mds.grenoble.m1.starwars.infrastructure.gateways;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mds.grenoble.m1.starwars.infrastructure.orm.StarshipEntity;

@Repository
public interface StarshipRepository extends CrudRepository<StarshipEntity, Long>
{
}
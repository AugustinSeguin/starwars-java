package mds.grenoble.m1.starwars.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mds.grenoble.m1.starwars.models.*;

@Repository
public interface StarshipRepository extends CrudRepository<Starship, Long>
{
	@Query("SELECT s FROM Starship s WHERE s.passengers > 0 ORDER BY s.passengers ASC")
    List<Starship> findAllOrderByNbPassengersAsc();

	@Query("SELECT s FROM Starship s WHERE s.passengers = :nbPassengers ORDER BY s.passengers ASC")
	List<Starship> findTopByNbPassengers(@Param("nbPassengers") int nbPassengers);
	
	@Query("SELECT s FROM Starship s WHERE s.passengers > :nbPassengers ORDER BY s.passengers ASC")
	List<Starship> findByNbPassengersRoundedAbove(@Param("nbPassengers") int nbPassengers);
}

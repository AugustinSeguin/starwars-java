package mds.grenoble.m1.starwars.infrastructure.orm;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import mds.grenoble.m1.starwars.core.domain.Starship;

@Entity(name="starship")
public class StarshipEntity {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 public Long id;
	 
	 @Column(unique=true)
	 public String name;
	 
	 public int crew;
	 
	 public int passengers;
	 
	 @Enumerated(EnumType.STRING)
	 public Starship.Category category;
	 
	 @OneToMany(mappedBy="starship", fetch=FetchType.EAGER)
	 public List<PilotEntity> pilots;
	 
	 public Starship toDomain() {
		 Starship bo = new Starship(id);
		 bo.crew = crew;
		 bo.passengers = passengers;
		 bo.category = category;
		 bo.pilots = new ArrayList<>();
		 return bo;
	 }
  
}
 
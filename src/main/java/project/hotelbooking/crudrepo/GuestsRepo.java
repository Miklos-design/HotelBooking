package project.hotelbooking.crudrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hotelbooking.entities.Guests;

public interface GuestsRepo extends JpaRepository<Guests, Integer> {

	
	public List<Guests> findGuestsByName(String name);


}
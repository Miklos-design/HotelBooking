package project.hotelbooking.crudrepo;

import org.springframework.data.repository.CrudRepository;

import project.hotelbooking.entities.Guests;

public interface GuestsRepo extends CrudRepository<Guests, Integer> {

}
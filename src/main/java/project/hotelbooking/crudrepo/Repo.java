package project.hotelbooking.crudrepo;
import org.springframework.data.repository.CrudRepository;

import project.hotelbooking.entities.Guest;

public interface Repo extends CrudRepository<Guest, Integer> {

}
package project.hotelbooking.crudrepo;

import org.springframework.data.repository.CrudRepository;

import project.hotelbooking.entities.Room;

public interface RoomRepo extends CrudRepository<Room, Integer> {

}

package project.hotelbooking.crudrepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.hotelbooking.entities.Room;

@Repository
public interface RoomRepo extends CrudRepository<Room, Integer> {
	
	public Iterable <Room> findRoomByType(String type);
	

}

package project.hotelbooking.crudrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.hotelbooking.entities.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {
	
	public Iterable <Room> findRoomByType(String type);
	

}

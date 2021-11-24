package project.hotelbooking.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.RoomRepo;
import project.hotelbooking.entities.Room;

@Service
public class RoomService {
	
		@Autowired
		private RoomRepo Roomrepo;
		
		public Iterable<Room> getAllRooms(){
			return Roomrepo.findAll();
		}
		
		public Optional<Room> getRoomByNumber(Integer id) {
			return Roomrepo.findById(id);
		}
		
		public Iterable <Room> finRoomByType(String type){
			return Roomrepo.findRoomByType(type);
		}

}

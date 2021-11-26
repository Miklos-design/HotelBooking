package project.hotelbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.RoomRepo;
import project.hotelbooking.entities.Room;
import project.hotelbooking.exceptions.RoomNotFound;

@Service
public class RoomService {
	
		@Autowired
		private RoomRepo Roomrepo;
		
		public Iterable<Room> getAllRooms(){
			return Roomrepo.findAll();
		}
		
		public Room getRoomByNumber(Integer id) {
			return Roomrepo.findById(id).orElseThrow(RoomNotFound::new);
		}
		
		public Iterable <Room> findByType(String type){
			return Roomrepo.findRoomByType(type);
		}

}

package project.hotelbooking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.hotelbooking.entities.Room;
import project.hotelbooking.service.RoomService;

@RestController
@RequestMapping(path = "/rooms")

public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	 @GetMapping(path="/allrooms")
	  public @ResponseBody Iterable<Room> getAllRooms() {
	    return roomService.getAllRooms();
	 }
	 @GetMapping(path="/{id}")
		public @ResponseBody Optional<Room> getRoomById(@PathVariable(name = "id") Integer id) {
			return roomService.getRoomByNumber(id);
		}
	 
	 @GetMapping(path="/findByType/{type}")
		public @ResponseBody Iterable<Room> getRoomByType(@PathVariable(name = "type") String type) {
			return roomService.finRoomByType(type);
		}


}

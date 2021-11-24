package project.hotelbooking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.hotelbooking.entities.Guests;
import project.hotelbooking.service.GuestsService;
import project.hotelbooking.service.ReservationService;

@RestController
@RequestMapping(path="/reservations")

public class ReservationController {
	
	
	  @Autowired 
	  private ReservationService reservations;

	  @PostMapping(path="/newreservation") 
	  public @ResponseBody String addNewRes (@RequestBody Reservation reservation) {
		  return reservations.addReservation (reservation);
	  }

	  @GetMapping(path="/allguests")
	  public @ResponseBody Iterable<Guests> getAllGuests() {
	    return service.getAllGuests();
	  }
	  
	  @GetMapping(path="/{id}")
		public @ResponseBody Optional<Guests> getGuestById(@PathVariable(name = "id") Integer id) {
			return service.getGuest(id);
		}
	  
	  @PostMapping(path="/update/{id}")
		public @ResponseBody String updateGuest(@PathVariable(name = "id") Integer id, @RequestBody 
	        Guests guest) {
			return service.updateGuest(id, guest);
		}
	  
	  @DeleteMapping(path="/delete/{id}")
		public @ResponseBody String deleteGuest(@PathVariable(name = "id") Integer id) {
			return service.deleteGuest(id);
		}

}

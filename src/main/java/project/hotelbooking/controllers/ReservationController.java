package project.hotelbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.hotelbooking.entities.Reservation;
import project.hotelbooking.service.ReservationService;

@RestController
@RequestMapping(path="/reservations")

public class ReservationController {
	
	
	  @Autowired 
	  private ReservationService reservations;

	  @PostMapping(path="/newreservation") 
	  public @ResponseBody ResponseEntity <Reservation> addNewRes (@RequestBody Reservation reservation) {
		  return new ResponseEntity <> (reservations.addReservation (reservation), HttpStatus.CREATED);
	  }
		

	  @GetMapping(path="/allreservations")
	  public @ResponseBody Iterable<Reservation> allReservations() {
	    return reservations.getReservations();
	  }
	  
	  @GetMapping(path="/{id}")
		public @ResponseBody Reservation getReservationById(@PathVariable(name = "id") Integer id) {
			return reservations.getRes(id);
		}
	  
	  @PostMapping(path="/update/{id}")
		public @ResponseBody ResponseEntity <Reservation> updateReservation(@PathVariable(name = "id") Integer id, @RequestBody 
	        Reservation reservation) {
			return new ResponseEntity <>(reservations.updateReservation (id, reservation), HttpStatus.ACCEPTED);
			
			 }
		
	  
	  @DeleteMapping(path="/delete/{id}")
		public @ResponseBody boolean deleteReservation(@PathVariable(name = "id") Integer id) {
			return reservations.deleteReservation (id);
		}

}

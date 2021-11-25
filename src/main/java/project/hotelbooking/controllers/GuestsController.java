package project.hotelbooking.controllers;

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


@RestController
@RequestMapping(path="/guests") 

public class GuestsController {


	  @Autowired 
	  private GuestsService service;

	  @PostMapping(path="/addguest") 
	  public @ResponseBody Guests addNewGuest (@RequestBody Guests guest) {
		  return service.addGuest(guest); 
	  }

	  @GetMapping(path="/allguests")
	  public @ResponseBody Iterable<Guests> getAllGuests() {
	    return service.getAllGuests();
	  }
	  
	  @GetMapping(path="/{id}")
		public @ResponseBody Guests getGuestById(@PathVariable(name = "id") Integer id) {
			return service.findById(id);
		}
	  
	  
	  @PostMapping(path="/update/{id}")
		public @ResponseBody Guests updateGuest(@PathVariable(name = "id") Integer id, @RequestBody 
	        Guests guest) {
			return service.updateGuest(id, guest);
		}
	  
	  @DeleteMapping(path="/delete/{id}")
		public @ResponseBody String deleteGuest(@PathVariable(name = "id") Integer id) {
			return service.deleteGuest(id);
		}
	  
	}

//@RequestParam int id, @RequestParam String name
//, @RequestParam String email for post mapping parameters
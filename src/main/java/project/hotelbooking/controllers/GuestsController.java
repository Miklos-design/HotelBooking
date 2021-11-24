package project.hotelbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import project.hotelbooking.crudrepo.Repo;
import project.hotelbooking.entities.Guest;


@Controller
@RequestMapping(path="/hotelbooking") 

public class GuestsController {


	  @Autowired 
	  private Repo guests;

	  @PostMapping(path="/add") 
	  public @ResponseBody String addNewGuest (@RequestBody Guest guest) {

	    //Guest guest = new Guest();
//	    guest.setId(id);
//	    guest.setName(name);
//	    guest.setEmail(email);
	    guests.save(guest);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Guest> getAllGuests() {
	    return guests.findAll();
	  }
	  
	}

//@RequestParam int id, @RequestParam String name
//, @RequestParam String email for post mapping parameters
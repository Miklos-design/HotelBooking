package project.hotelbooking.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.GuestsRepo;
import project.hotelbooking.entities.Guests;

@Service
public class GuestsService {
	
	@Autowired
	private GuestsRepo GuestRepository;
	
	
	public String addGuest(Guests s) {
		
		try {
			GuestRepository.save(s);
			return "saved";
		} catch(Exception e) {
			return "failed";
		}
	}

	public Iterable<Guests> getAllGuests(){
		return GuestRepository.findAll();
	}
	

	public Optional<Guests> getGuest(Integer id) {
		return GuestRepository.findById(id); //.orElseThrow(EmployeeNotFound::new);
	}
	
	
	public String updateGuest(Integer id, Guests s) {
		try {
			s.setId(id);
			GuestRepository.save(s);
			return "Updated";
		}catch(Exception e) {
			return "Failed";
		}
	}
	
	
	public String deleteGuest(Integer id) {
		try{
			GuestRepository.deleteById(id);
			return "Deleted";
		}catch(Exception e) {
			return "Failed";
		}
	}
	
}

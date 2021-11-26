package project.hotelbooking.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.GuestsRepo;
import project.hotelbooking.entities.Guests;
import project.hotelbooking.exceptions.GuestNotFound;

@Service
public class GuestsService {
	
	@Autowired
	private GuestsRepo GuestRepository;
	
	
	public Guests addGuest(Guests s) {
			GuestRepository.save(s);
			return s;
		}
	
	
	public List<Guests> getAllGuests(){
		return GuestRepository.findAll();
	}
	

	public Guests findById(Integer id) {
		return GuestRepository.findById(id).orElseThrow(GuestNotFound::new);
	}

	
	public Guests updateGuest(Integer id, Guests s) {
			s.setId(id);
			GuestRepository.save(s);
			return s;
	}
	
	
	public boolean deleteGuest(Integer id) {
			GuestRepository.deleteById(id);
			return true;
			
	
	
}
}

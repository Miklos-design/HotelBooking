package project.hotelbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.ReservationRepo;
import project.hotelbooking.entities.Reservation;
import project.hotelbooking.exceptions.ReservationNotFound;

@Service

public class ReservationService {
	
		@Autowired
		private ReservationRepo reserv;
		
		public Reservation addReservation(Reservation r) {
				reserv.save(r);
				return r;
			}
		
		public Iterable<Reservation> getReservations(){
			return reserv.findAll();
		}
		

		public Reservation getRes(Integer id) {
			return reserv.findById(id).orElseThrow(ReservationNotFound::new);
		}
		
		
		public String updateReservation(Integer id, Reservation r) {
			try {
				r.setId(id);
				reserv.save(r);
				return "Your booking is Updated";
			}catch(Exception e) {
				return "Failed to update reservation infromation";
			}
		}
		
		
		public String deleteReservation(Integer id) {
			try{
				reserv.deleteById(id);
				return "Your booking is deleted from the system";
			}catch(Exception e) {
				return "Failed to delete your reservation";
			}
		}
}

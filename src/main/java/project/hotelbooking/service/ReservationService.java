package project.hotelbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hotelbooking.crudrepo.ReservationRepo;
import project.hotelbooking.entities.Reservation;

@Service

public class ReservationService {
	
		@Autowired
		private ReservationRepo reserv;
		
		public String addReservation(Reservation r) {
			
			try {
				reserv.save(r);
				return "Your booking has been confirmed";
			} catch(Exception e) {
				return "Please insert valid reservation infromation";
			}
		}
		
		public Iterable<Reservation> getReservations(){
			return reserv.findAll();
		}
		

		public Optional<Reservation> getRes(Integer id) {
			return reserv.findById(id);
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

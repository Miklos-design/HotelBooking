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
		
		
		public Reservation updateReservation(Integer id, Reservation r) {
				r.setId(id);
				reserv.save(r);
				return r;
				}
		
		
		public boolean deleteReservation(Integer id) {
			reserv.deleteById(id);
				return true;
			}
		
}

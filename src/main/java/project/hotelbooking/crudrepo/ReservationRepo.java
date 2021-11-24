package project.hotelbooking.crudrepo;

import org.springframework.data.repository.CrudRepository;

import project.hotelbooking.entities.Reservation;

public interface ReservationRepo extends CrudRepository<Reservation, Integer> {

}

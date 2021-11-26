package project.hotelbooking.crudrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hotelbooking.entities.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}

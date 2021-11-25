package project.hotelbooking.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import project.hotelbooking.crudrepo.GuestsRepo;
import project.hotelbooking.crudrepo.ReservationRepo;
import project.hotelbooking.entities.Reservation;
import project.hotelbooking.service.GuestsService;
import project.hotelbooking.service.ReservationService;


@SpringBootTest
public class ReservationServiceTest {
	
	@MockBean
	ReservationRepo repo;
	
	@Autowired
    private ReservationService service;
	
	@Test
	void addReservTest() {
		Reservation reservation = new Reservation();
		when(repo.save(reservation)).thenReturn(reservation);
		assertThat(reservation, service.addReservation(reservation));  
		verify(repo, times(1)).save(reservation);
	}
	
	
//	@Test
//	void getAllGuests() {
//		when(repo.findAll()).thenReturn(new ArrayList<>());
//		assertThat(service.getAllGuests()).isEqualTo(new ArrayList<>());
//		verify(repo, times(1)).findAll();
//	}
//	
//	
//	@Test
//	void testFindById() {
//		Reservation testGuest = new Reservation();
//		Optional<Reservation> option = Optional.of(testGuest);
//		when(repo.findById((Integer) 1)).thenReturn(option);
//		assertThat(service.findById((Integer) 1)).isEqualTo(testGuest);
//		verify(repo, times(1)).findById((Integer) 1);
//	}
//	
//
//	
//	@Test
//	void testUpdateGuest() {
//		Reservation testGuest = new Reservation();			
//		assertThat(service.updateGuest((Integer) 1, testGuest)).isEqualTo(testGuest);
//		testGuest.setId((Integer) 1);
//		verify(repo, times(1)).save(testGuest);
//	}
//	
//	
//	@Test
//	void testDeleteGuest() {
//		when(repo.existsById((Integer) 1)).thenReturn(false);
//		assertThat(service.deleteGuest((Integer) 1)).isEqualTo(true);
//		verify(repo, times(1)).deleteById((Integer) 1);
//	}

}

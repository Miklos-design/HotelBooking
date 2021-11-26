package project.hotelbooking.services;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import project.hotelbooking.crudrepo.ReservationRepo;
import project.hotelbooking.entities.Reservation;
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
		assertEquals( service.addReservation(reservation), reservation);  
		verify(repo, times(1)).save(reservation);
	}
	
	
	@Test
	void getAllResTest() {
		when(repo.findAll()).thenReturn(new ArrayList<>());
		assertThat(service.getReservations()).isEqualTo(new ArrayList<>());
		verify(repo, times(1)).findAll();
	}
	
	
	@Test
	void testFindById() {
		Reservation testRes = new Reservation();
		Optional<Reservation> option = Optional.of(testRes);
		when(repo.findById((Integer) 1)).thenReturn(option);
		assertThat(service.getRes((Integer) 1)).isEqualTo(testRes);
		verify(repo, times(1)).findById((Integer) 1);
	}
	

	
	@Test
	void testUpdate() {
		Reservation testRes = new Reservation();			
		assertThat(service.updateReservation((Integer) 1, testRes)).isEqualTo(testRes);
		testRes.setId((Integer) 1);
		verify(repo, times(1)).save(testRes);
	}
	
	
	@Test
	void testDelete() {
		when(repo.existsById((Integer) 1)).thenReturn(false);
		assertThat(service.deleteReservation((Integer) 1)).isEqualTo(true);
		verify(repo, times(1)).deleteById((Integer) 1);
	}

}

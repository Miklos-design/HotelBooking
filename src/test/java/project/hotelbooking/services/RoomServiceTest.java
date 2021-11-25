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

import project.hotelbooking.crudrepo.RoomRepo;
import project.hotelbooking.entities.Room;
import project.hotelbooking.service.RoomService;

@SpringBootTest
public class RoomServiceTest {
	
	@MockBean
	RoomRepo repo;
	
	@Autowired
    private RoomService service;
	
	
	@Test
	void getAllRooms() {
		when(repo.findAll()).thenReturn(new ArrayList<>());
		assertThat(service.getAllRooms()).isEqualTo(new ArrayList<>());
		verify(repo, times(1)).findAll();
	}
	
	
	@Test
	void testFindById() {
		Optional<Room> testRoom = Optional.of(new Room());
		// Optional<Room> option = Optional.of(testRoom);
		when(repo.findById(Integer)1)).thenReturn(testRoom);
		assertThat(service.getRoomByNumber((Integer) 1)).isEqualTo(testRoom);
		verify(repo, times(1)).findById((Integer) 1);
   }
	
	
}

package project.hotelbooking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  
	  private Integer id;
	  
	 
	  private String date;
	  
	  
	  private String guest_name;

	  
	  private Integer room_number;
	  
		  // room_number is foreign key in existent table
		  
//	  @OneToOne(cascade = CascadeType.ALL)
//	  @JoinColumn(name = "room_number", referencedColumnName = "room_number") 
//	  private Room room;

	  

	public Reservation(Integer id, String date, String guest_name, Integer room_number, Room room) {
		super();
		this.id = id;
		this.date = date;
		this.guest_name = guest_name;
		this.room_number = room_number;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getGuest_name() {
		return guest_name;
	}


	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}


	public Integer getRoom_number() {
		return room_number;
	}


	public void setRoom_number(Integer room_number) {
		this.room_number = room_number;
	}


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
		 
}
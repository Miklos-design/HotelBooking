package project.hotelbooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Room {
	 
	
		
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "room_number")
	  private Integer room_number;

	  @Column
	  private String type;

	  @Column
	  private Integer price;
	  
	  @Column
	  private boolean booked;
	  
//fk already exist, hence commented out the code cos program tries to bound it again and fails
	  
//	   @OneToOne(mappedBy = "Room")
//	   private Reservation reservation;

	public Room(Integer room_number, boolean booked, Integer price, String type) {
		super();
		this.room_number = room_number;
		this.booked = booked;
		this.price = price;
		this.type = type;	
		
	}

	public Integer getId() {
		return room_number;
	}

	public void setId(Integer id) {
		this.room_number = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	
	}



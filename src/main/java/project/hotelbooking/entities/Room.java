package project.hotelbooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity 
@Data
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



	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	
	}



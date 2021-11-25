package project.hotelbooking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
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


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
		 
}
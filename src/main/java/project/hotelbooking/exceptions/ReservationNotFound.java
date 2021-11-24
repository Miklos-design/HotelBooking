package project.hotelbooking.exceptions;
import org.springframework.http.HttpStatus;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;


@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This reservation doesnt exist in our records, please check once again the ID")
public class ReservationNotFound extends EntityNotFoundException {

}


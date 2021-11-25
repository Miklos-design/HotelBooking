package project.hotelbooking.exceptions;
import org.springframework.http.HttpStatus;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;


@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This room is not found, try the number between 0 and 36")
public class RoomNotFound extends EntityNotFoundException {

}


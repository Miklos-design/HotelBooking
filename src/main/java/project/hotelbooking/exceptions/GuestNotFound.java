package project.hotelbooking.exceptions;
import org.springframework.http.HttpStatus;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;


@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This loyal card doesn't exist or is not registered, try once again, use 5 digits")
public class GuestNotFound extends EntityNotFoundException {

}




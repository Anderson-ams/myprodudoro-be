package br.com.dev.wakandaacademy.produdoro.handler;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@Log4j2
public class APIException extends RuntimeException {

	private HttpStatus statusException;
	private ErrorApiResponse bodyException;
	
	private  APIException(HttpStatus statusException, String messege, Exception e) {
		super(messege, e);
		this.statusException = statusException;
		this.bodyException = ErrorApiResponse.builder()
						.message(messege)
						.description(getDescription(e))
						.build();
	}
		
	private String getDescription(Exception e) {
		return Optional.ofNullable(e).map(APIException::getMessageCause).orElse(null);
	}


	private static String getMessageCause(Exception e) {
		return e.getCause() != null ? e.getCause().getMessage():e.getMessage();
	}	
	
	private APIException build(HttpStatus statusException, String message) {
		return new APIException(statusException, message, null);
	}
	
	private APIException build(HttpStatus statusException, String message, Exception e) {
		log.error("Exception: ",e);
		return new APIException(statusException, message, e);
	}

	public ResponseEntity<ErrorApiResponse> buildErrorResponseEntity(){
		return ResponseEntity
				.status(statusException)
				.body(bodyException);
	}
	
		private static final long serialVersionUID = 1L;

}

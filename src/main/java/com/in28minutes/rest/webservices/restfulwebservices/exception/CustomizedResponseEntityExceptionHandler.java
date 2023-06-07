package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.net.http.HttpHeaders;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);

	}

//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), ex.getFieldError().getDefaultMessage(),
//			request.getDescription(false));
//		return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
//	}
}

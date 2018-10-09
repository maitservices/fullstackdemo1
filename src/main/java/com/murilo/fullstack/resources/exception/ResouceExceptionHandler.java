package com.murilo.fullstack.resources.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.murilo.fullstack.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResouceExceptionHandler {

	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException)
	
}

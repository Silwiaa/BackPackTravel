package com.backpacktravel.controller;

import com.backpacktravel.controller.exception.DestinationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalHttpErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DestinationNotFoundException.class)
    public ResponseEntity<Object> handleDestinationNotFoundException(DestinationNotFoundException exception) {
        return new ResponseEntity<>("Destination with given name doesn't exist or can't be found", HttpStatus.NOT_FOUND);
    }
}

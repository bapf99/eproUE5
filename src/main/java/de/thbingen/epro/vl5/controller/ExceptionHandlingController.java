package de.thbingen.epro.vl5.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.awt.image.ImagingOpException;
import java.io.IOException;

@Controller
@ControllerAdvice //noetig fuer zentralen exception controller
public class ExceptionHandlingController {

    //Beispiel:
    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIOException(ImagingOpException ex) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex){
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

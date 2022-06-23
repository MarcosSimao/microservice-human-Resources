package com.api.msuser.controller.exceptionControler;

import com.api.msuser.model.StandarError;
import com.api.msuser.model.exception.ObjectConflictException;
import com.api.msuser.model.exception.ObjectInternalErrorExcption;
import com.api.msuser.model.exception.ObjectNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerException {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> notFound(ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status= HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).body(new StandarError(LocalDateTime.now(),status.value(), e.getMessage(), request.getRequestURI()));
    }
    @ExceptionHandler(ObjectConflictException.class)
    public ResponseEntity<StandarError> conflic(ObjectConflictException e,HttpServletRequest request){
        HttpStatus status= HttpStatus.CONFLICT;
        return ResponseEntity.status(status).body(new StandarError(LocalDateTime.now(),status.value(), e.getMessage(), request.getRequestURI()));
    }
    @ExceptionHandler(ObjectInternalErrorExcption.class)
    public ResponseEntity<StandarError> internalError(ObjectInternalErrorExcption e,HttpServletRequest request){
        HttpStatus status= HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(status).body(new StandarError(LocalDateTime.now(),status.value(), e.getMessage(), request.getRequestURI()));
    }
}

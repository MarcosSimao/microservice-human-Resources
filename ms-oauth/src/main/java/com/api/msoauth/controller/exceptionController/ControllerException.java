package com.api.msoauth.controller.exceptionController;


import com.api.msoauth.model.StandarError;
import com.api.msoauth.model.exceptions.ObjectException;
import com.api.msoauth.model.exceptions.ObjectInternalErrorExcption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerException {
    @ExceptionHandler(ObjectException.class)
    public ResponseEntity<StandarError> feing(ObjectException e, HttpServletRequest request){
      return ResponseEntity.status(e.status()).body(new StandarError(LocalDateTime.now(),e.status(), e.getMessage(), request.getRequestURI()));

    }
    @ExceptionHandler(ObjectInternalErrorExcption.class)
    public ResponseEntity<StandarError> internalError(ObjectInternalErrorExcption e, HttpServletRequest request){
        HttpStatus status= HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(status).body(new StandarError(LocalDateTime.now(),status.value(), e.getMessage(), request.getRequestURI()));
    }
}

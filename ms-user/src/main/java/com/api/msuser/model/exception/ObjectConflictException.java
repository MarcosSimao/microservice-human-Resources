package com.api.msuser.model.exception;

public class ObjectConflictException extends RuntimeException{

    public ObjectConflictException(String msg){
        super(msg);
    }
}

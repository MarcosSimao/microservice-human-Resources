package com.api.trabalhador.model.exceptions;

public class ObjectConflictException extends RuntimeException{

    public ObjectConflictException(String msg){
        super(msg);
    }
}

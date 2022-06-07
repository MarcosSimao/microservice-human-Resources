package com.api.folhapagamento.model.exceptions;

import feign.FeignException;

import java.util.Arrays;
import java.util.List;

public class ObjectException extends FeignException{
    public ObjectException(FeignException e){
        super(e.status(),convertMessage(e.toString()));
    }

    private static String convertMessage(String msg){
       String i=msg.substring(msg.indexOf("message"),msg.indexOf("path"));
       List<String> s=Arrays.asList(i.split(":"));
        return s.get(1).replace("\"","");
    }
}
package com.api.folhapagamento.model.exceptions;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
@Slf4j
public class ObjectException extends FeignException{
    public ObjectException(FeignException e){
        super(e.status(),convertMessage(e.toString()));
    }

    private static String convertMessage(String msg){
        log.info("mensagem {}",msg);
       String i=msg.substring(msg.indexOf("message"),msg.indexOf("path"));
       List<String> s=Arrays.asList(i.split(":"));
        return s.get(1).replace("\"","");
    }
}
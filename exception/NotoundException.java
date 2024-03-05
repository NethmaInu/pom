package com.springbootaccadamy.batch8.pos1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotoundException extends Exception{
    public NotoundException(String message){
        super(message);
    }

}

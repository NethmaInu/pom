package com.springbootaccadamy.batch8.pos1.exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class NotFoundException extends Exception{
    public NotFoundException(String message){
        super(message);
    }
}

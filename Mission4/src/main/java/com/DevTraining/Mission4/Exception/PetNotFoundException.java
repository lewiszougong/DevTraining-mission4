package com.DevTraining.Mission4.Exception;


//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class PetNotFoundException extends RuntimeException{

    public PetNotFoundException(String msg){
        super(msg);
    }
}

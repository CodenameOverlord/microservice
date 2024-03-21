package com.lcwd.user.service.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource not present in the server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}

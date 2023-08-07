package com.example.EmployeeManager.exceptions;

public class UserNotFoundExceptions extends RuntimeException {
    public UserNotFoundExceptions(String message) {

        super(message);
    }
}

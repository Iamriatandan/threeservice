package com.reservation.reservationservice.exception;

public class GuestNotFoundException extends RuntimeException{
    public GuestNotFoundException(String message) {
        super(message);
    }
}

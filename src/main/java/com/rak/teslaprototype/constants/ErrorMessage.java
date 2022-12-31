package com.rak.teslaprototype.constants;

public enum ErrorMessage {
    CAR_NOT_FOUND("No cars found with this id");


    public final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}

package com.gatomalvado.exceptions;

public class EndOfFileReachedException extends RuntimeException {
    public EndOfFileReachedException(String message) {
        super(message);
    }
}

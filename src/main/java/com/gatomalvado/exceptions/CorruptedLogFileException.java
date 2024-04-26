package com.gatomalvado.exceptions;

public class CorruptedLogFileException extends RuntimeException {
    public CorruptedLogFileException(String message) {
        super(message);
    }
}

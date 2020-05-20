package com.bl.quantity;
public class QuantityMeasurementException extends RuntimeException {
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION;
    }

    public ExceptionType type;
    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}

package com.bl.quantity.exception;
public class QuantityMeasurementException extends RuntimeException {
    /**+
     * @purpose:Declared Constant
     */
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION;
    }

    public ExceptionType type;
    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}

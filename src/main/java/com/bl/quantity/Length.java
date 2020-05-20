package com.bl.quantity;
public enum Length {
    FEET(  12), INCH(1 ),YARD (36),CENTIMETER(0.4),GALLON(3.78),LITRE(1);

    public final double value;

    Length(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
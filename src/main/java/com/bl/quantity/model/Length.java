package com.bl.quantity.model;
public enum Length {
    /** Enum For Feet */
    FEET( 12),

    /** Enum For Inch */
    INCH(1 ),

    /** Enum For Yard */
    YARD (36),

    /** Enum For CM to inch */
    CENTIMETER(0.4),

    /** Enum For Gallon to Litre */
    GALLON(3.78),

    /** Enum For Litre */
    LITRE(1),

    /** Enum For milliliter too litre */
    ML(0.001),

    /** Enum For tonne to kg */
    KILOGRAMS(1),

    /** Enum For tonne to kg */
    GRAM(0.001),

    /** Enum For tonne to tonne */
    TONNE(1000),

    /** Enum For Fahrenheit to celsius */
    FAHRENHEIT(1), CELSIUS( 2.12);

    public final double value;
    /**+
     * @purpose:pass the single double type value
     * @param value:return double type value
     */
    Length(double value) {
        this.value = value;
    }

    /**+
     * @purpose :function used for get value
     * @return:return value
     */
    public double getValue() {
        return value;
    }
}
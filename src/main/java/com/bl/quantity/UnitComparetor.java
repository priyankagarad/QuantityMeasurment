package com.bl.quantity;
public class UnitComparetor {
    private double value;

    /**+
     * @purpose:Constructor pass two parameter
     * @param value:variable
     * @param length:unit value
     */
    public UnitComparetor( double value, Length length) {
        this.value = compare(value, length);
    }

    /**+
     * @purpose:compare function multiple of given value with unit value
     * @param value:variable
     * @param length: unit value
     * @return:calculated value
     */
    public double compare(double value,Length length){
        return value * length.getValue();
    }

    /**+
     * @purpose:Method Used For Check Equality of Object
     * @param :Reference Object
     * @return:return Result True or False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UnitComparetor that = (UnitComparetor) o;
        return Double.compare(that.value, value) == 0;
    }

    /**+
     * @purpose:Method used for get value
     * @return:return value
     */
    public double getValue() {
        return value;
    }
}



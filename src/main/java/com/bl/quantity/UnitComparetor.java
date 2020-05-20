package com.bl.quantity;
import sun.security.util.Length;
public class UnitComparetor {

    private double value;

    public UnitComparetor( double value, Length length) {
        this.value = compare(value, length);
    }

    public double compare(double value,Length length){
        return value * length.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitComparetor that = (UnitComparetor) o;
        return Double.compare(that.value, value) == 0;
    }
}


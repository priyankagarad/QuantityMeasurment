package com.bl.quantity;
public class UnitComparetor {

    private double value;

    public UnitComparetor( double value, Length length) {
        this.value = compare(value, length);
    }

    public double compare(double value,Length length){
        return value * length.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitComparetor that = (UnitComparetor) o;
        return Double.compare(that.value, value) == 0;
    }

    public double getValue() {
        return value;
    }

    public double addition(UnitComparetor unitComparetor, UnitComparetor unitComparetor2) {
        return unitComparetor.getValue()+unitComparetor2.getValue();
    }
}



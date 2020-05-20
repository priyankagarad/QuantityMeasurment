package com.bl.quantity;
public class QuantityMeasurment {
    private int inch = 12;
    public Boolean checkQuantity(int feet,int inches){
        if (feet == inches/inch)
            return true;
        else if (inches == feet*inch)
            return true;
        else
            return false;
    }
}

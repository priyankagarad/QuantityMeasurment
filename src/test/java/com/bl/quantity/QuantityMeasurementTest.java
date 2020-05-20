package com.bl.quantity;

import org.junit.Assert;
import org.junit.Test;
public class QuantityMeasurementTest {
    QuantityMeasurment quantityMeasurement = new QuantityMeasurment();

    @Test
    public void givenFitAndLength_WhenCompair_ThenTrue() {
        int feet = 2;
        int inch = 24;
        boolean result = quantityMeasurement.checkFeetQuantity(feet,inch);
        Assert.assertEquals(true,result);
    }
}

package com.bl.quantity;

import org.junit.Assert;
import org.junit.Test;
public class QuantityMeasurementTest {
    QuantityMeasurment quantityMeasurement = new QuantityMeasurment();

    @Test
    public void givenzeroFeetAndLength_WhenCompair_ThenTruQuantityMeasurementExceptione() {
        UnitComparetor unitComparetor = new UnitComparetor(0, Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(0, Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor, unitComparetor2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse()
    {
        boolean checkNullValue=quantityMeasurement.equals(null);
        Assert.assertEquals(false,checkNullValue);
    }
}

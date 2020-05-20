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
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse() throws  QuantityMeasurementException
    {
        boolean checkNullValue=quantityMeasurement.equals(null);
        Assert.assertEquals(false,checkNullValue);
    }

    @Test
    public void givenRefrenceObject_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException
    {
        QuantityMeasurment referenceCheck=new QuantityMeasurment();
        Assert.assertEquals(quantityMeasurement,referenceCheck);
    }

    @Test
    public void givenSameTypeWhenCompare_when_equal_ShouldReturnTrue() {
        double feet1 = 2, feet2 = 2;
        UnitComparetor unitComparetor1 = new UnitComparetor(feet1, Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2, Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor1, unitComparetor2);
        Assert.assertEquals(true, result);
    }
}

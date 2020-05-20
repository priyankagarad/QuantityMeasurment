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
    public void givenRefrenceObject_WhenEqual_ShouldReturnTrue()
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

    @Test
    public void givenSameTypeWhenCompare_ShouldReturnTrue() {
        double feet1 = 5.0,feet2 = 5.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInchAndInch_WhenCompareNull_shouldReturnFalse() throws QuantityMeasurementException {
        UnitComparetor converterInch = new UnitComparetor(0, Length.INCH);
        try {
            boolean result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenInchAndInchReference_WhenCompare_shouldReturnTrue() throws QuantityMeasurementException {
        Double feet = 2.0;
        Double value = feet;
        UnitComparetor unitComparetor = new UnitComparetor(value,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(value,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInchAndInch_WhenSameType_shouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = 24,feet2 = 24;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenSameInchTypeWhenCompare_whenequal_ShouldReturnTrue() {
        double inch1 = 2, inch2 = 2;
        UnitComparetor unitComparetor1 = new UnitComparetor(inch1, Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch2, Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor1, unitComparetor2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFeetAndInch_WhenZero_shouldTrue() throws QuantityMeasurementException {
        double feet1 = 0.0,feet2 = 0.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFeetAndInchValue_WhenNotEqualTo1_ShouldReturnFalse() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenInchAndFeet_WhenNotEqualTo1_1_ThFalse() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor2,unitComparetor);
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFeetAndInch_When1FeetEqulsTo12Inch_shouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFeetAndInch_When12InchEqualsTo1Feet_shouldReturnTrue() throws QuantityMeasurementException {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

}

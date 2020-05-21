package com.bl.quantity;
import com.bl.quantity.exception.QuantityMeasurementException;
import com.bl.quantity.model.Length;
import com.bl.quantity.model.UnitComparetor;
import org.junit.Assert;
import org.junit.Test;
public class QuantityMeasurementTest {
    QuantityMeasurment quantityMeasurement = new QuantityMeasurment();

    @Test
    public void givenZeroFeetAndZeroFeet_WhenCompare_shouldRetunTrue(){
        UnitComparetor unitComparetor = new UnitComparetor(0, Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(0, Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor, unitComparetor2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetNull_WhenCompare_shouldReturnFalse() {
        UnitComparetor converterInch = new UnitComparetor(0, Length.FEET);
        try {
            boolean result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenFeetAndFeetReference_WhenCompare_shouldReturnTrue() {
        Double feet = 2.0;
        Double value = feet;
        UnitComparetor unitComparetor = new UnitComparetor(value,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(value,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFeetTypeWhenCompare_whenEqual_ShouldReturnTrue() {
        double feet1 = 2, feet2 = 2;
        UnitComparetor unitComparetor1 = new UnitComparetor(feet1, Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2, Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor1, unitComparetor2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenSameValue_WhenCompare_ShouldReturnTrue() {
        double feet1 = 5.0,feet2 = 5.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInchValue_WhenCompareWithNull_shouldReturnFalse() {
        UnitComparetor converterInch = new UnitComparetor(0, Length.INCH);
        try {
            boolean result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenInchAndInchReference_WhenCompare_shouldReturnTrue(){
        Double feet = 2.0;
        Double value = feet;
        UnitComparetor unitComparetor = new UnitComparetor(value,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(value,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInchAndInch_WhenSameType_shouldReturnTrue()  {
        double feet1 = 24,feet2 = 24;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenSameInchValueCompare_whenEqual_ShouldReturnTrue() {
        double inch1 = 2, inch2 = 2;
        UnitComparetor unitComparetor1 = new UnitComparetor(inch1, Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch2, Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor1, unitComparetor2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFeetAndInch_WhenZero_shouldReturnTrue()  {
        double feet1 = 0.0,inch = 0.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenNotEqual_shouldReturnFalse() {
        double feet1 = 1.0,inch = 1.0;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor2,unitComparetor);
        Assert.assertEquals(false,result);
    }

    @Test
    public void given1FeetAnd12Inch_WhenEqual_shouldReturnTrue()  {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given12InchAnd1Feet_WhenEqual_shouldReturnTrue()  {
        double feet1 = 1.0,inch = 12.0;
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given3FeetAnd1Yard_WhenEqual_shouldReturnTrue()  {
        double feet1 = 3,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_shouldReturnFalse()  {
        double feet1 = 1,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet1,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_shouldReturnFalse()  {
        double inch = 1,yard = 1;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(false,result);
    }

    @Test
    public void given1YDAnd36in_WhenEqual_ShouldReturnTrue()  {
        double inch = 36,yard = 1;
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor2,unitComparetor);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given36InchAnd1YD_WhenEqual_ShouldReturnTrue()  {
        double inch = 36,yard = 1;
        UnitComparetor unitComparetor2 = new UnitComparetor(yard,Length.YARD);
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        boolean result = quantityMeasurement.compare(unitComparetor2,unitComparetor);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given2InchAnd5Centimeter_whenEqual_shouldReturnTrue()  {
        double inch = 2,centimeter = 5;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(centimeter,Length.CENTIMETER);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given2inchAnd2inch_WhenAdd_shouldReturnResult()  {
        double inch1 = 2,inch2 =2;
        UnitComparetor unitComparetor = new UnitComparetor(inch1,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch2,Length.INCH);
        double result =quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(4,result,0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddition_shouldReturnResult()  {
        double feet = 1,inch =2;
        UnitComparetor unitComparetor = new UnitComparetor(feet,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(inch,Length.INCH);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(14,result,0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddition_shouldReturnResult()  {
        double feet = 1,feet2 = 1;
        UnitComparetor unitComparetor = new UnitComparetor(feet,Length.FEET);
        UnitComparetor unitComparetor2 = new UnitComparetor(feet2,Length.FEET);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(24,result,0);
    }

    @Test
    public void giveninchAndCentimeter_WhenAddition_shouldReturnResult()  {
        double inch = 2,cm = 2.5;
        UnitComparetor unitComparetor = new UnitComparetor(inch,Length.INCH);
        UnitComparetor unitComparetor2 = new UnitComparetor(cm,Length.CENTIMETER);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(3,result,0);
    }

    @Test
    public void givenLitreAndMl_WhenCompare_shouldReturnTrue()  {
        double litre = 1,ml = 1000;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(ml,Length.ML);
        Boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenGallonAndLiter_whenAddition_shouldReturnResult()  {
        double gallon = 1,litre = 3.78;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(gallon,Length.GALLON);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(7.56,result,0);
    }

    @Test
    public void given1LitresAnd1000Ml_WhenAddition_shouldReturnResult()  {
        double ml = 1000,litre = 1;
        UnitComparetor unitComparetor = new UnitComparetor(litre,Length.LITRE);
        UnitComparetor unitComparetor2 = new UnitComparetor(ml,Length.ML);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(2,result,0);
    }

    @Test
    public void givenKgAndGrams_WhenCompare_shouldReturnTrue()  {
        double kg = 1,grams = 1000;
        UnitComparetor unitComparetor = new UnitComparetor(kg,Length.KILOGRAMS);
        UnitComparetor unitComparetor2 = new UnitComparetor(grams,Length.GRAM);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }

    @Test
    public void given1TonneAnd1000kgs_WhenAdd_shouldReturn1001() {
        double gm = 1000,tonne = 1;
        UnitComparetor unitComparetor = new UnitComparetor(gm,Length.GRAM);
        UnitComparetor unitComparetor2 = new UnitComparetor(tonne,Length.TONNE);
        double result = quantityMeasurement.addition(unitComparetor,unitComparetor2);
        Assert.assertEquals(1001,result,0);
    }

    @Test
    public void givenFahrenheitAndCelsius_WhenCompare_shouldReturn() {
        double fahrenheit = 212,celsius = 100;
        UnitComparetor unitComparetor = new UnitComparetor(fahrenheit,Length.FAHRENHEIT);
        UnitComparetor unitComparetor2 = new UnitComparetor(celsius,Length.CELSIUS);
        boolean result = quantityMeasurement.compare(unitComparetor,unitComparetor2);
        Assert.assertEquals(true,result);
    }
}


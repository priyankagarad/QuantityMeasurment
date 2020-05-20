/*****************************************************************************************************************
 * @purpose:Quantity Measurment Class is used for Compare value in different Unit and Calculate Result
 * @Author:Priyanka
 * @Date:-20/5/2020
 ****************************************************************************************************************/
package com.bl.quantity;
public class QuantityMeasurment {
    public boolean compare(UnitComparetor unitComparetor1, UnitComparetor unitComparetor2) throws QuantityMeasurementException {
        if (unitComparetor1 == null || unitComparetor2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return unitComparetor1.equals(unitComparetor2);
    }

    /**+
     * @purpose:addition Function add the value of different and same Unit
     * @param unitComparetor:Reference1
     * @param unitComparetor2:Reference2
     * @return
     */

    public double addition(UnitComparetor unitComparetor, UnitComparetor unitComparetor2) {
        return unitComparetor.getValue()+unitComparetor2.getValue();
    }
}

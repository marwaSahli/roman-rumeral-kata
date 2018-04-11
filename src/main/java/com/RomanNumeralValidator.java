package com;

import com.converter.NumberConverter;

public class RomanNumeralValidator {

    private  NumberConverter numberConverter;

    public RomanNumeralValidator() {

        numberConverter = new NumberConverter();
    }

    public void validateConversion(String string){

        if(RomanNumeralUtility.isNumber(string))
            numberConverter.validateNumberConversion(Integer.parseInt(string));

    }


}

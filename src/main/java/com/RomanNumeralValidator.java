package com;

import com.converter.NumberConverter;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralValidator {

    private  NumberConverter numberConverter;

    public RomanNumeralValidator() {

        numberConverter = new NumberConverter();
    }

    public void validateConversion(String string){

        if(RomanNumeralUtility.isNumber(string))
            numberConverter.validateConversion(Integer.parseInt(string));

    }


}

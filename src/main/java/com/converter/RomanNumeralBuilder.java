package com.converter;

import com.RomanNumeralUtility;

public class RomanNumeralBuilder {

    NumberConverter numberConverter;

    public RomanNumeralBuilder() {
        numberConverter = new NumberConverter();
    }

    public String buildConversion(String string){
        String result = "";
        if(RomanNumeralUtility.isNumber(string)){
            result =  numberConverter.convert(string);
        }

        return  result;
    }
}

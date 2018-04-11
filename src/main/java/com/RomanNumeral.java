package com;

import com.converter.NumberConverter;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class RomanNumeral
{

    public NumberConverter numberConverter;
    private RomanNumeralValidator validator ;

    public RomanNumeral() {
        numberConverter = new NumberConverter();
        validator = new RomanNumeralValidator();
    }

    public String convert(String string) {

        validator.validateConversion(string);
        return buildConversion(string);
    }




    private String buildConversion(String string){
        String result = "";
        if(RomanNumeralUtility.isNumber(string)){
            result =  numberConverter.convert(string);
        }


        return  result;
    }

}

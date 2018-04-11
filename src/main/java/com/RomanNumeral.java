package com;

import com.converter.NumberConverter;
import com.converter.RomanNumeralBuilder;


/**
 * Hello world!
 *
 */
public class RomanNumeral
{

    public RomanNumeralBuilder romanNumeralBuilder;
    private RomanNumeralValidator validator ;

    public RomanNumeral() {
        validator = new RomanNumeralValidator();
        romanNumeralBuilder = new RomanNumeralBuilder();
    }

    public String convert(String string) {

        validator.validateConversion(string);
        return romanNumeralBuilder.buildConversion(string);
    }

}

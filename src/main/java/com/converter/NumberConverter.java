package com.converter;

import com.RomanNumeralUtility;

import java.util.Map;

public class NumberConverter implements Converter {

    private int numberToConvert;

    public void validateNumberConversion(int number){
        if(number <-1){
            throw new NumberFormatException("Number must be positive");
        }
        if(number >3000){
            throw new NumberFormatException("Number should be less than 3000");
        }
    }

    public String convert(String string) {

        String result = "";
        numberToConvert = Integer.parseInt(string);
        for (Map basicNumberAndRomainLetter : RomanNumeralUtility.basicNumbersAndRomainLetters) {
            result += findAndConvertBasicNumberToRoman(basicNumberAndRomainLetter);
        }

        return result;
    }

    private String findAndConvertBasicNumberToRoman(Map basicNumberAndRomainLetter){
        String result = "";
        while (numberToConvert >= (int) basicNumberAndRomainLetter.keySet().toArray()[0]){
            result +=   basicNumberAndRomainLetter.get(basicNumberAndRomainLetter.keySet().toArray()[0]);
            numberToConvert -=   (int) basicNumberAndRomainLetter.keySet().toArray()[0];
        }
        return result;
    }
    
}

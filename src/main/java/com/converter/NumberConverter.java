package com.converter;

import com.RomanNumeralUtility;

import java.util.Map;

public class NumberConverter implements Converter {

    public boolean canConvert(String number) {
        return true;
    }

    public void validateConversion(int number){

        if(number <-1){
            throw new NumberFormatException("Number must be positive");
        }
        if(number >3000){
            throw new NumberFormatException("Number should be less than 3000");
        }
    }

    public String convert(String number) {

        String result = "";
        int numberToConvert = Integer.parseInt(number);
        for (Map entry : RomanNumeralUtility.basicNumbersAndRomainLetters) {
            while (numberToConvert >= (int) entry.keySet().toArray()[0]){
                result +=   entry.get(entry.keySet().toArray()[0]);
                numberToConvert -=   (int) entry.keySet().toArray()[0];
            }
        }

        return result;
    }
}

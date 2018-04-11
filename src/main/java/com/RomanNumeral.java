package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class RomanNumeral
{

    public String convert(int number) {
        String result = "";
        if(number <-1){
            throw new NumberFormatException("Number must be positive");
        }
        if(number >3000){
            throw new NumberFormatException("Number should be less than 3000");
        }

        for (Map entry : RomanNumeralUtility.basicNumberRomainLetters) {
            while (number >= (int) entry.keySet().toArray()[0]){
                result +=   entry.get(entry.keySet().toArray()[0]);
                number -=   (int) entry.keySet().toArray()[0];
            }
        }

        return result;
    }
}

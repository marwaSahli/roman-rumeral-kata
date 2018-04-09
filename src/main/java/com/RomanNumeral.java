package com;

/**
 * Hello world!
 *
 */
public class RomanNumeral
{

    public String convert(int number) {
        String result = "";
        if(number<4){
            for (int i=0; i<number ; i++)
                result += "I";
        } else if(number == 4){
            result = "IV";
        }  else if(number == 5){
            result = "V";
        }


        return result;
    }
}

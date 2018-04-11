package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralUtility {

    /*public static Map<Integer, String> basicRomanLetters = new HashMap<Integer, String>(){{
        put(1, "I");
        put(4,"IV");
        put(5,"V");
        put(9,"IX");
        put(10,"X");
        put(40,"XL");
        put(50,"L");
        put(100,"C");
        put(400,"CD");
        put(500,"D");
        put(900,"CM");
        put(1000,"M");
    }};*/

    public static int[]    basicNumbers = { 1000,  900,  500,  400,  100,   90,
            50,   40,   10,    9,    5,    4,    1 };

    public static String[] basicRomanLetters = { "M",  "CM",  "D",  "CD", "C",  "XC",
            "L",  "XL",  "X",  "IX", "V",  "IV", "I" };

    public static List<Map> basicNumberRomainLetters = new ArrayList<Map> (){{
        add(new HashMap(){{put(1000, "M");}});
        add(new HashMap(){{put(900, "CM");}});
        add(new HashMap(){{put(500, "D");}});
        add(new HashMap(){{put(400, "CD");}});
        add(new HashMap(){{put(100, "C");}});
        add(new HashMap(){{put(90, "XC");}});
        add(new HashMap(){{put(50, "L");}});
        add(new HashMap(){{put(40, "XL");}});
        add(new HashMap(){{put(10, "X");}});
        add(new HashMap(){{put(9, "IX");}});
        add(new HashMap(){{put(5, "V");}});
        add(new HashMap(){{put(4, "IV");}});
        add(new HashMap(){{put(1, "I");}});

        }};
}

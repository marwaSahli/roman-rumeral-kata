package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralUtility {

    public static List<Map> basicNumbersAndRomainLetters = new ArrayList<Map> (){{
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

    public static boolean isNumber(String string){
        return true;
    }

    public static boolean isRoman(String string){
        return false;
    }
}

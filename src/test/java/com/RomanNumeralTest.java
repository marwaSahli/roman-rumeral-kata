package com;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setup(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void should_return_I_when_input_is_1(){
        assertEquals(romanNumeral.convert(1), "I");
    }

    @Test
    public void should_return_II_when_number_is_2(){
        assertEquals(romanNumeral.convert(2), "II");
    }
    // 1->I , 2->II , 3-> III
    //4 -> IV
    //5 -> V
    //6 -> VI , 7 --> VII , 8 -> VIII
    //9 -> IX
    //10 -> X
    @Test
    public void should_return_IV_when_number_is_4(){
        assertEquals(romanNumeral.convert(4), "IV");
    }

    @Test
    public void should_return_V_when_number_is_5(){
        assertEquals(romanNumeral.convert(5), "V");
    }

}
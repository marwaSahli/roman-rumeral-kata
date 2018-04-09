package com;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setup(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void should_return_I_when_input_is_1(){
        assertEquals(romanNumeral.convert("1"), "I");
    }


}
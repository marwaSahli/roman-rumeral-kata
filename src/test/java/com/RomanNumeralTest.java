package com;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setup(){
        romanNumeral = new RomanNumeral();
    }

    @Test(expected = NumberFormatException.class)
    public  void should_throw_number_format_exception_when_number_is_negative(){
        romanNumeral.convert(-100);
    }

    @Test(expected = NumberFormatException.class)
    public  void should_throw_number_format_exception_when_number_is_more_than_3000(){
        romanNumeral.convert(30001);
    }

    @Test
    public void should_return_I_when_number_is_1(){
        assertEquals(romanNumeral.convert(1), "I");
    }

    @Test
    public void should_return_II_when_number_is_2(){
        assertEquals(romanNumeral.convert(2), "II");
    }

    @Test
    public void should_return_IV_when_number_is_4(){
        assertEquals(romanNumeral.convert(4), "IV");
    }

    @Test
    public void should_return_V_when_number_is_5(){
        assertEquals(romanNumeral.convert(5), "V");
    }

    @Test
    @Parameters({"2349, MMCCCXLIX",
    "1998 ,MCMXCVIII",
    "448, CDXLVIII"})
    public void should_convert_number_to_his_equivalent_roman_letters(int number, String result){
        assertThat(romanNumeral.convert(number)).isEqualTo(result);
    }

}
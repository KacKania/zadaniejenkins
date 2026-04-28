package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KalkulatorTest {

    @Test
    public void testDodawania() {
        Kalkulator calc = new Kalkulator();
        assertEquals(10, calc.dodawanie(5, 5));
    }
}
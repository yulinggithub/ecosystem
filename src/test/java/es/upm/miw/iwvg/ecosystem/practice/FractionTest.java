package es.upm.miw.iwvg.ecosystem.practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    private Fraction f;

    @Test
    void decimal() {
        f = new Fraction(1,2);
        double result = f.getNumerator() / f.getDenominator();
        System.out.print(result);
        assertEquals(0.5, f.decimal());
    }

    @Test
    void getNumerator() {
        f = new Fraction(1,2);
        assertEquals(1, f.getNumerator());
    }

    @Test
    void getDenominator() {
        f = new Fraction(1,2);
        assertEquals(2, f.getDenominator());
    }
}
package com.ovidiomiranda.javacodekatas.sevenkyu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareEveryDigitTest {
    /**
     * The HighestAndLowestTest is declared.
     */
    private SquareEveryDigit squareDigit;

    /**
     * This method initialize the HighestAndLowestTest class.
     */
    @Before
    public void init() {
        squareDigit = new SquareEveryDigit();
    }

    @Test
    public void exampleTests() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
        assertEquals(0, new SquareEveryDigit().squareDigits(0));
    }
}

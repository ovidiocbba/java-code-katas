package com.ovidiomiranda.javacodekatas.sevenkyu;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The SquareEveryDigitTest class.
 */
public class SquareEveryDigitTest {

  /**
   * The SquareEveryDigitTest is declared.
   */
  private SquareEveryDigit squareEveryDigit;

  /**
   * This method initialize the SquareEveryDigitTest class.
   */
  @Before
  public void init() {
    squareEveryDigit = new SquareEveryDigit();
  }

  @Test
  public void exampleTests() {
    assertEquals(811181, squareEveryDigit.squareDigits(9119));
    assertEquals(0, squareEveryDigit.squareDigits(0));
  }
}

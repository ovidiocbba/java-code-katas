package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NEGATIVE_FIFTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE_NEGATIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO_HUNDRED_FIFTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ZERO;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The MultiplyTheNumberTest class.
 */
public class MultiplyTheNumberTest {

  /**
   * The MultiplyTheNumberTest is declared.
   */
  private MultiplyTheNumber multiplyTheNumber;

  /**
   * This method initialize the multiplyTheNumber class.
   */
  @Before
  public void init() {
    multiplyTheNumber = new MultiplyTheNumber();
  }

  /**
   * First test.
   */
  @Test
  public void firstTest() {
    final int expected = FIFTEEN.value();
    final int actual = multiplyTheNumber.multiply(THREE.value());
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Second test.
   */
  @Test
  public void secondTest() {
    final int expected = TWO_HUNDRED_FIFTY.value();
    final int actual = multiplyTheNumber.multiply(TEN.value());
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Third test.
   */
  @Test
  public void thirdTest() {
    final int expected = ZERO.value();
    final int actual = multiplyTheNumber.multiply(ZERO.value());
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Fourth test.
   */
  @Test
  public void fourthTest() {
    final int expected = NEGATIVE_FIFTEEN.value();
    final int actual = multiplyTheNumber.multiply(THREE_NEGATIVE.value());
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

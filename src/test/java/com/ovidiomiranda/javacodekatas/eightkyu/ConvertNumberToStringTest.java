package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The ConvertNumberToStringTest class.
 */
public class ConvertNumberToStringTest {

  /**
   * The ConvertNumberToStringTest is declared.
   */
  private ConvertNumberToString convertNumber;

  /**
   * This method initialize the ConvertNumberToStringTest class.
   */
  @Before
  public void init() {
    convertNumber = new ConvertNumberToString();
  }

  /**
   * Test One.
   */
  @Test
  public void testOne() {
    final String expected = "67";
    final String actual = convertNumber.numberToString(67);
    assertEquals(NOT_EQUALS, expected, actual);
  }

  /**
   * Test Two.
   */
  @Test
  public void testTwo() {
    final String expected = "123";
    final String actual = convertNumber.numberToString(123);
    assertEquals(NOT_EQUALS, expected, actual);
  }

  /**
   * Test Three.
   */
  @Test
  public void testThree() {
    final String expected = "999";
    final String actual = convertNumber.numberToString(999);
    assertEquals(NOT_EQUALS, expected, actual);
  }
}

package com.ovidiomiranda.javacodekatas.sixkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The FindTheOddIntTest class.
 */
public class FindTheOddIntTest {

  /**
   * The FindTheOddInt is declared.
   */
  private FindTheOddInt findTheOddInt;

  /**
   * This method initialize the FindTheOddInt class.
   */
  @Before
  public void init() {
    findTheOddInt = new FindTheOddInt();
  }

  /**
   * Test One.
   */
  @Test
  public void testOne() {
    final int expected = 2;
    final int actual = findTheOddInt.findIt(new int[]{1, 1, 2});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Two.
   */
  @Test
  public void testTwo() {
    final int expected = 0;
    final int actual = findTheOddInt.findIt(new int[]{0, 1, 0, 1, 0});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Three.
   */
  @Test
  public void testThree() {
    final int expected = 4;
    final int actual = findTheOddInt.findIt(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

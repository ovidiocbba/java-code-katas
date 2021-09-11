package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The AverageTest class.
 */
public class AverageTest {

  /**
   * The AverageTest is declared.
   */
  private Average average;

  /**
   * This method initialize the AverageTest class.
   */
  @Before
  public void init() {
    average = new Average();
  }

  /**
   * First test.
   */
  @Test
  public void firstTest() {
    final int expected = TWO.value();
    final int actual = average.getAverage(new int[]{2, 2, 2, 2});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Second test.
   */
  @Test
  public void secondTest() {
    final int expected = THREE.value();
    final int actual = average.getAverage(new int[]{1, 2, 3, 4, 5});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Third test.
   */
  @Test
  public void thirdTest() {
    final int expected = ONE.value();
    final int actual = average.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

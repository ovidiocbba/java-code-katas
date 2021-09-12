package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The Class HighestAndLowestTest.
 */
public class HighestAndLowestTest {

  /**
   * The HighestAndLowestTest is declared.
   */
  private HighestAndLowest highestAndLowest;

  /**
   * This method initialize the HighestAndLowestTest class.
   */
  @Before
  public void init() {
    highestAndLowest = new HighestAndLowest();
  }

  /**
   * Test 1.
   */
  @Test
  public void test1() {
    final String expected = "42 -9";
    final String actual = highestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

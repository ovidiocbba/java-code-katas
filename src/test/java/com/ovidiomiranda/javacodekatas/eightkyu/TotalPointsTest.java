package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWELVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ZERO;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The TotalPointsTest class.
 */
public class TotalPointsTest {

  /**
   * The TotalPoints is declared.
   */
  private TotalPoints totalPoints;

  /**
   * This method initialize the TotalPointsTest class.
   */
  @Before
  public void init() {
    totalPoints = new TotalPoints();
  }

  /**
   * Test one.
   */
  @Test
  public void testOne() {
    final int expected = THIRTY.value();
    final int actual = totalPoints.points(new String[]
        {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test two.
   */
  @Test
  public void testTwo() {
    final int expected = TEN.value();
    final int actual = totalPoints.points(new String[]
        {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test three.
   */
  @Test
  public void testThree() {
    final int expected = ZERO.value();
    final int actual = totalPoints.points(new String[]
        {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test four.
   */
  @Test
  public void testFour() {
    final int expected = FIFTEEN.value();
    final int actual = totalPoints.points(new String[]
        {"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test five.
   */
  @Test
  public void testFive() {
    final int expected = TWELVE.value();
    final int actual = totalPoints.points(new String[]
        {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"});
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

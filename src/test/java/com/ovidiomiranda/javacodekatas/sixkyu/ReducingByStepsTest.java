package com.ovidiomiranda.javacodekatas.sixkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.EIGHTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FORTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NEGATIVE_NINETY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NEGATIVE_SEVENTY_EIGHT;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY_FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

/**
 * The ReducingByStepsTest class.
 */
public class ReducingByStepsTest {

  /**
   * The Original array for the tests.
   */
  long[] originalArray = new long[]{EIGHTEEN.value(), SIXTY_NINE.value(), NEGATIVE_NINETY.value(),
      NEGATIVE_SEVENTY_EIGHT.value(), SIXTY_FIVE.value(), FORTY.value()};
  /**
   * The ReducingBySteps is declared.
   */
  private ReducingBySteps reducingBySteps;

  /**
   * This method initialize the ReducingBySteps class.
   */
  @Before
  public void init() {
    reducingBySteps = new ReducingBySteps();
  }

  /**
   * Test Greatest common divisor.
   */
  @Test
  public void testGcd() {
    final long[] expected = new long[]{18, 3, 3, 3, 1, 1};
    final long[] actual = reducingBySteps.operationArray(ReducingBySteps::gcdi, originalArray,
        originalArray[0]);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Test Least common multiple.
   */
  @Test
  public void testLcm() {
    final long[] expected = new long[]{18, 414, 2070, 26910, 26910, 107640};
    final long[] actual = reducingBySteps
        .operationArray(ReducingBySteps::lcmu, originalArray, originalArray[0]);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Test Sum.
   */
  @Test
  public void testSum() {
    final long[] expected = new long[]{18, 87, -3, -81, -16, 24};
    final long[] actual = reducingBySteps.operationArray(ReducingBySteps::som, originalArray, 0);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Test Min.
   */
  @Test
  public void testMin() {
    final long[] expected = new long[]{18, 18, -90, -90, -90, -90};
    final long[] actual = reducingBySteps.operationArray(ReducingBySteps::mini, originalArray,
        originalArray[0]);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Test Max.
   */
  @Test
  public void testMax() {
    final long[] expected = new long[]{18, 69, 69, 69, 69, 69};
    final long[] actual = reducingBySteps
        .operationArray(ReducingBySteps::maxi, originalArray, originalArray[0]);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }
}

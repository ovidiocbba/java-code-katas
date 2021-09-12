package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.EIGHTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.EIGHTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.EIGHTY_FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.EIGHTY_THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY_EIGHT;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY_ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY_THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FORTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINETEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINETY_ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINETY_SIX;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINETY_TWO;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_FIFTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_FIFTY_ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_FORTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_SIXTY_FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_TWENTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVENTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVENTY_FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVENTY_FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVENTY_TWO;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY_ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY_SEVEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SIXTY_TWO;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTEEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWENTY_EIGHT;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWENTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWENTY_SEVEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO_HUNDRED_ELEVEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO_HUNDRED_SEVEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO_HUNDRED_THIRTY_FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO_HUNDRED_THIRTY_SIX;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ZERO;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

/**
 * The RowWeightTest class.
 */
public class RowWeightTest {

  /**
   * The RowWeight is declared.
   */
  private RowWeight rowWeight;

  /**
   * This method initialize the RowWeight class.
   */
  @Before
  public void init() {
    rowWeight = new RowWeight();
  }

  /**
   * Basic test one.
   */
  @Test
  public void basicTestsOne() {
    final int[] expected = new int[]{EIGHTY.value(), ZERO.value()};
    final int[] actual = rowWeight.rowWeights(new int[]{EIGHTY.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test two.
   */
  @Test
  public void basicTestsTwo() {
    final int[] expected = new int[]{ONE_HUNDRED.value(), FIFTY.value()};
    final int[] actual = rowWeight.rowWeights(new int[]{ONE_HUNDRED.value(), FIFTY.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test three.
   */
  @Test
  public void basicTestsThree() {
    final int[] expected = new int[]{ONE_HUNDRED_TWENTY.value(), ONE_HUNDRED_FORTY.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{FIFTY.value(), SIXTY.value(), SEVENTY.value(), EIGHTY.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Odd Vector Length one.
   */
  @Test
  public void oddVectorLengthOne() {
    final int[] expected = new int[]{SIXTY_TWO.value(), TWENTY_SEVEN.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{THIRTEEN.value(), TWENTY_SEVEN.value(), FORTY_NINE.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Odd Vector Length two.
   */
  @Test
  public void oddVectorLengthTwo() {
    final int[] expected = new int[]{TWO_HUNDRED_THIRTY_SIX.value(), NINETY_TWO.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{SEVENTY.value(), FIFTY_EIGHT.value(), SEVENTY_FIVE.value(), THIRTY_FOUR.value(),
            NINETY_ONE.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Odd Vector Length three.
   */
  @Test
  public void oddVectorLengthThree() {
    final int[] expected = new int[]{TWO_HUNDRED_ELEVEN.value(), ONE_HUNDRED_SIXTY_FOUR.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{TWENTY_NINE.value(), EIGHTY_THREE.value(), SIXTY_SEVEN.value(),
            FIFTY_THREE.value(), NINETEEN.value(), TWENTY_EIGHT.value(),
            NINETY_SIX.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Even Vector Length One.
   */
  @Test
  public void evenVectorLengthOne() {
    final int[] expected = new int[]{ONE_HUNDRED.value(), FIFTY.value()};
    final int[] actual = rowWeight.rowWeights(new int[]{ONE_HUNDRED.value(), FIFTY.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Even Vector Length two.
   */
  @Test
  public void evenVectorLengthTwo() {
    final int[] expected = new int[]{ONE_HUNDRED_FIFTY.value(), ONE_HUNDRED_FIFTY_ONE.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{ONE_HUNDRED.value(), FIFTY_ONE.value(), FIFTY.value(),
            ONE_HUNDRED.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Even Vector Length three.
   */
  @Test
  public void evenVectorLengthThree() {
    final int[] expected = new int[]{TWO_HUNDRED_SEVEN.value(), TWO_HUNDRED_THIRTY_FIVE.value()};
    final int[] actual = rowWeight.rowWeights(
        new int[]{THIRTY_NINE.value(), EIGHTY_FOUR.value(), SEVENTY_FOUR.value(),
            EIGHTEEN.value(), FIFTY_NINE.value(), SEVENTY_TWO.value(), THIRTY_FIVE.value(),
            SIXTY_ONE.value()});
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }
}

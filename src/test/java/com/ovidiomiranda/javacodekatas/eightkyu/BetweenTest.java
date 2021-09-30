package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class BetweenTest {

  /**
   * The BetweenTest is declared.
   */
  private BetweenKata betweenKata;

  /**
   * This method initialize the BetweenTest class.
   */
  @Before
  public void init() {
    betweenKata = new BetweenKata();
  }

  @Test
  public void basicTests1() {
    final int[] expected = new int[]{1, 2, 3, 4};
    final int[] actual = betweenKata.between(1, 4);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  @Test
  public void basicTests2() {
    final int[] expected = new int[]{-2, -1, 0, 1, 2};
    final int[] actual = betweenKata.between(-2, 2);
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }
}

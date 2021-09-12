package com.ovidiomiranda.javacodekatas.sixkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

/**
 * The MexicanWaveTest class.
 */
public class MexicanWaveTest {

  /**
   * The MexicanWave is declared.
   */
  private MexicanWave mexicanWave;

  /**
   * This method initialize the MexicanWave class.
   */
  @Before
  public void init() {
    mexicanWave = new MexicanWave();
  }

  /**
   * Basic test 1.
   */
  @Test
  public void basicTest1() {
    final String[] expected = new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"};
    final String[] actual = mexicanWave.wave("Hello");
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test 2.
   */
  @Test
  public void basicTest2() {
    final String[] actual = mexicanWave.wave("codewars");
    final String[] expected = new String[]{"Codewars", "cOdewars", "coDewars", "codEwars",
        "codeWars", "codewArs", "codewaRs", "codewarS"};
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test 3.
   */
  @Test
  public void basicTest3() {
    final String[] actual = mexicanWave.wave("");
    final String[] expected = new String[]{};
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test 4.
   */
  @Test
  public void basicTest4() {
    final String[] actual = mexicanWave.wave("two words");
    final String[] expected = new String[]{"Two words", "tWo words", "twO words", "two Words",
        "two wOrds", "two woRds", "two worDs", "two wordS"};
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }

  /**
   * Basic test 5.
   */
  @Test
  public void basicTest5() {
    final String[] actual = mexicanWave.wave(" gap ");
    final String[] expected = new String[]{" Gap ", " gAp ", " gaP "};
    assertArrayEquals(format(NOT_EQUALS, Arrays.toString(expected), Arrays.toString(actual)),
        expected, actual);
  }
}

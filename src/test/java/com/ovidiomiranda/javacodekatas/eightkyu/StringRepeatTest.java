package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NEGATIVE_TEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ZERO;
import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The StringRepeatTest class.
 */
public class StringRepeatTest {

  /**
   * The StringRepeat is declared.
   */
  private StringRepeat stringRepeat;

  /**
   * This method initialize the StringRepeatTest class.
   */
  @Before
  public void init() {
    stringRepeat = new StringRepeat();
  }

  /**
   * Test 4 - a.
   */
  @Test
  public void test4a() {
    final String expected = "aaaa";
    final String actual = stringRepeat.repeatString(FOUR.value(), "a");
    assertEquals(format(NOT_EQUALS, expected, actual), expected,
        actual);
  }

  /**
   * Test 3 - hello.
   */
  @Test
  public void test3Hello() {
    final String expected = "HelloHelloHello";
    final String actual = stringRepeat.repeatString(THREE.value(), "Hello");
    assertEquals(format(NOT_EQUALS, expected, actual), expected,
        actual);
  }

  /**
   * Test 5 - empty.
   */
  @Test
  public void test5empty() {
    final String expected = "";
    final String actual = stringRepeat.repeatString(FIVE.value(), "");
    assertEquals(format(NOT_EQUALS, expected, actual), expected,
        actual);
  }

  /**
   * Test 0 kata.
   */
  @Test
  public void test0kata() {
    final String expected = "";
    final String actual = stringRepeat.repeatString(ZERO.value(), "kata");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test negative repeat.
   */
  @Test
  public void testNegativeRepeat() {
    final String expected = "";
    final String actual = stringRepeat.repeatString(NEGATIVE_TEN.value(), "kata");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The MumblingTest class.
 */
public class MumblingTest {

  /**
   * The MumblingTest is declared.
   */
  private Mumbling mumbling;

  /**
   * This method initialize the MumblingTest class.
   */
  @Before
  public void init() {
    mumbling = new Mumbling();
  }

  /**
   * Test One.
   */
  @Test
  public void testOne() {
    final String expected =
        "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu";
    final String actual = mumbling.accumulate("ZpglnRxqenU");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Two.
   */
  @Test
  public void testTwo() {
    final String expected =
        "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb";
    final String actual = mumbling.accumulate("NyffsGeyylB");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Three.
   */
  @Test
  public void testThree() {
    final String expected =
        "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu";
    final String actual = mumbling.accumulate("MjtkuBovqrU");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Four.
   */
  @Test
  public void testFour() {
    final String expected =
        "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm";
    final String actual = mumbling.accumulate("EvidjUnokmM");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Test Five.
   */
  @Test
  public void testFive() {
    final String expected =
        "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc";
    final String actual = mumbling.accumulate("HbideVbxncC");
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

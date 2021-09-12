package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Messages.NOT_EQUALS;
import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The SillyAdditionTest class.
 */
public class SillyAdditionTest {

  /**
   * The SillyAdditionTest is declared.
   */
  private SillyAddition sillyAddition;

  /**
   * This method initialize the SillyAdditionTest class.
   */
  @Before
  public void init() {
    sillyAddition = new SillyAddition();
  }

  /**
   * Real Addition test one.
   */
  @Test
  public void realAdditionTestOne() {
    final int expected = 13;
    final int actual = sillyAddition.add(2, 11);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Real Addition test two.
   */
  @Test
  public void realAdditionTestTwo() {
    final int expected = 1;
    final int actual = sillyAddition.add(0, 1);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Real Addition test three.
   */
  @Test
  public void realAdditionTestThree() {
    final int expected = 0;
    final int actual = sillyAddition.add(0, 0);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Silly Addition test one.
   */
  @Test
  public void sillyAdditionTestOne() {
    final int expected = 214;
    final int actual = sillyAddition.add(16, 18);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Silly Addition test two.
   */
  @Test
  public void sillyAdditionTestTwo() {
    final int expected = 515;
    final int actual = sillyAddition.add(26, 39);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }

  /**
   * Silly Addition test three.
   */
  @Test
  public void sillyAdditionTestThree() {
    final int expected = 1103;
    final int actual = sillyAddition.add(122, 81);
    assertEquals(format(NOT_EQUALS, expected, actual), expected, actual);
  }
}

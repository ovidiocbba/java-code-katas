package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * <h1>Convert a Number to a String!.</h1>
 *
 * <p>We need a function that can transform a number into a string.
 * <br>What ways of achieving this do you know?
 * <br>Example:<br>
 * <code>
 * <br>Kata.numberToString(123); // returns "123";
 * <br>Kata.numberToString(999); // returns "999";
 * </code>
 * </p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/convert-a-number-to-a-string/train/java">
 * https://www.codewars.com/kata/convert-a-number-to-a-string/train/java</a>
 */
public class ConvertNumberToString {

  /**
   * Convert Number to String.
   *
   * @param number the number.
   * @return the number convert to string.
   */
  public String numberToString(final int number) {
    return String.valueOf(number);
  }
}

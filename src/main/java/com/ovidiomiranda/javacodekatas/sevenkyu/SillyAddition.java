package com.ovidiomiranda.javacodekatas.sevenkyu;

import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>SillyAddition(16+18=214).</h1>
 *
 * <p>For this Kata you will have to forget how to add two numbers together.</p>
 *
 * <p>In simple terms our method does not like the principle of carrying over numbers and just
 * writes down every number it calculates.</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java">
 * https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java</a>
 */
public class SillyAddition {

  /**
   * Silly Addition.
   *
   * @param numberOne the number one.
   * @param numberTwo the number two.
   * @return add using a silly addition.
   */
  public int add(final int numberOne, final int numberTwo) {
    final String stringOne = new StringBuilder(Integer.toString(numberOne)).reverse().toString();
    final String stringTwo = new StringBuilder(Integer.toString(numberTwo)).reverse().toString();
    final int maxRange = Math.max(stringOne.length(), stringTwo.length());
    final List<String> result = new ArrayList<>();
    for (int i = maxRange - 1; i >= 0; i--) {
      char value1;
      char value2;
      try {
        value1 = stringOne.charAt(i);
      } catch (StringIndexOutOfBoundsException e) {
        value1 = '0';
      }
      try {
        value2 = stringTwo.charAt(i);
      } catch (StringIndexOutOfBoundsException e) {
        value2 = '0';
      }
      int sum = parseInt(String.valueOf(value1)) + parseInt(String.valueOf(value2));
      result.add(Integer.toString(sum));
    }
    return Integer.parseInt(String.join("", result));
  }
}

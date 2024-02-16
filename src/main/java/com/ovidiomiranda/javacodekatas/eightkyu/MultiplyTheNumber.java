package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIVE_DOUBLE;

/**
 * <h1>Multiply the number.</h1>
 *
 * <p>Jack really likes his number five: the trick here is that you have to multiply each number
 * <br>by 5 raised to the number of digits of each numbers, so, for example:.
 * <br>Example:<br>
 * <code>
 * <br>Kata.multiply(3) == 15      // 3 * 5¹
 * <br>Kata.multiply(10) == 250    // 10 * 5²
 * <br>Kata.multiply(200) == 25000 // 200 * 5³
 * <br>Kata.multiply(0) == 0       // 0 * 5¹
 * <br>Kata.multiply(-3) == -15    // -3 * 5¹
 * </code>
 * </p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/5708f682c69b48047b000e07/train/java">
 * https://www.codewars.com/kata/5708f682c69b48047b000e07/train/java</a>
 */
public class MultiplyTheNumber {

  /**
   * Multiply the number.
   *
   * @param number the number.
   * @return the result.
   */
  public int multiply(int number) {
    int size = String.valueOf(Math.abs(number)).length();
    return number * (int) (Math.pow(FIVE_DOUBLE.doubleValue(), size));
  }
}

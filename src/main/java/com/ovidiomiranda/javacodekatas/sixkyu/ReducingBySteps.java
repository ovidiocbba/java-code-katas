package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.function.BiFunction;

/**
 * <h1>Reducing by steps.</h1>
 *
 * <p>Data: an array of integers, a function f of two variables and an init value.</p>
 * <br> Example:<br>
 * <code>
 * a = [2, 4, 6, 8, 10, 20], f(x, y) = x + y; init = 0
 * </code>
 *
 * <p>Output: an array of integers, say r, such that<br>
 * <code>
 * r = [r[0] = f(init, a[0]), r[1] = f(r[0], a[1]), r[2] = f(r[1], a[2]), ...]
 * </code>
 * </p>
 *
 * <p>With our example:<code> r = [2, 6, 12, 20, 30, 50]</code></p>
 *
 * <p>Task: Write the following functions of two variables.</p>
 * <ul>
 *  <li>som : (x, y) -&gt; x + y</li>
 *  <li>mini : (x, y) -&gt; min(x, y)</li>
 *  <li>maxi : (x, y) -&gt; max(x, y)</li>
 *  <li>lcmu : (x, y) -&gt; lcm(abs(x), abs(y) (see note for lcm)</li>
 *  <li>gcdi : (x, y) -&gt; gcd(abs(x), abs(y) (see note for gcd)</li>
 * </ul>
 *
 * <p><b>Example:</b>
 * <code>
 * <br>a = [18, 69, -90, -78, 65, 40]
 * <br>oper_array(gcd, a, a[0]) =&gt; [18, 3, 3, 3, 1, 1]
 * <br>oper_array(lcm, a, a[0]) =&gt;[18, 414, 2070, 26910, 26910, 107640]
 * <br>oper_array(sum, a, 0) =&gt; [18, 87, -3, -81, -16, 24]
 * <br>oper_array(min, a, a[0]) =&gt; [18, 18, -90, -90, -90, -90]
 * <br>oper_array(max, a, a[0]) =&gt; [18, 69, 69, 69, 69, 69]
 * </code>
 * </p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/reducing-by-steps/train/java">
 * https://www.codewars.com/kata/reducing-by-steps/train/java</a>
 */
public class ReducingBySteps {

  /**
   * Greatest common divisor.
   *
   * @param number1 first integer.
   * @param number2 second integer.
   * @return the greatest common divisor.
   */
  public static long gcdi(final long number1, final long number2) {
    return Math.abs(number2 == 0 ? number1 : gcdi(number2, number1 % number2));
  }

  /**
   * Least common multiple.
   *
   * @param number1 first integer.
   * @param number2 second integer.
   * @return the least common multiple.
   */
  public static long lcmu(final long number1, final long number2) {
    return Math.abs(number1 * number2) / gcdi(number1, number2);
  }

  /**
   * Sum.
   *
   * @param number1 first integer.
   * @param number2 second integer.
   * @return the least common multiple.
   */
  public static long som(final long number1, final long number2) {
    return number1 + number2;
  }

  /**
   * Max.
   *
   * @param number1 first integer.
   * @param number2 second integer.
   * @return the least common multiple.
   */
  public static long maxi(final long number1, final long number2) {
    return Math.max(number1, number2);
  }

  /**
   * Min.
   *
   * @param number1 first integer.
   * @param number2 second integer.
   * @return the least common multiple.
   */
  public static long mini(final long number1, final long number2) {
    return Math.min(number1, number2);
  }

  /**
   * Operations an Array.
   *
   * @param operator is the function of to variables to apply to the array.
   * @param array    an array of integers.
   * @param initial  is the initial value.
   * @return the array.
   */
  public long[] operationArray(final BiFunction<Long, Long, Long> operator, final long[] array,
      final long initial) {
    long[] result = new long[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = operator.apply(i - 1 < 0 ? initial : result[i - 1], array[i]);
    }
    return result;
  }
}

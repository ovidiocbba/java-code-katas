package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>What is between?</h1>
 *
 * <p>Complete the function that takes two integers (a, b, where a < b) and return an array of all
 * integers between the input parameters, including them.</p>
 *
 * <br>Example:<br>
 * <code>
 * a = 1 , b = 4 Result = [1, 2, 3, 4]
 * </code>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java">
 * https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java</a>
 */
public class BetweenKata {

  /**
   * Returns a sequential ordered integers from initial value to final value by an incremental step
   * of 1.
   *
   * <p>Best solution: return rangeClosed(initialValue, finalValue).toArray()</p>
   *
   * @param initialValue the initial value.
   * @param finalValue   the final value.
   * @return a sequential values for the range of int elements.
   */
  public int[] between(int initialValue, int finalValue) {
    List<Integer> resultList = new ArrayList<>();
    do {
      resultList.add(initialValue);
      initialValue++;
    } while (initialValue <= finalValue);
    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}

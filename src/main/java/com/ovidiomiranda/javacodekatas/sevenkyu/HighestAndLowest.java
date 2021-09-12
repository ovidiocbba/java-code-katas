package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

/**
 * <h1>Highest and Lowest.</h1>
 *
 * <p>In this little assignment you are given a string of space separated numbers, and have to
 * return the highest and lowest number.</p>
 *
 * <p><b>Examples:</b>
 * <code>
 * <br>highAndLow("1 2 3 4 5")  // return "5 1"
 * <br>highAndLow("1 2 -3 4 5") // return "5 -3"
 * <br>highAndLow("1 9 3 4 -5") // return "9 -5"
 * </code></p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java">
 * https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java</a>
 */
public class HighestAndLowest {

  /**
   * High and low.
   *
   * @param numbers the numbers.
   * @return the string.
   */
  public String highAndLow(final String numbers) {
    final int[] arrayList = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).sorted()
        .toArray();
    return String.format("%d %d", arrayList[arrayList.length - 1], arrayList[0]);
  }
}

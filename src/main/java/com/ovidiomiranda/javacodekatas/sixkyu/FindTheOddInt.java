package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <h1>Find the odd int.</h1>
 *
 * <p>Given an array of integers, find the one that appears an odd number of times.</p>
 * <p>There will always be only one integer that appears an odd number of times.</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">
 * https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java</a>
 */
public class FindTheOddInt {

  /**
   * A method that finds the one that appears an odd number of times.
   *
   * @param a the array of integers.
   * @return the number.
   */
  public int findIt(int[] a) {
    int[] numbers = Arrays.stream(a).distinct().sorted().toArray();
    Map<Integer, Integer> map = new HashMap<>();
    int result = 0;
    int count;
    for (int currentValue : numbers) {
      count = (int) Arrays.stream(a).filter(x -> x == currentValue).count();
      map.put(currentValue, count);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        result = entry.getKey();
      }
    }
    return result;
  }

  /**
   * A method that finds the one that appears an odd number of times.
   *
   * @param a the array of integers.
   * @return the number.
   */
  public int findItV2(int[] a) {
    Map<Integer, Long> result = Arrays.stream(a).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return Arrays.stream(a).filter(c -> result.get(c) % 2 == 1).findFirst().orElse(-1);
  }
}

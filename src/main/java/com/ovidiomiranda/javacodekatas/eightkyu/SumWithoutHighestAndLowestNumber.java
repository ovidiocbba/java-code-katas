package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java
 */
public class SumWithoutHighestAndLowestNumber {

  public static int sum(int[] numbers) {
    int result = 0;
    if (numbers != null) {
      int[] numbersFilter = Arrays.stream(numbers).sorted().toArray();
      for (int i = 1; i < numbersFilter.length - 1; i++) {
        result += numbersFilter[i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[]{6, 2, 1, 8, 10})); // 16
    // [6, 0, 1, 10, 10] -> [0, 1, 6, 10, 10] -> [ 1, 6, 10] = 17
    System.out.println(sum(new int[]{6, 0, 1, 10, 10})); // 17

  }
}

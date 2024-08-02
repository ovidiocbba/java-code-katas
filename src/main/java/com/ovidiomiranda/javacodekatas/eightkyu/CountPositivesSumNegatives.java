package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
public class CountPositivesSumNegatives {

  // If the input is an empty array or is null, return an empty array
  public static int[] countPositivesSumNegatives(int[] input) {
    if (input == null || input.length == 0) {
      return new int[]{};
    }
    int sum = (int) Arrays.stream(input).filter(x -> x > 0).count();
    int rest = Arrays.stream(input).filter(x -> x < 0).sum();
    return new int[]{sum, rest};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(countPositivesSumNegatives(
        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    ; // {10, -65}

    System.out.println(Arrays.toString(
        countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
    // {8, -50};
  }
}

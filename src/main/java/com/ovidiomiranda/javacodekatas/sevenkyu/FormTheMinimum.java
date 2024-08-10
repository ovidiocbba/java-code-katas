package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java
// Using the digits only once (ignore duplicates).
// Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
public class FormTheMinimum {

  public static int minValue(int[] values) {
    return Integer.parseInt(Arrays.stream(values).distinct().sorted().mapToObj(String::valueOf)
        .collect(Collectors.joining()));
  }

  public static void main(String[] args) {
    System.out.println(minValue(new int[]{1, 3, 1})); // 13
    System.out.println(minValue(new int[]{4, 7, 5, 7})); // 457
    System.out.println(minValue(new int[]{4, 8, 1, 4})); // 148
    System.out.println(minValue(new int[]{5, 7, 9, 5, 7})); // 579
    System.out.println(minValue(new int[]{6, 7, 8, 7, 6, 6})); // 678
  }
}

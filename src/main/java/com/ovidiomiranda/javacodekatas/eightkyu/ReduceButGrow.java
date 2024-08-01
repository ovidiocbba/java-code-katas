package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java
public class ReduceButGrow {

  // [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
  public static int grow(int[] x) {
    return Arrays.stream(x).reduce((a, b) -> a * b).orElse(0);
  }

  public static int growV1(int[] x) {
    int result = 1;
    for (int i : x) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(grow(new int[]{1, 2, 3})); // 6
    System.out.println(grow(new int[]{4, 1, 1, 1, 4})); // 16
    System.out.println(grow(new int[]{2, 2, 2, 2, 2, 2})); // 64
  }
}

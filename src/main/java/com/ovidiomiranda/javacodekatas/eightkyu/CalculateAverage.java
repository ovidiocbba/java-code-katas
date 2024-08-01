package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

public class CalculateAverage {

  public static double find_average(int[] array) {
    return Arrays.stream(array).average().orElse(0);
  }

  public static void main(String[] args) {
    System.out.println(find_average(new int[]{1, 1, 1})); // 1
    System.out.println(find_average(new int[]{1, 2, 3})); // 2
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/5601409514fc93442500010b/train/java
public class BetterAverage {

  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
  }

  public static void main(String[] args) {
    System.out.println(betterThanAverage(new int[]{2, 3}, 5)); // true
    System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75)); // true
    System.out.println(
        betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69)); // true
    System.out.println(betterThanAverage(new int[]{100, 90}, 11)); // false
  }
}

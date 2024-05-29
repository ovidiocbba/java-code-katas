package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
public class OddOrEven {

  public static String oddOrEven(int[] array) {
    return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
  }

  public static String oddOrEvenV2(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum = sum + i;
    }
    return sum % 2 == 0 ? "even" : "odd";
  }

  public static void main(String[] args) {
    System.out.println(oddOrEven(new int[]{2, 5, 34, 6})); // "odd"
  }
}

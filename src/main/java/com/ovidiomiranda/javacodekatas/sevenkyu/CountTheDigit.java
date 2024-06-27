package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

public class CountTheDigit {

  public static int nbDig(int n, int d) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= n; i++) {
      result.append(i * i);
    }
    return (int) Arrays.stream(result.toString().split("")).filter(x -> x.equals(d + "")).count();
  }

  public static int nbDigV1(int n, int d) {
    int limit = n * n;
    int digit = 0;
    int result = 0;
    int count = 0;
    while (digit < limit) {
      digit = count * count;
      String stringDigit = String.valueOf(digit);
      String stringD = String.valueOf(d);
      if (stringDigit.contains(stringD)) {
        int values = (int) Arrays.stream(stringDigit.split("")).filter(x -> x.equals(stringD))
            .count();
        result += values;
      }
      count++;
    }
    return result;
  }

  public static int nbDigV2(int n, int d) {
    int result = 0;
    char target = Character.forDigit(d, 10);
    for (int i = 0; i <= n; i++) {
      String squared = Integer.toString(i * i);
      for (char c : squared.toCharArray()) {
        if (c == target) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(nbDig(5750, 0));//, 4700);
    System.out.println(nbDig(11011, 2));// 9481);
    System.out.println(nbDig(12224, 8));// 7733);
    System.out.println(nbDig(11549, 1));// 11905);
    // n = 10, d = 1
    // 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
    // the digit 1 in: 1, 16, 81, 100. The total count is then 4.
    System.out.println(nbDig(10, 1)); // 4
    // n = 25 and d = 1
    // 1, 16, 81, 100, 121, 144, 169, 196, 361, 441. The total count is then 1.
    System.out.println(nbDig(25, 1)); // 11
  }
}

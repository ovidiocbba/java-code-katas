package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

public class SumTwoSmallestNumbers {

  public static long sumTwoSmallestNumbers(final long[] numbers) {
    return Arrays.stream(numbers).sorted().limit(2).sum();
  }

  public static long sumTwoSmallestNumbersV1(final long[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] + numbers[1];
  }

  public static void main(String[] args) {
    System.out.println(sumTwoSmallestNumbers(new long[]{5, 8, 12, 19, 22})); // 13L
    System.out.println(sumTwoSmallestNumbers(new long[]{15, 28, 4, 2, 43})); // 6L
    System.out.println(sumTwoSmallestNumbers(new long[]{3, 87, 3, 12, 7})); // 6L
    System.out.println(sumTwoSmallestNumbers(new long[]{23, 71, 33, 82, 1})); // 24L
    System.out.println(sumTwoSmallestNumbers(new long[]{52, 76, 14, 12, 4})); // 16L
  }
}

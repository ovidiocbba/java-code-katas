package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPairSum {

  public static int largestPairSum(int[] numbers) {
    return Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).limit(2)
        .mapToInt(Integer::intValue).sum();
  }

  public static int largestPairSumV1(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] + numbers[numbers.length - 2];
  }

  public static void main(String[] args) {
    System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19})); // 42
    System.out.println(largestPairSum(new int[]{-100, -29, -24, -19, 19})); // 0
    System.out.println(largestPairSum(new int[]{1, 2, 3, 4, 6, -1, 2})); // 10
    System.out.println(largestPairSum(new int[]{-10, -8, -16, -18, -19})); // -18
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
// Example [1,-4,7,12] => 1 + 7 + 12 = 20
// Note: if there is nothing to sum, the sum is default to 0.
public class SumOfPositive {

  public static int sum(int[] arr) {
    return Arrays.stream(arr).filter(x -> x > 0).sum();
  }

  public static int sumV1(int[] arr) {
    int result = 0;
    for (int i : arr) {
      if (i > 0) {
        result += i;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    //[1,-4,7,12] => 1 + 7 + 12 = 20
    System.out.println(sum(new int[]{1, -4, 7, 12})); // 20
    System.out.println(sum(new int[]{1, 2, 3, 4, 5})); //15
    System.out.println(sum(new int[]{1, -2, 3, 4, 5})); // 13
    System.out.println(sum(new int[]{})); // 0
    System.out.println(sum(new int[]{-1, -2, -3, -4, -5})); // 0
    System.out.println(sum(new int[]{-1, 2, 3, 4, -5})); // 9
  }
}

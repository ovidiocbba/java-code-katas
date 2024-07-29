package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class FindTheSmallestInteger {

  //  Given [34, 15, 88, 2] your solution will return 2
  // Given [34, -345, -1, 100] your solution will return -345
  public static int findSmallestInt(int[] args) {
    return Arrays.stream(args).min().getAsInt();
  }

  public static int findSmallestIntV1(int[] args) {
    return Arrays.stream(args).sorted().findFirst().getAsInt();
  }

  public static void main(String[] args) {
    System.out.println(findSmallestInt(new int[]{78, 56, 232, 12, 11, 43})); // 11
    System.out.println(findSmallestInt(new int[]{78, 56, -2, 12, 8, -33})); // -33
  }
}

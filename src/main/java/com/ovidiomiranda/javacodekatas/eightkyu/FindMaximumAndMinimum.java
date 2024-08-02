package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

public class FindMaximumAndMinimum {

  public static int min(int[] list) {
    return Arrays.stream(list).min().orElse(0);
  }

  public static int max(int[] list) {
    return Arrays.stream(list).max().orElse(0);
  }

  public static void main(String[] args) {
    System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110})); // -110
    System.out.println(min(new int[]{42, 54, 65, 87, 0})); // 0
    System.out.println(max(new int[]{4, 6, 2, 1, 9, 63, -134, 566})); // 566
    System.out.println(max(new int[]{5})); // 5
  }
}

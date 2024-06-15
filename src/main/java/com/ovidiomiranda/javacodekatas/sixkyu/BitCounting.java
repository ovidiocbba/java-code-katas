package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
public class BitCounting {

  public static int countBits(int n) {
    return (int) Arrays.stream(Integer.toBinaryString(n).split("")).filter("1"::equals).count();
  }

  public static int countBitsV2(int n) {
    return Integer.bitCount(n);
  }

  public static void main(String[] args) {
    System.out.println(countBits(1234)); // 5
    System.out.println(countBits(4)); // 1
    System.out.println(countBits(7)); // 3
    System.out.println(countBits(9)); // 2
    System.out.println(countBits(10)); // 2
  }
}

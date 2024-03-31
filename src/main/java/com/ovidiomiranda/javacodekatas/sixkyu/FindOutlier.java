package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class FindOutlier {

  public static int find(int[] integers) {
    int countEven = (int) Arrays.stream(integers).filter(x -> x % 2 == 0).count();
    int[] value;
    if (countEven > 1) {
      value = Arrays.stream(integers).filter(x -> x % 2 != 0).toArray();
    } else {
      value = Arrays.stream(integers).filter(x -> x % 2 == 0).toArray();
    }
    return value[0];
  }

  public static int findV2(int[] integers) {
    int[] evenNumbers = Arrays.stream(integers).filter(x -> x % 2 == 0).toArray();
    int[] oddNumbers = Arrays.stream(integers).filter(x -> x % 2 != 0).toArray();
    return evenNumbers.length == 1 ? evenNumbers[0] : oddNumbers[0];
  }

  public static void main(String[] args) {
    // [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
    // [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
    System.out.println(find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));// 11
    System.out.println(find(new int[]{160, 3, 1719, 19, 11, 13, -21}));// 160
    System.out.println(find(new int[]{2, 6, 8, -10, 3}));// 3
    System.out.println(find(
        new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));//206847684
    System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1})); //0

  }
}

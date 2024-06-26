package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

public class FindTheStrayNumber {

  public static int stray(int[] numbers) {
    int[] distinctValues = Arrays.stream(numbers).distinct().toArray();
    for (int distinctValue : distinctValues) {
      int count = (int) Arrays.stream(numbers).filter(x -> x == distinctValue).count();
      if (count == 1) {
        return distinctValue;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(stray(new int[]{1, 1, 2})); // 2
    System.out.println(stray(new int[]{17, 17, 3, 17, 17, 17, 17})); // 3
  }
}

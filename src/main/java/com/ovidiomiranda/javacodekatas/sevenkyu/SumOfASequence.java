package com.ovidiomiranda.javacodekatas.sevenkyu;

public class SumOfASequence {

  // https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
  // 2, 6, 2 --> 12 (2 + 4 + 6)
  // 1, 5, 3 --> 5 (1 + 4)
  public static int sequenceSum(int start, int end, int step) {
    int result = 0;
    for (int i = start; i <= end; i += step) {
      result += i;
    }
    return result;
  }

  public static int sequenceSumV2(int start, int end, int step) {
    if (start > end) {
      return 0;
    }
    int acum = start;
    int result = acum;
    while (acum < end) {
      acum += step;
      if (acum > end) {
        break;
      }
      result += acum;
    }
    return result;
  }

  public static void main(String[] args) {
    // If begin value is greater than the end, your function should return 0
    // If end is not the result of an integer number of steps, then don't add it to the sum.
    // 2,2,2 --> 2
    // 2,6,2 --> 12 (2 + 4 + 6)
    // 1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
    // 1,5,3  --> 5 (1 + 4)
    System.out.println(sequenceSum(2, 6, 2));// 12
    System.out.println(sequenceSum(1, 5, 1));// 15
    System.out.println(sequenceSum(1, 5, 3));// 5 -> 1 + 4 + 7 // Falla 12
    System.out.println(sequenceSum(0, 15, 3));// 45
    System.out.println(sequenceSum(16, 15, 3));// 0  // Falla 16
  }
}

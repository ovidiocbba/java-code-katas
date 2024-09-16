package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
 * <p>
 * 2 -> 3 (1 + 2) | 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
public class GrasshopperSummation {

  public static int summation(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result += i;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(summation(1));
    System.out.println(summation(8)); // 36
  }
}

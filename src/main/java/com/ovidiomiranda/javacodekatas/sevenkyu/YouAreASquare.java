package com.ovidiomiranda.javacodekatas.sevenkyu;

public class YouAreASquare {

  public static boolean isSquare(int n) {
    int result = 0;
    int count = 0;
    boolean band = false;
    while (result == n || result < n) {
      if (n == result) {
        band = true;
        break;
      }
      result = (int) Math.pow(count, 2);
      count++;
    }
    return band;
  }

  public static boolean isSquareV2(int n) {
    int sqrt = (int) Math.sqrt(n);
    return sqrt * sqrt == n;
  }

  public static void main(String[] args) {
    System.out.println(isSquare(-1));// false - "negative numbers aren't square numbers"
    System.out.println(isSquare(0)); // true - "0 is a square number (0 * 0)"
    System.out.println(isSquare(3)); // false - "3 isn't a square number"
    System.out.println(isSquare(4)); // true - "4 is a square number (2 * 2)"
    System.out.println(isSquare(25)); // true - "25 is a square number (5 * 5)"
    System.out.println(isSquare(26)); // false - "26 isn't a square number"
  }
}

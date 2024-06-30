package com.ovidiomiranda.javacodekatas.sevenkyu;

public class Factorial {

  // https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java
  // For example: 5! = 5 * 4 * 3 * 2 * 1 = 120
  // By convention the value of 0! is 1
  // If input is below 0 or above 12 throw an exception
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int result = n;
    if (n >= 1 && n <= 11) {
      for (int i = n - 1; i > 0; i--) {
        result *= i;
      }
    } else {
      throw new IllegalArgumentException();
    }
    return result;
  }

  public static int factorialV2(int n) {
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }
    return n == 0 ? 1 : n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5)); // 120
    System.out.println(factorial(3)); // 6
    System.out.println(factorial(0)); // 1
//    System.out.println(factorial(42));
//    System.out.println(factorial(-42));
  }
}

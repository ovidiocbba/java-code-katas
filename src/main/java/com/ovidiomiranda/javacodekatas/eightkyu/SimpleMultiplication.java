package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/583710ccaa6717322c000105/train/java
public class SimpleMultiplication {

  public static int simpleMultiplication(int n) {
    // This kata is about multiplying a given number by eight
    // if it is an even number and by nine otherwise.
    return n % 2 == 0 ? n * 8 : n * 9;
  }

  public static void main(String[] args) {
    System.out.println("Checking for Odd numbers.");
    System.out.println(simpleMultiplication(1)); // 9
    System.out.println(simpleMultiplication(3)); // 27
    System.out.println(simpleMultiplication(21)); // 189
    System.out.println(simpleMultiplication(23)); // 207
    System.out.println("Checking for Even numbers.");
    System.out.println(simpleMultiplication(2)); // 16
    System.out.println(simpleMultiplication(4)); // 32
    System.out.println(simpleMultiplication(22)); // 176
    System.out.println(simpleMultiplication(26)); // 208
  }
}

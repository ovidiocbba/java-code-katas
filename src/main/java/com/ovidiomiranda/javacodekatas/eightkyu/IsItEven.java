package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/555a67db74814aa4ee0001b5/train/java
public class IsItEven {

  public static boolean isEven(double n) {
    return n % 2 == 0;
  }

  public static void main(String[] args) {
    System.out.println(isEven(0)); // true
    System.out.println(isEven(0.5)); // false
    System.out.println(isEven(1)); // false
    System.out.println(isEven(2)); // true
    System.out.println(isEven(-4)); // true
  }
}

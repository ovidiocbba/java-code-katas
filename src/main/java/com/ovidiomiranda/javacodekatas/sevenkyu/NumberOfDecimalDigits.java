package com.ovidiomiranda.javacodekatas.sevenkyu;

public class NumberOfDecimalDigits {

  public static int Digits(long n) {
    return Long.toString(n).length();
  }

  public static int DigitsV1(long n) {
    return String.valueOf(n).length();
  }

  public static void main(String[] args) {
    System.out.println(Digits(5l)); // 1
    System.out.println(Digits(12345l)); // 5
    System.out.println(Digits(9876543210l));// 10
  }
}

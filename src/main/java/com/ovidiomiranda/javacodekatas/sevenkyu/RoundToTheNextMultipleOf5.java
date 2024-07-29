package com.ovidiomiranda.javacodekatas.sevenkyu;

// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java
public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    if (number % 5 == 0) {
      return number;
    } else {
      return (int) Math.ceil((float) number / 5) * 5;
    }
  }

  public static void main(String[] args) {
    System.out.println(roundToNext5(0)); // 0
    System.out.println(roundToNext5(2)); // 5
    System.out.println(roundToNext5(3)); // 5
    System.out.println(roundToNext5(12)); // 15
    System.out.println(roundToNext5(21)); // 25
    System.out.println(roundToNext5(30)); // 30
    System.out.println(roundToNext5(-2)); //  0
    System.out.println(roundToNext5(-5)); // -5
  }
}

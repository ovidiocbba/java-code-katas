package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java
 */
public class TwiceAsOld {

  public static int twiceAsOld(int dadYears, int sonYears) {
    return Math.abs(dadYears - (sonYears * 2));
  }

  public static void main(String[] args) {
    System.out.println(twiceAsOld(30, 0)); // 30
    System.out.println(twiceAsOld(30, 7)); // 16
    System.out.println(twiceAsOld(45, 30)); // 15
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/56dec885c54a926dcd001095/train/java
public class OppositeNumber {

  public static int opposite(int number) {
    return -1 * number;
  }

  public static int oppositeV1(int number) {
    return number < 0 ? Math.abs(number) : number * -1;
  }

  public static void main(String[] args) {
    System.out.println(opposite(1)); // -1
    System.out.println(opposite(14)); // -14
    System.out.println(opposite(-34)); // 34
  }
}

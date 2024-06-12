package com.ovidiomiranda.javacodekatas.sevenkyu;

// https://www.codewars.com/kata/551f37452ff852b7bd000139/train/java
public class BinaryAddition {

  public static String binaryAddition(int a, int b) {
    return Integer.toBinaryString(a + b);
  }

  public static void main(String[] args) {
    //1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
    //5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
    System.out.println(binaryAddition(1, 1)); // 10
    System.out.println(binaryAddition(5, 9)); // 1110
    System.out.println(binaryAddition(0, 1)); // 1
    System.out.println(binaryAddition(1, 1)); // 1
    System.out.println(binaryAddition(2, 2)); // 100
    System.out.println(binaryAddition(51, 12)); // 111111
  }
}

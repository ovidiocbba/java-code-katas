package com.ovidiomiranda.javacodekatas.sevenkyu;

public class SumOfAngles {

  public static int sumOfAngles(int n) {
    return (n - 2) * 180;
  }

  public static void main(String[] args) {
    System.out.println(sumOfAngles(3)); // 180
    System.out.println(sumOfAngles(4)); // 360
  }
}

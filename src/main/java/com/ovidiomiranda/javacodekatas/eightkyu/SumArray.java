package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

public class SumArray {

  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  }

  public static void main(String[] args) {
    System.out.println(sum(new double[]{})); // 0
    System.out.println(sum(new double[]{-2.398})); // -2.398
    System.out.println(sum(new double[]{1, 2, 3})); // 6
    System.out.println(sum(new double[]{1.1, 2.2, 3.3})); // 6.6
    System.out.println(sum(new double[]{1, 5.2, 4, 0, -1})); // 9.2
    System.out.println(sum(new double[]{30, 89, 100, 101}));// 320
  }
}

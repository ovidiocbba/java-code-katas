package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class NarcissisticNumber {

  public static boolean isNarcissistic(int number) {
    String[] values = String.valueOf(number).split("");
    int exp = values.length;
    int sum = 0;
    for (String value : values) {
      sum += (int) Math.pow(Integer.parseInt(value), exp);
    }
    return sum == number;
  }

  public static boolean isNarcissisticV2(int number) {
    String[] values = String.valueOf(number).split("");
    int result = (int) Arrays.stream(values)
        .mapToDouble(x -> Math.pow(Double.parseDouble(x), values.length)).sum();
    return result == number;
  }

  public static void main(String[] args) {
    // 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    //  1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
    System.out.println(isNarcissistic(1938));//, "153 is narcissistic"); // False

    System.out.println(isNarcissistic(153));//, "153 is narcissistic"); // True
    System.out.println(isNarcissistic(1634)); //"1634 is narcissistic"); // True
    System.out.println(isNarcissistic(112)); //"112 is not narcissistic"); // False
  }
}

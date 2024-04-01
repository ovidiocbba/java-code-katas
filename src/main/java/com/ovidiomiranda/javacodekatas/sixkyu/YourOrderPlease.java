package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class YourOrderPlease {

  public static String order(String words) {
    String[] newArray = words.split(" ");
    String[] result = new String[newArray.length];
    int value = 0;
    while (value < newArray.length) {
      int count = value;
      result[value] = Arrays.stream(newArray).filter(x -> x.contains(String.valueOf(count + 1)))
          .findFirst().orElse("");
      value++;
    }
    return String.join(" ", result);
  }

  public static void main(String[] args) {
    System.out.println(order("is2 Thi1s T4est 3a")); // Thi1s is2 3a T4est
    System.out.println(
        order("4of Fo1r pe6ople g3ood th5e the2"));  // Fo1r the2 g3ood 4of th5e pe6ople
    System.out.println(order(""));// ""
  }
}

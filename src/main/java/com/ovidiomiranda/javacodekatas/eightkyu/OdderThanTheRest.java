package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Odder Than the Rest
// https://www.codewars.com/kata/5983cba828b2f1fd55000114/train/java
public class OdderThanTheRest {

  public static int oddOne(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    return list.stream().filter(x -> x % 2 != 0).findFirst().map(list::indexOf).orElse(-1);
  }

  public static void main(String[] args) {
    System.out.println(oddOne(new int[]{2, 4, 6, 7, 10})); // 3
    System.out.println(oddOne(new int[]{2, 16, 98, 10, 13, 78})); // 4
    System.out.println(oddOne(new int[]{4, -8, 98, -12, -7, 90, 100})); // 4
    System.out.println(oddOne(new int[]{2, 4, 6, 8}));  // -1
  }
}

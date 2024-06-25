package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/54b81566cd7f51408300022d/train/java
public class PartialWordSearching {

  public static String[] findWord(String x, String[] y) {
    String[] result = Arrays.stream(y)
        .filter(value -> value.toUpperCase().contains(x.toUpperCase())).toArray(String[]::new);
    return result.length == 0 ? new String[]{"Empty"} : result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        findWord("me", new String[]{"home", "milk", "Mercury", "fish"}))); // ["home", "Mercury"].
  }
}

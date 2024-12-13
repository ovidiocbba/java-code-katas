package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.Comparator;

// https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java
public class InspiringStrings {

  public static String longestWord(String wordString) {
    String[] values = wordString.split(" ");
    String[] result = Arrays.stream(values).sorted(Comparator.comparingInt(String::length))
        .toArray(String[]::new);
    return result[values.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(longestWord("a b c d e fgh")); // "fgh"
    System.out.println(longestWord("one two three")); // "three"
    System.out.println(longestWord("red blue grey")); //"grey"
  }
}

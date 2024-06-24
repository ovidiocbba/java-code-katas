package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.Comparator;

public class ShortLongShort {

  // https://www.codewars.com/kata/50654ddff44f800200000007/train/java
  // short+long+shor
  public static String solution(String a, String b) {
    return a.length() > b.length() ? b + a + b : a + b + a;
  }

  public static String solutionV2(String a, String b) {
    String[] strings = new String[]{a, b};
    Arrays.sort(strings, Comparator.comparing(String::length));
    return strings[0] + strings[1] + strings[0];
  }

  public static void main(String[] args) {
    System.out.println(solution("a", "bb")); //  "abba"
    System.out.println(solution("aa", "b")); // "baab"
    System.out.println(solution("", "aa")); // "aa"
    System.out.println(solution("bb", "")); // "bb"
  }
}

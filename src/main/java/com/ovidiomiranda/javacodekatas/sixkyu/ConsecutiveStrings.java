package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java
public class ConsecutiveStrings {

  public static String longestConsec(String[] strarr, int k) {
    int limit = strarr.length;
    if (k > limit || k <= 0) {
      return "";
    }
    List<String> result = new ArrayList<>();
    if (k != 1) {
      for (int i = 0; i < strarr.length; i++) {
        String newString = "";
        for (int j = i; j < i + k; j++) {
          if (j >= limit) {
            break;
          }
          newString = newString + strarr[j];
        }
        result.add(newString);
      }
    } else {
      result = Arrays.stream(strarr).collect(Collectors.toList());
    }

    List<Integer> count = new ArrayList<>();
    for (String s : result) {
      count.add(s.length());
    }
    int max = count.stream().max(Integer::compare).get();
    for (String s : result) {
      if (s.length() == max) {
        return s;
      }
    }
    return "";
  }

  public static String longestConsecV1(String[] strarr, int k) {
    int limit = strarr.length;
    if (k > limit || k <= 0) {
      return "";
    }

    String longest = "";
    for (int i = 0; i <= limit - k; i++) {
      StringBuilder newString = new StringBuilder();
      for (int j = i; j < i + k; j++) {
        newString.append(strarr[j]);
      }
      if (newString.length() > longest.length()) {
        longest = newString.toString();
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    System.out.println(
        longestConsec(new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"},
            2));// "folingtrashy");
    System.out.println(longestConsec(
        new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"},
        2));// "abigailtheta");
    System.out.println(longestConsec(
        new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb",
            "oocccffuucccjjjkkkjyyyeehh"}, 1)); // "oocccffuucccjjjkkkjyyyeehh");
    System.out.println(longestConsec(new String[]{}, 3));// "");
    System.out.println(longestConsec(
        new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv",
            "vweqilsfytihvrzlaodfixoyxvyuyvgpck"},
        2)); // "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
    System.out.println(
        longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"},
            2)); // "wlwsasphmxxowiaxujylentrklctozmymu");
    System.out.println(
        longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2)); // "");
    System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
        3)); // "ixoyx3452zzzzzzzzzzzz");
    System.out.println(
        longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));//  "");
    System.out.println(
        longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));//  "");
  }
}

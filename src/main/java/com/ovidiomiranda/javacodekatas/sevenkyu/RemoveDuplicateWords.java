package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

  public static String removeDuplicateWords(String s) {
    return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
  }

  public static String removeDuplicateWordsV1(String s) {
    List<String> values = Arrays.stream(s.split(" ")).distinct().collect(Collectors.toList());
    return String.join(" ", values);
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicateWords(
        "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta")); // "alpha beta gamma delta"
    System.out.println(removeDuplicateWords("my cat is my cat fat")); //"my cat is fat"
  }
}

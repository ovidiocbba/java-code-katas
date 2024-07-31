package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
// "hello case" --> "HelloCase"
// "camel case word" --> "CamelCaseWord"
public class CamelCaseMethod {

  public static String camelCase(String str) {
    return Arrays.stream(str.trim().split("\\s+")).map(
            word -> !word.isEmpty() ? word.substring(0, 1).toUpperCase() + word.substring(1) : word)
        .collect(Collectors.joining(""));
  }

  public static String camelCaseV1(String str) {
    String[] words = str.trim().split("\\s+");
    if (str.isEmpty()) {
      return "";
    }
    List<String> result = new ArrayList<>();
    for (String word : words) {
      String newWord = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
      result.add(newWord);
    }
    return String.join("", result);
  }

  public static void main(String[] args) {
    System.out.println(camelCase("test case")); // TestCase
    System.out.println(camelCase("camel case method")); // CamelCaseMethod
    System.out.println(camelCase(" camel case word")); // CamelCaseWord
    System.out.println(camelCase("say hello ")); // SayHello
    System.out.println(camelCase("z")); // Z
    System.out.println(camelCase("ab  c")); // AbC
    System.out.println(camelCase(""));// ""
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class ReverseWords {

  public static String reverseWords(final String original) {
    List<String> result = new ArrayList<>();
    if (original.trim().isEmpty()) {
      return original;
    } else {
      String[] values = original.split(" ");
      for (String value : values) {
        result.add(new StringBuilder(value).reverse().toString());
      }
    }
    return String.join(" ", result);
  }

  public static String reverseWordsV2(final String original) {
    return original.trim().isEmpty() ? original
        : Arrays.stream(original.split(" ")).map(x -> new StringBuilder(x).reverse().toString())
            .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(reverseWords(
        "The quick brown fox jumps over the lazy dog.")); // "ehT kciuq nworb xof spmuj revo eht yzal .god"
    System.out.println(reverseWords("apple")); // "elppa"
    System.out.println(reverseWords("a b c d")); // "a b c d"
    System.out.println(reverseWords("double  spaced  words")); // elbuod  decaps  sdrow"
  }
}

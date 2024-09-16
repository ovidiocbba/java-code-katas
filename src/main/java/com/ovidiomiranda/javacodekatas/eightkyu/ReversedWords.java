package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
 */
public class ReversedWords {

  public static String reverseWords(String str) {
    List<String> result = Arrays.asList(str.split(" "));
    Collections.reverse(result);
    return String.join(" ", result);
  }

  public static String reverseWordsV1(String str) {
    String[] words = str.split(" ");
    List<String> result = new ArrayList<>();
    for (int i = words.length - 1; i >= 0; i--) {
      result.add(words[i]);
    }
    return String.join(" ", result);
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("hello world!")); // "world! hello"
    System.out.println(
        reverseWords("yoda doesn't speak like this")); // "this like speak doesn't yoda"
    System.out.println(reverseWords("foobar")); // "foobar"
    System.out.println(reverseWords("kata editor")); // "editor kata"
    System.out.println(reverseWords("row row row your boat")); // "boat your row row row"
    System.out.println(reverseWords("")); // ""
  }
}

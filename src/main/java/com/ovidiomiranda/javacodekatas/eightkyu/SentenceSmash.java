package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java
public class SentenceSmash {

  public static String smash(String... words) {
    return String.join(" ", words);
  }

  public static String smashV1(String... words) {
    return Arrays.stream(words).map(x -> String.valueOf(x).trim()).collect(Collectors.joining(" "));
  }

  public static String smashV2(String... words) {
    return Arrays.stream(words).collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(smash("hello")); // hello
    System.out.println(smash("hello", "world")); // hello world
    System.out.println(smash("hello", "world", "this", "is", "great")); // hello world this is great
  }
}

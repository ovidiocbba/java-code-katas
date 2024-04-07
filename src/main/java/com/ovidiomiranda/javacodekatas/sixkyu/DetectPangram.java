package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class DetectPangram {

  public static boolean check(String sentence) {
    String[] characters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
        "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    int numberOfCharacters = characters.length;
    int result = 0;
    for (String character : characters) {
      if (sentence.toUpperCase().contains(character)) {
        result++;
      }
    }
    return numberOfCharacters == result;
  }

  public static boolean checkV2(String sentence) {
    String[] characters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
        "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    return Arrays.stream(characters).allMatch(x -> sentence.toUpperCase().contains(x));
  }

  public static void main(String[] args) {
    String pangram1 = "The quick brown fox jumps over the lazy dog.";
    String pangram2 = "You shall not pass!";
    System.out.println(check(pangram1));// true
    System.out.println(check(pangram2));// false
  }
}

package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMissingLetter {

  public static char findMissingLetter(char[] array) {
    String[] characters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
        "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    List<String> letters = new ArrayList<>();
    for (char value : array) {
      letters.add(String.valueOf(value).toUpperCase());
    }
    Collections.sort(letters);
    String firstLetter = letters.get(0);
    int count = 0;
    for (int i = 0; i < characters.length; i++) {
      if (firstLetter.equals(characters[i])) {
        count = i;
        break;
      }
    }
    for (int i = count, j = 0; i < characters.length; i++, j++) {
      if (!letters.get(j).equals(characters[i])) {
        char missingLetter = characters[i].charAt(0);
        return Character.isLowerCase(array[0]) ? Character.toLowerCase(missingLetter)
            : missingLetter;
      }
    }
    return ' ';
  }

  public static char findMissingLetterV2(char[] array) {
    String[] characters = Character.isLowerCase(array[0]) ? "abcdefghijklmnopqrstuvwxyz".split("")
        : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    List<String> letters = new ArrayList<>();
    for (char value : array) {
      letters.add(String.valueOf(value));
    }
    Collections.sort(letters);
    String firstLetter = letters.get(0);
    // Returns the index of the first occurrence of the specified element in this list.
    int count = Arrays.asList(characters).indexOf(firstLetter);
    for (int i = count, j = 0; i < characters.length; i++, j++) {
      if (!letters.get(j).equals(characters[i])) {
        return characters[i].charAt(0);
      }
    }
    return ' ';
  }

  public static void main(String[] args) {
    System.out.println(findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'})); // 'e'
    System.out.println(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'})); // 'P'
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

public class CountingCharacters {

  static int countCharOccurrences(String s, char c) {
    return (int) Arrays.stream(s.split("")).filter(x -> x.equals(String.valueOf(c)))
        .map(String::new).count();
  }

  public static void main(String[] args) {
    System.out.println(countCharOccurrences("missippi", 'i')); // 3
    System.out.println(countCharOccurrences("feed", 'e')); // 2
    System.out.println(countCharOccurrences("aaaaaaaa", 'a')); // 8
    System.out.println(countCharOccurrences("quicksilver", 'z')); // 0
  }
}

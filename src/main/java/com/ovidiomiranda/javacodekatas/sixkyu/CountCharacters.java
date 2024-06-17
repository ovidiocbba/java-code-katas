package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

  public static Map<Character, Integer> count(String str) {
    Map<Character, Integer> result = new HashMap<>();
    if (!str.isEmpty()) {
      String[] letters = str.split("");
      String[] values = Arrays.stream(letters).map(String::valueOf).sorted().distinct()
          .toArray(String[]::new);
      for (String value : values) {
        int count = (int) Arrays.stream(letters).filter(x -> x.equals(value)).count();
        result.put(value.charAt(0), count);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    //System.out.println(count("aabbbac")); // a:3 b:3 c:1
    System.out.println(count(""));
    //System.out.println(count("a")); // a:3
  }
}

package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class HighestScoringWord {

  public static String high(String s) {
    String[] words = s.split(" ");
    String[] abc = "abcdefghijklmnopqrstuvwxyz".split("");
    Map<String, Integer> result = new LinkedHashMap<>();
    for (String word : words) {
      int count = 0;
      for (int i = 0; i < word.length(); i++) {
        count += Arrays.asList(abc).indexOf(String.valueOf(word.charAt(i))) + 1;
      }
      result.put(word, count);
    }
    Optional<Entry<String, Integer>> value = result.entrySet().stream()
        .max(Map.Entry.comparingByValue());
    return value.get().getKey();
  }


  public static void main(String[] args) {
    System.out.println(high("man i need a taxi up to ubud")); // "taxi"
    System.out.println(high("what time are we climbing up to the volcano")); // volcano
    System.out.println(high("take me to semynak")); // semynak
    System.out.println(high("aa b")); // aa
    System.out.println(high("b aa")); // b
    System.out.println(high("bb d")); // bb
    System.out.println(high("d bb")); // d
    System.out.println(high("aaa b")); // aaa
  }
}

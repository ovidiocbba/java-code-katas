package com.ovidiomiranda.javacodekatas.fivekyu;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

  public static String firstNonRepeatingLetter(String s) {
    if (s.isEmpty()) {
      return "";
    }
    String[] values = s.split("");
    String[] letters = Arrays.stream(s.toUpperCase().split("")).distinct().toArray(String[]::new);
    String result = "";
    Map<String, Integer> map = new LinkedHashMap<>();
    for (String value : letters) {
      int count = (int) Arrays.stream(values).filter(x -> x.equalsIgnoreCase(value)).count();
      map.put(value, count);
    }
    for (Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        result = Arrays.stream(values).filter(x -> x.equalsIgnoreCase(entry.getKey())).findFirst()
            .orElse("");
        break;
      }
    }
    return result;
  }

  public static String firstNonRepeatingLetterV2(String s) {
    String[] values = s.split("");
    for (String value : values) {
      if (Arrays.stream(values).filter(x -> x.equalsIgnoreCase(value)).count() == 1) {
        return value;
      }
    }
    return "";
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeatingLetter("a")); // a
    System.out.println(firstNonRepeatingLetter("streSS")); // t
    System.out.println(firstNonRepeatingLetter("moon-men")); // -
    System.out.println(firstNonRepeatingLetter("moonmoon")); // ""
    System.out.println(firstNonRepeatingLetter("")); //
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
public class LineNumbering {

  public static List<String> number(List<String> lines) {
    List<String> result = new ArrayList<>();
    if (lines.isEmpty()) {
      return lines;
    } else {
      int count = 1;
      for (String line : lines) {
        result.add(String.format("%s: %s", count, line));
        count++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    //System.out.println(number(Arrays.asList()));//  empty
    System.out.println(number(Arrays.asList("a", "b", "c"))); // "1: a", "2: b", "3: c"
    System.out.println(
        number(Arrays.asList("", "", "", "", ""))); // "1: ", "2: ", "3: ", "4: ", "5: "
  }
}

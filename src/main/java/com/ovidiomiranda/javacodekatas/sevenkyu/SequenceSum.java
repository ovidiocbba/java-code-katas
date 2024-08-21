package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763/train/java
public class SequenceSum {

  public static String showSequence(int value) {
    if (value == 0) {
      return "0=0";
    } else {
      if (value < 0) {
        return value + "<0";
      }
    }
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i <= value; i++) {
      numbers.add(i);
    }
    int total = numbers.stream().mapToInt(Integer::intValue).sum();
    String result = numbers.stream().map(String::valueOf).collect(Collectors.joining("+"));
    return result + " = " + total;
  }

  public static void main(String[] args) {
    System.out.println(showSequence(6)); // 0+1+2+3+4+5+6 = 21
    System.out.println(showSequence(0)); // 0=0
  }
}


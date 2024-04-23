package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.List;

public class VowelCount {

  // https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
  public static int getCount(String str) {
    String[] array = str.split("");
    List<String> vowels = new ArrayList<>();
    vowels.add("a");
    vowels.add("e");
    vowels.add("i");
    vowels.add("o");
    vowels.add("u");
    int count = 0;
    for (String letter : array) {
      if (vowels.contains(letter)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(getCount("abracadabra")); // 5
  }
}

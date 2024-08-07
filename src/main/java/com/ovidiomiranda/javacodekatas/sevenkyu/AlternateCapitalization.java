package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

public class AlternateCapitalization {

  public static String[] capitalize(String s) {
    StringBuilder firstString = new StringBuilder();
    StringBuilder secondString = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        firstString.append(String.valueOf(s.charAt(i)).toUpperCase());
      } else {
        firstString.append(s.charAt(i));
      }
    }
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 != 0) {
        secondString.append(String.valueOf(s.charAt(i)).toUpperCase());
      } else {
        secondString.append(s.charAt(i));
      }
    }
    return new String[]{firstString.toString(), secondString.toString()};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(capitalize("abcdef"))); // "AbCdEf", "aBcDeF"
    System.out.println(Arrays.toString(capitalize("codewars"))); // "CoDeWaRs", "cOdEwArS"
    System.out.println(Arrays.toString(capitalize("abracadabra"))); // "AbRaCaDaBrA", "aBrAcAdAbRa"
    System.out.println(
        Arrays.toString(capitalize("codewarriors"))); // "CoDeWaRrIoRs", "cOdEwArRiOrS"
  }
}

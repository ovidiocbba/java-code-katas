package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {

  public static String longest(String s1, String s2) {
    List<String> result = Arrays.stream(s1.concat(s2).split("")).distinct().sorted()
        .collect(Collectors.toList());
    return String.join("", result);
  }

  public static String longestV2(String s1, String s2) {
    return Arrays.stream(s1.concat(s2).split("")).distinct().sorted().collect(Collectors.joining());
  }

  public static void main(String[] args) {
    System.out.println(longest("aretheyhere", "yestheyarehere"));// "aehrsty"
    System.out.println(
        longest("loopingisfunbutdangerous", "lessdangerousthancoding")); //abcdefghilnoprstu
    System.out.println(longest("inmanylanguages", "theresapairoffunctions")); //acefghilmnoprstuy
  }
}

package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class StringSplit {

  public static String[] solution(String s) {
    s = s.length() % 2 != 0 ? s.concat("_") : s;
    return s.split("(?<=\\G.{2})");
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution("abc"))); // ['ab', 'c_']
    System.out.println(Arrays.toString(solution("abcdef"))); // ['ab', 'cd', 'ef']
  }
}

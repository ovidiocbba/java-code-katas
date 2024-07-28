package com.ovidiomiranda.javacodekatas.eightkyu;

public class ReversedStrings {

  public static String solution(String str) {
    StringBuilder result = new StringBuilder(str);
    return result.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("world")); // dlrow
    System.out.println(solution("word")); // drow
  }
}

package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class DuplicateEncoder {

  static String encode(String word) {
    String[] values = word.toLowerCase().split("");
    StringBuilder result = new StringBuilder();
    for (String value : values) {
      int count = (int) Arrays.stream(values).filter(x -> x.equals(value)).count();
      if (count > 1) {
        result.append(")");
      } else {
        result.append("(");
      }
    }
    return result.toString();
  }

  static String encodeV2(String word) {
    String[] values = word.toLowerCase().split("");
    StringBuilder result = new StringBuilder();
    for (String value : values) {
      result.append(Arrays.stream(values).filter(x -> x.equals(value)).count() > 1 ? ")" : "(");
    }
    return result.toString();
  }

  public static void main(String[] args) {
    // ( New.
    // ) duplicate.
//    "din"      =>  "((("
//    "recede"   =>  "()()()"
//    "Success"  =>  ")())())"
//    "(( @"     =>  "))(("
    System.out.println(encode("din"));
    System.out.println(encode("recede"));
    System.out.println(encode("Success"));
    System.out.println(encode("(( @"));
  }
}

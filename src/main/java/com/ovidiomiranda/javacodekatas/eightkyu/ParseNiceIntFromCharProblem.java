package com.ovidiomiranda.javacodekatas.eightkyu;

public class ParseNiceIntFromCharProblem {

  public static int howOld(final String herOld) {
    return Character.getNumericValue(herOld.charAt(0));
  }

  public static void main(String[] args) {
    System.out.println(howOld("5 years old")); // 5
    System.out.println(howOld("9 years old")); // 9
    System.out.println(howOld("1 year old")); // 1
  }
}

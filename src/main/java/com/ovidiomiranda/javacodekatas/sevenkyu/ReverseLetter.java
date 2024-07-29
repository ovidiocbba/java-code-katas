package com.ovidiomiranda.javacodekatas.sevenkyu;

public class ReverseLetter {

  public static String reverseLetter(final String str) {
    return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reverseLetter("krishan")); // nahsirk
    System.out.println(reverseLetter("ultr53o?n")); // nortlu
    System.out.println(reverseLetter("ab23c")); // cba
    System.out.println(reverseLetter("krish21an")); // nahsirk
  }
}

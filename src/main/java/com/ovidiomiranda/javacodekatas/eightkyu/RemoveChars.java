package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
public class RemoveChars {

  public static String remove(String str) {
    return str.substring(1, str.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println(remove("eloquent")); // loquen
    System.out.println(remove("country")); // ountr
    System.out.println(remove("person")); // erso
    System.out.println(remove("place")); // lac
  }
}

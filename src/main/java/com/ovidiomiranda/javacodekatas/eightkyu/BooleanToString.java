package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java
public class BooleanToString {

  public static String convert(boolean b) {
    return String.valueOf(b);
  }

  public static void main(String[] args) {
    System.out.println(convert(true)); // true
    System.out.println(convert(false)); // false
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java
public class CenturyFromYear {

  public static int century(int number) {
    return (int) Math.ceil((double) number / 100);
  }

  public static void main(String[] args) {
    System.out.println(century(1705)); // 18
    System.out.println(century(1900)); // 19
    System.out.println(century(1601)); // 17
    System.out.println(century(2000)); // 20
    System.out.println(century(89)); // 1
  }
}

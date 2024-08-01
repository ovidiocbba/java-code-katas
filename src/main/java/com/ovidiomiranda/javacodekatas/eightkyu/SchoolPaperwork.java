package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java
public class SchoolPaperwork {

  public static int paperWork(int n, int m) {
    return (n < 0 || m < 0) ? 0 : n * m;
  }

  public static int paperWorkV1(int n, int m) {
    if (n < 0 || m < 0) {
      return 0;
    }
    return n * m;
  }

  public static void main(String[] args) {
    System.out.println(paperWork(5, 5)); // 25
    System.out.println(paperWork(5, -5)); // 0
    System.out.println(paperWork(-5, -5)); // 0
    System.out.println(paperWork(-5, 5)); // 0
    System.out.println(paperWork(5, 0)); // 0
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java
// 1st (1)   2nd (3)    3rd (6)
//    *         **        ***
//              *         **
//                        *
// 0 --> 0
// 2 --> 3
// 3 --> 6
// -10 --> 0
public class TriangularTreasure {

  public static long triangular(long n) {
    if (n <= 0) {
      return 0;
    }
    long count = 0;
    for (long i = n; i >= 0; i--) {
      count += i;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(triangular(2)); // 3
    System.out.println(triangular(4)); // 10
    System.out.println(triangular(1275)); // 813450
    System.out.println(triangular(0)); // 0
    System.out.println(triangular(-1)); // 0
  }
}


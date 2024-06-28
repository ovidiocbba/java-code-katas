package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java
public class SimpleBeadsCount {

  // Two red beads are placed between every two blue beads.
  // _RR _RR
  // returns the number of red beads.
  // If there are less than "2" blue beads return 0.
  // _RR_RR_RR_RR_RR_
  public static int countRedBeads(final int nBlue) {
    return nBlue < 2 ? 0 : 2 * nBlue - 2;
  }

  //
  public static int countRedBeadsV2(final int nBlue) {
    StringBuilder result = new StringBuilder();
    String blue = "_";
    String red = "RR";
    if (nBlue < 2) {
      return 0;
    } else {
      for (int i = 1; i < nBlue; i++) {
        result.append(blue).append(red);
      }
    }
    return (int) Arrays.stream(result.toString().split("")).filter(x -> x.equals("R")).count();
  }

  public static void main(String[] args) {
    /*System.out.println(countRedBeads(0)); // 0 -> "2" blue beads return 0.
    System.out.println(countRedBeads(1)); // 0 -> "2" blue beads return 0.
    System.out.println(countRedBeads(3)); // 4  _RR_RR_
    System.out.println(countRedBeads(5)); // 8  _RR_RR_RR_RR_*/
    System.out.println(countRedBeads(118236));
  }
}

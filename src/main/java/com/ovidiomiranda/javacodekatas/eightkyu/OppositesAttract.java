package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
public class OppositesAttract {

  // If one of the flowers has an even number of petals
  // and the other has an odd number of petals it means they are in love.
  // Even: 2, 4, 6, 8, 10
  // Odd: 1, 3, 5, 7, 9
  public static boolean isLove(final int flower1, final int flower2) {
    int count = 0;
    if (flower1 % 2 == 0 || flower2 % 2 == 0) {
      count++;
    }
    if (flower1 % 2 != 0 || flower2 % 2 != 0) {
      count++;
    }
    return count == 2;
  }

  public static void main(String[] args) {
    System.out.println(isLove(1, 4)); // true
    System.out.println(isLove(2, 2)); // false
    System.out.println(isLove(1, 1)); // false
    System.out.println(isLove(0, 1)); // true
  }
}

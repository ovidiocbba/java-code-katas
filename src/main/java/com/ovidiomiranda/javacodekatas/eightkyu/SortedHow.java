package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.codewars.com/kata/580a4734d6df748060000045/train/java
 */
public class SortedHow {

  /*
  "yes, ascending" - if the numbers in the array are sorted in an ascending order
  "yes, descending" - if the numbers in the array are sorted in a descending order
  "no" - otherwise
   */
  public static String isSortedAndHow(int[] array) {
    int[] ascending = Arrays.stream(array).sorted().toArray();
    int[] descending = Arrays.stream(array).boxed().sorted(Collections.reverseOrder())
        .mapToInt(Integer::intValue).toArray();
    if (Arrays.equals(array, ascending)) {
      return "yes, ascending";
    } else if (Arrays.equals(array, descending)) {
      return "yes, descending";
    }
    return "no";
  }

  public static void main(String[] args) {
    System.out.println(isSortedAndHow(new int[]{1, 2})); // "yes, ascending"
    System.out.println(isSortedAndHow(new int[]{15, 7, 3, -8})); // "yes, descending"
    System.out.println(isSortedAndHow(new int[]{4, 2, 30})); // "no"
  }
}

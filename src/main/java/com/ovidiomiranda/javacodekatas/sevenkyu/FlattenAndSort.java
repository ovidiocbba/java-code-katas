package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java
public class FlattenAndSort {

  // Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
  public static int[] flattenAndSort(int[][] array) {
    List<Integer> result = new ArrayList<>();
    for (int[] matrix : array) {
      for (int value : matrix) {
        result.add(value);
      }
    }
    return result.stream().sorted().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(flattenAndSort(new int[][]{}))); // {}
    System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}}))); // {1}
    System.out.println(Arrays.toString(flattenAndSort(
        new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}))); // {1, 2, 3, 4, 5, 6, 7, 8, 9}
    System.out.println(Arrays.toString(
        flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}}))); // {1, 2, 3, 4, 5, 6, 100}
    System.out.println(Arrays.toString(flattenAndSort(
        new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666},
            {555}}))); // {111, 222, 333, 444, 555, 666, 777, 888, 999}
  }
}

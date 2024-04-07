package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;

public class SortTheOdd {

  public static int[] sortArray(int[] array) {
    int[] oddNumbers = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
    int odd = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array[i] = oddNumbers[odd];
        odd++;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArray(new int[]{7, 1}))); //  [1, 7]
    System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));// [3, 8, 6, 5, 4]
    System.out.println(Arrays.toString(
        sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}))); //  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
  }
}

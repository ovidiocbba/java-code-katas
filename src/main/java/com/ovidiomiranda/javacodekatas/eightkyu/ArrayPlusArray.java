package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
 */
public class ArrayPlusArray {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
  }

  public static int arrayPlusArrayV1(int[] arr1, int[] arr2) {
    return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sum();
  }

  public static void main(String[] args) {
    System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6})); // 21
    System.out.println(arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6})); // - 21
    System.out.println(arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6})); // 15
    System.out.println(arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600})); // 2100
  }
}

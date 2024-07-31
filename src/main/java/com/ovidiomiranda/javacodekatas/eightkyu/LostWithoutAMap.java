package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
public class LostWithoutAMap {

  public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(x -> x * 2).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));// {2, 4, 6}
    System.out.println(Arrays.toString(map(new int[]{4, 1, 1, 1, 4}))); // {8, 2, 2, 2, 8}
    System.out.println(Arrays.toString(map(new int[]{1, 1, 1, 1, 1, 1}))); // {2, 2, 2, 2, 2, 2}
  }
}

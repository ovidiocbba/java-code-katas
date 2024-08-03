package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5513795bd3fafb56c200049e
public class CountByX {

  // countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
  // countBy(2,5)  // should return {2,4,6,8,10}

  public static int[] countBy(int x, int n) {
    return IntStream.rangeClosed(1, n).map(inc -> inc * x).toArray();
  }

  public static int[] countByV1(int x, int n) {
    List<Integer> result = new ArrayList<>();
    int value = x;
    result.add(value);
    for (int i = 0; i < n - 1; i++) {
      result.add(value += x);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] countByV2(int x, int n) {
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = x * (i + 1);
    }
    return result;
  }

  public static int[] countByV3(int x, int n) {
    return IntStream.range(1, n + 1).map(inc -> inc * x).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(countBy(1, 10)));// {1,2,3,4,5,6,7,8,9,10}
    System.out.println(Arrays.toString(countBy(2, 5))); // {2,4,6,8,10}
    System.out.println(Arrays.toString(countBy(3, 7))); // {3,6,9,12,15,18,21}
    System.out.println(Arrays.toString(countBy(50, 5))); // {50,100,150,200,250}
    System.out.println(Arrays.toString(countBy(100, 6))); // {100,200,300,400,500,600},
  }
}

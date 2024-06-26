package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;


//https://www.codewars.com/kata/58e0cb3634a3027180000040/train/java
public class SortByValueAndIndex {

  //  Input: 23, 2, 3, 4, 5
//  Product of value and index:
//      23 => 23 * 1 = 23  -> Output-Pos 4
//      2 =>  2 * 2 = 4   -> Output-Pos 1
//      3 =>  3 * 3 = 9   -> Output-Pos 2
//      4 =>  4 * 4 = 16  -> Output-Pos 3
//      5 =>  5 * 5 = 25  -> Output-Pos 5
//
//        4, 9 ,16, 23, 25
//        2, 3 ,4 ,23, 5
//  Output: 2, 3, 4, 23, 5
  public static int[] sortByValueAndIndex(int[] array) {
    Map<Double, Integer> result = new TreeMap<>();
    int count = 1;
    for (int value : array) {
      double key = value * count;
      result.put(result.containsKey(key) ? key + 0.1 : key, value);
      count++;
    }
    return result.values().stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] sortByValueAndIndexV2(int[] array) {
    return IntStream.range(0, array.length).boxed()
        .sorted(Comparator.comparingInt(i -> array[i] * (i + 1))).mapToInt(i -> array[i]).toArray();
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(sortByValueAndIndex(new int[]{23, 2, 3, 4, 5}))); // 2, 3, 4, 23, 5
    System.out.println(Arrays.toString(sortByValueAndIndex(
        new int[]{24, 2, -22, 18, -9, 1, 23, 29, 26, 3, -19, 2, 4, -20, 14, -10, -10, 6, 16, -2})));
    // [-20, -19, -10, -10, -22, -9, -2, 2, 1, 24, 2, 3, 4, 18, 6, 23, 14, 29, 26, 16]
  }
}

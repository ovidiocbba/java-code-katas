package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
// Max Occurrences=2
// [1,2,3,1,2,1,2,3]   1=3 2=3 3=2
// [1,2,3,1,2,3]
// [20,37,20,21] and Max Occurrences=1
// [20,37,21]
public class DeleteOccurrences {

  public static int[] deleteNth(int[] elements, int max) {
    final HashMap<Integer, Integer> countMap = new HashMap<>();
    final List<Integer> result = new ArrayList<>();
    for (int element : elements) {
      int count = countMap.getOrDefault(element, 0);
      if (count < max) {
        countMap.put(element, count + 1);
        result.add(element);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] deleteNthV1(int[] elements, int maxOccurrences) {
    List<Integer> result = new ArrayList<>();
    int[] validValues = Arrays.stream(elements).sorted().distinct().toArray();
    HashMap<Integer, Integer> mapResult = new HashMap<>();
    for (int validValue : validValues) {
      mapResult.put(validValue, 0);
    }
    for (int element : elements) {
      int newValue = mapResult.get(element) + 1;
      if (newValue <= maxOccurrences) {
        mapResult.put(element, newValue);
        result.add(element);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    // [1,2,3,1,2,1,2,3]   1=3 2=3 3=2
    // [1,2,3,1,2,3]
    System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2)));
  }
}

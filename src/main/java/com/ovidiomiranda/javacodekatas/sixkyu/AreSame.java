package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSame {

  public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null) {
      return false;
    }
    int[] newA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
    Arrays.sort(b);
    return Arrays.equals(newA, b);
  }

  public static boolean compV2(int[] a, int[] b) {
    boolean result = false;
    if (a == null || b == null) {
      return false;
    }
    if (a.length == 0 && b.length == 0) {
      return true;
    }
    if (a.length != b.length) {
      return false;
    }
    int lastValue = a[a.length - 1];
    int firstValue = lastValue * lastValue;
    if (b[0] == firstValue) {
      for (int i = 0; i < a.length - 1; i++) {
        int value = a[i] * a[i];
        if (b[i + 1] == value) {
          result = true;
        } else {
          result = false;
          break;
        }
      }
    }
    return result;
  }

  public static boolean compV3(int[] a, int[] b) {
    if (a == null || b == null) {
      return false;
    }

    if (a.length != b.length) {
      return false;
    }
    Map<Integer, Integer> freqA = new HashMap<>();
    Map<Integer, Integer> freqB = new HashMap<>();
    for (int num : a) {
      freqA.put(num, freqA.getOrDefault(num, 0) + 1);
    }
    for (int num : b) {
      freqB.put(num, freqB.getOrDefault(num, 0) + 1);
    }
    // Check if every element in freqA squared is in freqB with the same count
    for (Map.Entry<Integer, Integer> entry : freqA.entrySet()) {
      int num = entry.getKey();
      int squaredNum = num * num;
      if (!freqB.containsKey(squaredNum) || !freqB.get(squaredNum).equals(entry.getValue())) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    System.out.println(comp(a, b)); // true
    // a[2, 2, 3]  b[4, 4, 9] = true // Falla por que es diferene orden.
    // a[] b[] = true
  }
}

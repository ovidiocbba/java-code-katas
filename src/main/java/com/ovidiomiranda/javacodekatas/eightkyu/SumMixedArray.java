package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

  public static int sum(List<?> mixed) {
    return mixed.stream().mapToInt(x -> Integer.parseInt(x.toString())).sum();
  }

  public static int sumV1(List<?> mixed) {
    List<Integer> values = new ArrayList<>();
    for (Object object : mixed) {
      if (object instanceof String) {
        values.add(Integer.parseInt((String) object));
      } else {
        values.add((Integer) object);
      }
    }
    return values.stream().mapToInt(Integer::intValue).sum();
  }

  public static void main(String[] args) {
    System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7))); // 42
    System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"))); // 41
    System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3"))); //45
  }
}

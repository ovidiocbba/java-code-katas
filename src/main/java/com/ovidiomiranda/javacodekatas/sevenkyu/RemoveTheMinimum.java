package com.ovidiomiranda.javacodekatas.sevenkyu;

import static java.util.stream.IntStream.range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTheMinimum {

  public static int[] removeSmallest(int[] numbers) {
    int numberMin = Arrays.stream(numbers).min().orElse(0);
    int count = 0;
    List<Integer> result = new ArrayList<>();
    for (int number : numbers) {
      if (number == numberMin && count == 0) {
        count++;
      } else {
        result.add(number);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] removeSmallestV2(int[] numbers) {
    int min = range(0, numbers.length).reduce((i, j) -> numbers[i] > numbers[j] ? j : i).orElse(-1);
    return range(0, numbers.length).filter(i -> i != min).map(i -> numbers[i]).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(removeSmallest(new int[]{1, 2, 3, 4, 5}))); // [2, 3, 4, 5]
    System.out.println(Arrays.toString(removeSmallest(new int[]{5, 3, 2, 1, 4}))); // [5, 3, 2, 4]
    System.out.println(Arrays.toString(removeSmallest(new int[]{2, 2, 1, 2, 1}))); // [2, 2, 2, 1]
    System.out.println(Arrays.toString(removeSmallest(new int[]{1, 2, 3, 4, 5}))); // [2, 3, 4, 5]
  }
}

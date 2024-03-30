package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    for (int value : a) {
      int count = (int) Arrays.stream(b).filter(x -> x == value).count();
      if (count == 0) {
        result.add(value);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] arrayDiffV2(int[] a, int[] b) {
    List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
    aList.removeAll(bList);
    return aList.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1}))); // {2}
    System.out.println(
        Arrays.toString(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2}))); // {1, 3};
    System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1}))); // {2}

    System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1}))); // {2,2}

    System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2}))); // {1}

    System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{}))); //  {1,2,2}

    System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2}))); //{}
  }

}

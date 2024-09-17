package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {

  public static Object[] removeEveryOther(Object[] arr) {
    List<Object> result = new ArrayList<>();

    if (arr == null || arr.length == 0) {
      return arr;
    }
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        result.add(arr[i]);
      }
    }
    return result.toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(removeEveryOther(
        new Object[]{"Hello", "Goodbye", "Hello Again"}))); // { "Hello", "Hello Again" }
    System.out.println(
        Arrays.toString(removeEveryOther(new Object[]{new Object[]{1, 2}}))); //  { 1, 2 }

    System.out.println(Arrays.toString(
        removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))); //  { 1, 3, 5, 7, 9 }
    System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Goodbye"}))); // { "Goodbye" }
    System.out.println(Arrays.toString(removeEveryOther(new Object[]{}))); // {}
  }
}

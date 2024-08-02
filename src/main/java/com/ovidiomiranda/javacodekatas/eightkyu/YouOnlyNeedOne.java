package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.Arrays;

// https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
public class YouOnlyNeedOne {

  public static boolean check(Object[] a, Object x) {
    return Arrays.asList(a).contains(x);
  }

  public static boolean checkV1(Object[] a, Object x) {
    for (Object object : a) {
      if (object == x) {
        return true;
      }
    }
    return false;
  }

  public static boolean checkV2(Object[] a, Object x) {
    return Arrays.stream(a).anyMatch(value -> value.equals(x));
  }

  public static void main(String[] args) {
    System.out.println(check(new Object[]{66, 101}, 66)); // true);
    System.out.println(check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45)); // true);
    System.out.println(check(new Object[]{'t', 'e', 's', 't'}, 'e')); // true);
    System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "kat")); // false);
  }
}

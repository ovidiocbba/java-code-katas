package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.HashMap;

// https://www.codewars.com/kata/59dd3ccdded72fc78b000b25/train/java
public class ReturnTheDay {

  public static String getDay(int n) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Sunday");
    map.put(2, "Monday");
    map.put(3, "Tuesday");
    map.put(4, "Wednesday");
    map.put(5, "Thursday");
    map.put(6, "Friday");
    map.put(7, "Saturday");
    return map.getOrDefault(n, "Wrong, please enter a number between 1 and 7");
  }

  public static void main(String[] args) {
//    1 returns "Sunday"
//    2 returns "Monday"
//    3 returns "Tuesday"
//    4 returns "Wednesday"
//    5 returns "Thursday"
//    6 returns "Friday"
//    7 returns "Saturday"
    System.out.println(getDay(1)); // "Sunday"
    System.out.println(getDay(2)); // Monday
    System.out.println(getDay(3)); // Tuesday
    System.out.println(getDay(8)); // "Wrong, please enter a number between 1 and 7"
    System.out.println(getDay(20)); // "Wrong, please enter a number between 1 and 7"
  }
}

package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * https://www.codewars.com/kata/568dcc3c7f12767a62000038/solutions/java
 */
public class L1SetAlarm {

  public static boolean setAlarm(boolean employed, boolean vacation) {
    if (employed == vacation) {
      return false;
    }
    return employed;
  }

  public static void main(String[] args) {
    System.out.println(setAlarm(true, false)); // true
    System.out.println(setAlarm(true, true)); // false
    System.out.println(setAlarm(false, false)); // false
    System.out.println(setAlarm(false, true)); // false
  }
}

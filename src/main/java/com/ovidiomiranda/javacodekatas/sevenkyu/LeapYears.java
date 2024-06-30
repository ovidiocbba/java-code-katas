package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.time.Year;

// https://www.codewars.com/kata/526c7363236867513f0005ca/train/java
public class LeapYears {

  //Years divisible by 4 are leap years,
  //but years divisible by 100 are not leap years,
  //but years divisible by 400 are leap years.
  //Tested years are in range 1600 ≤ year ≤ 4000.
  public static boolean isLeapYear(int year) {
    if (year >= 1600 && year <= 4000) {
      if (year % 400 == 0) {
        return true;
      } else {
        if (year % 100 == 0) {
          return false;
        } else {
          return year % 4 == 0;
        }
      }
    }
    return false;
  }

  public static boolean isLeapYearV2(int year) {
     return Year.of(year).isLeap();
  }

  public static void main(String[] args) {
    System.out.println(isLeapYear(2020)); // true
    System.out.println(isLeapYear(2000)); // true
    System.out.println(isLeapYear(2015)); // false
    System.out.println(isLeapYear(2100)); // false
  }
}

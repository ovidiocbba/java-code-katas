package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145/train/java
public class KeepUpTheHoop {

  // If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
  // If he doesn't get 10 hoops, return the string "Keep at it until you get it".
  public static String hoopCount(int n) {
    return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
  }

  public static void main(String[] args) {
    //11
    //100
    //10
    System.out.println(hoopCount(11)); // "Great, now move on to tricks"
    System.out.println(hoopCount(7)); // "Keep at it until you get it"
  }

}

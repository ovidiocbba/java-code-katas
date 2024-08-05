package com.ovidiomiranda.javacodekatas.eightkyu;

public class RemoveExclamationMarks {

  public static String removeExclamationMarks(String s) {
    return s.replaceAll("!", "");
  }

  public static void main(String[] args) {
    System.out.println(removeExclamationMarks("Hello World!")); // Hello World
  }
}

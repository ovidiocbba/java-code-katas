package com.ovidiomiranda.javacodekatas.sevenkyu;

public class GreetMe {

  public static String greet(String name) {
    return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
  }

  public static String greetV1(String name) {
    String newString = (name.toLowerCase()).substring(1, name.length());
    String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
    return String.format("Hello %s!", firstLetter + newString);
  }

  public static void main(String[] args) {
    System.out.println(greet("riley")); // "Hello Riley!",
  }
}

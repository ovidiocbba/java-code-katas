package com.ovidiomiranda.javacodekatas.eightkyu;

public class JennySecretMessage {

  public static String greet(String name) {
    return String.format("Hello, %s!", name.equals("Johnny") ? "my love" : name);
  }

  public static String greetv1(String name) {
    if (name.equals("Johnny")) {
      return "Hello, my love!";
    } else {
      return String.format("Hello, %s!", name);
    }
  }

  public static void main(String[] args) {
    System.out.println(greet("Jim")); // "Hello, Jim!"
    System.out.println(greet("Jane")); // "Hello, Jane!"
    System.out.println(greet("Simon")); // "Hello, Simon!"
    System.out.println(greet("Johnny")); // "Hello, my love!"
  }
}

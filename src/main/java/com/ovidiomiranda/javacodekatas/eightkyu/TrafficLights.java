package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.HashMap;

// https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
public class TrafficLights {

  public static String updateLight(String current) {
    HashMap<String, String> map = new HashMap<>();
    map.put("red", "green");
    map.put("green", "yellow");
    map.put("yellow", "red");
    return map.get(current);
  }

  public static void main(String[] args) {
    // green, to yellow, to red, and then to green again.
    // For example, when the input is green, output should be yellow.
    System.out.println(updateLight("red")); // green
    System.out.println(updateLight("green")); // yellow
    System.out.println(updateLight("yellow")); // red
  }
}

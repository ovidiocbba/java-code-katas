package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
public class Banjo {

  // If your name starts with the letter "R" or lower case "r", you are playing banjo!
  public static String areYouPlayingBanjo(String name) {
    return name.matches("[Rr].*") ? name + " plays banjo" : name + " does not play banjo";
  }

  public static String areYouPlayingBanjoV1(String name) {
    return String.valueOf(name.charAt(0)).equalsIgnoreCase("R") ? name + " plays banjo"
        : name + " does not play banjo";
  }

  public static String areYouPlayingBanjoV2(String name) {
    return name.toUpperCase().startsWith("R") ? name + " plays banjo"
        : name + " does not play banjo";
  }

  public static void main(String[] args) {
    System.out.println(areYouPlayingBanjo("Martin")); // "Martin does not play banjo"
    System.out.println(areYouPlayingBanjo("Rikke")); // "Rikke plays banjo"
    System.out.println(areYouPlayingBanjo("rolf")); // "rolf plays banjo"
    System.out.println(areYouPlayingBanjo("bravo")); // "bravo does not play banjo"
  }
}

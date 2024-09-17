package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
 */
public class FeastOfManyBeasts {

  // The dish must 'start' and 'end' with the same letters as the animal's name.
  // For example
  // The great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
  public static boolean feast(String beast, String dish) {
    return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(
        dish.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println(feast("great blue heron", "garlic nann")); // true
    System.out.println(feast("chickadee", "chocolate cake")); // true
    System.out.println(feast("brown bear", "bear claw")); // false
//    great blue heron
//    garlic nann
//    Prueba
//        chickadee
//    chocolate cake
//    Prueba
//    brown bear
//    bear claw
  }
}

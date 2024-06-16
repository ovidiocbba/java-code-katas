package com.ovidiomiranda.javacodekatas.sixkyu;

public class BreakCamelCase {

  public static String camelCase(String input) {
    String[] values = input.split("(?=\\p{Upper})");
    return String.join(" ", values);
  }

//  public static String camelCase(String input) {
//    String[] values = input.split("");
//    StringBuilder result = new StringBuilder();
//    for (String value : values) {
//      if (Character.isUpperCase(value.charAt(0))) {
//        result.append(" ").append(value);
//      } else {
//        result.append(value);
//      }
//    }
//    return result.toString();
//  }

  public static void main(String[] args) {
    System.out.println(camelCase("camelCasing"));// "camel Casing"
    System.out.println(camelCase("camelCasingTest"));// "camel Casing Test"
    System.out.println(camelCase("camelcasingtest")); // "camelcasingtest"
  }
}

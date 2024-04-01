package com.ovidiomiranda.javacodekatas.sixkyu;

public class ConvertStringToCamelCase {

  static String toCamelCase(String s) {
    s = s.replace("-", " ");
    s = s.replace("_", " ");
    String[] result = s.split(" ");
    for (int i = 1; i < result.length; i++) {
      result[i] = convert(result[i]);
    }
    return String.join("", result);
  }

  static String convert(String word) {
    String[] value = word.split("");
    value[0] = value[0].toUpperCase();
    return String.join("", value);
  }

  static String toCamelCaseV2(String s) {
    String[] words = s.split("[-_]");
    for (int i = 1; i < words.length; i++) {
      words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
    }
    return String.join("", words);
  }

  public static void main(String[] args) {
    // "the-stealth-warrior" gets converted to "theStealthWarrior"
    // "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
    // "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
    System.out.println(toCamelCase("the-stealth-warrior")); // "theStealthWarrior"
    System.out.println(toCamelCase("The_Stealth_Warrior")); // "TheStealthWarrior"
    System.out.println(toCamelCase("The_Stealth-Warrior")); // "TheStealthWarrior"
  }
}

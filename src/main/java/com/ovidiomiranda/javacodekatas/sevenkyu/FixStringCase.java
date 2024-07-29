package com.ovidiomiranda.javacodekatas.sevenkyu;

// https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java
public class FixStringCase {

  // if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
  // solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
  // solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
  // solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
  public static String solve(final String str) {
    int upperCase = (int) str.chars().filter(Character::isUpperCase).count();
    int lowerCase = (int) str.chars().filter(Character::isLowerCase).count();
    return upperCase > lowerCase ? str.toUpperCase() : str.toLowerCase();
  }

  public static String solveV1(final String str) {
    int uppercase = 0;
    int lowercase = 0;
    for (String character : str.split("")) {
      if (character.equals(character.toUpperCase())) {
        uppercase++;
      } else {
        lowercase++;
      }
    }
    return uppercase > lowercase ? str.toUpperCase() : str.toLowerCase();
  }

  public static String solveV2(final String str) {
    int uppercase = 0;
    int lowercase = 0;
    for (Character value : str.toCharArray()) {
      if (Character.isUpperCase(value)) {
        uppercase++;
      } else {
        lowercase++;
      }
    }
    return uppercase > lowercase ? str.toUpperCase() : str.toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println(solve("code")); // code
    System.out.println(solve("CODe"));// CODE
    System.out.println(solve("COde")); // code
    System.out.println(solve("Code")); // code
    System.out.println(solve("")); // ""
  }
}

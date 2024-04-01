package com.ovidiomiranda.javacodekatas.fivekyu;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SimplePigLatin {

  public static String pigIt(String str) {
    String[] words = str.split(" ");
    String pay = "ay";
    for (int i = 0; i < words.length; i++) {
      words[i] = Pattern.compile("[a-zA-Z]").matcher(words[i]).find() ? words[i].substring(1)
          + words[i].charAt(0) + pay : words[i];
    }
    return String.join(" ", words);
  }

  public static String pigItV2(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      char firstLetter = words[i].charAt(0);
      words[i] = Character.isAlphabetic(firstLetter) ? words[i].substring(1) + firstLetter + "ay"
          : words[i];
    }
    return String.join(" ", words);
  }

  public static String pigItV3(String str) {
    return Arrays.stream(str.split(" "))
        .map(x -> x.matches("[a-zA-z]+") ? x.substring(1) + x.charAt(0) + "ay" : x)
        .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(pigIt("Pig latin is cool")); // igPay atinlay siay oolcay
    System.out.println(pigIt("Hello world !"));// elloHay orldway !
  }
}

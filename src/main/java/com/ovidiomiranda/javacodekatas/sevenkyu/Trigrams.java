package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.List;

public class Trigrams {

  public static String trigrams(String phrase) {
    List<String> result = new ArrayList<>();
    String newPhrase = phrase.replace(" ", "_");
    int limit;
    String newValue = "";
    for (int i = 0; i < newPhrase.length(); i++) {
      limit = i + 3;
      if (limit <= newPhrase.length()) {
        newValue = newPhrase.substring(i, limit);
        result.add(newValue);
      }
    }
    return String.join(" ", result);
  }

  public static String trigramsV2(String phrase) {
    String newPhrase = phrase.replace(" ", "_");
    String result = "";
    for (int i = 0; i < newPhrase.length() - 2; i++) {
      result += newPhrase.substring(i, i + 3) + " ";
    }
    return result.trim();
  }

  public static void main(String[] args) {
    // "the quick red" --> "the he_ e_q _qu qui uic ick ck_ k_r _re red"
    // "the quick red"
    // "the"
    // "he "
    // "e q"
    // " qu"
    System.out.println(trigrams("the quick red"));
  }
}

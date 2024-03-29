package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * <h1>Stop gninnipS My sdroW!</h1>
 *
 * <p>Write a function that takes in a string of one or more words, and returns the same string,
 * but with all words that have five or more letters reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when more
 * than one word is present.</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/5264d2b162488dc400000001/train/java">
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java</a>
 */
public class SpinWords {

  public static String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    StringJoiner result = new StringJoiner(" ");
    for (String word : words) {
      if (word.length() <= 4) {
        result.add(word);
      } else {
        result.add(new StringBuilder(word).reverse());
      }
    }
    return result.toString();
  }

  public static String spinWordsV2(String sentence) {
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > 4) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ", words);
  }

  public static String spinWordsV3(String sentence) {
    return Arrays.stream(sentence.split(" "))
        .map(x -> x.length() > 4 ? new StringBuilder(x).reverse().toString() : x)
        .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    System.out.println(spinWords("Hey fellow warriors")); // Hey wollef sroirraw
    System.out.println(spinWords("This is a test")); // This is a test
    System.out.println(spinWords("This is another test")); //This is rehtona test
  }
}

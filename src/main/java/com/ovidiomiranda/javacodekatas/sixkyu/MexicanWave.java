package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Mexican Wave.</h1>
 *
 * <p><b>Task:</b></p>
 *
 * <p>In this simple Kata your task is to create a function that turns a string into a Mexican
 * Wave. You will be passed a string and you must return that string in an array where an uppercase
 * letter is a person standing up.</p>
 *
 * <p><b>Rules:</b></p>
 * <ul>
 *  <li>1. The input string will always be lower case but maybe empty.</li>
 *  <li>2. If the character in the string is whitespace then pass over it as if it was an empty seat</li>
 * </ul>
 *
 * <p><b>Example:</b></p>
 * <p>wave("hello") =&gt; ["Hello", "hEllo", "heLlo", "helLo", "hellO"]</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/mexican-wave/train/java">
 * https://www.codewars.com/kata/mexican-wave/train/java</a>
 */
public class MexicanWave {

  /**
   * A method that turns a string into a Mexican Wave.
   *
   * @param message the message.
   * @return the mexican wave string.
   */
  public String[] wave(final String message) {
    List<String> wave = new ArrayList<>();
    String newMessage = message.toLowerCase();
    for (int i = 0; i < message.length(); i++) {
      char character = newMessage.charAt(i);
      if (Character.isAlphabetic(character)) {
        wave.add(newMessage.substring(0, i) + Character.toUpperCase(newMessage.charAt(i))
            + newMessage.substring(i + 1));
      }
    }
    return wave.toArray(new String[0]);
  }
}

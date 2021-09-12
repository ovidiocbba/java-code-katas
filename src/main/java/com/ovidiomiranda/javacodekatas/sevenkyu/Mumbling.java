package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Mumbling.</h1>
 *
 * <p>This time no story, no theory. The examples below show you how to write function
 * accumulate:</p>
 *
 * <p><b>Examples:</b></p>
 * <p>accumulate("abcd") -&gt; "A-Bb-Ccc-Dddd"</p>
 * <p>accumulate("RqaEzty") -&gt; "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"</p>
 * <p>accumulate("cwAt") -&gt; "C-Ww-Aaa-Tttt"</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/mumbling/train/java">
 * https://www.codewars.com/kata/mumbling/train/java</a>
 */
public class Mumbling {

  /**
   * Accumulate the given string.
   *
   * @param word the string.
   * @return the new accumulated string.
   */
  public String accumulate(final String word) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      list.add(stringRepeat(String.valueOf(word.charAt(i)), i));
    }
    return String.join("-", list);
  }

  /**
   * Repeat string.
   *
   * @param string the string.
   * @param repeat the number of repetitions.
   * @return the string.
   */
  private String stringRepeat(final String string, final int repeat) {
    StringBuilder newString = new StringBuilder();
    int cont = 0;
    do {
      newString.append(cont == 0 ? string.toUpperCase() : string.toLowerCase());
      cont++;
    } while (cont <= repeat);
    return newString.toString();
  }
}

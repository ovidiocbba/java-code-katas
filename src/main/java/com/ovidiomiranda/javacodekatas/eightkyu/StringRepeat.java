package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * <h1>String repeat.</h1>
 *
 * <p>Write a function called repeatStr which repeats the given string string exactly n times.</p>
 *
 * <p><b>Examples:</b></p>
 * <p>repeatStr(6, "I") return "IIIIII"</p>
 * <p>repeatStr(5, "Hello") return "HelloHelloHelloHelloHello"</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/string-repeat/train/java">https://www.codewars.com/kata/string-repeat/train/java</a>
 */
public class StringRepeat {

  /**
   * Repeat string.
   *
   * @param repeat the number of repetitions.
   * @param string the string.
   * @return the string.
   */
  public String repeatString(final int repeat, final String string) {
    StringBuilder newString = new StringBuilder();
    for (int i = 0; i < repeat; i++) {
      newString.append(string);
    }
    return newString.toString();
  }
}
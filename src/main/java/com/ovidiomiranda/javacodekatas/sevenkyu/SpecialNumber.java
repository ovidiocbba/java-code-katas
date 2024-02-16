package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIVE;

/**
 * <h1>Special Number (Special Numbers Series #5).</h1>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/5a55f04be6be383a50000187/train/java">
 * https://www.codewars.com/kata/5a55f04be6be383a50000187/train/java</a>
 */
public class SpecialNumber {

  /**
   * Special Number.
   *
   * @param number the number.
   * @return the special number.
   */
  public String specialNumber(final int number) {
    String isMagic = "NOT!!";
    char[] value = String.valueOf(number).toCharArray();
    for (char c : value) {
      if (Character.getNumericValue(c) <= FIVE.value()) {
        isMagic = "Special!!";
      } else {
        isMagic = "NOT!!";
        break;
      }
    }
    return isMagic;
  }
}

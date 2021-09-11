package com.ovidiomiranda.javacodekatas.eightkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ZERO;

/**
 * <h1>Total amount of points.</h1>
 *
 * <p>Our football team finished the championship. The result of each match look like "x:y".
 * Results of all matches are recorded in the collection.</p>
 *
 * <p><b>For example:</b></p>
 * <p>["3:1", "2:2", "0:1", ...]</p>
 *
 * <p>Write a function that takes such collection and counts the points of our team in the
 * championship Rules for counting points for each match:</p>
 * <p>if x &gt; y - 3 points</p>
 * <p>if x &lt; y - 0 point</p>
 * <p>if x = y - 1 point</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/total-amount-of-points/train/java">
 * https://www.codewars.com/kata/total-amount-of-points/train/java</a>
 */
public class TotalPoints {

  /**
   * Gets amount of points.
   *
   * @param games the result of each match.
   * @return the score.
   */
  public int points(final String[] games) {
    int score = 0;
    for (String value : games) {
      int valueX = Character.getNumericValue(value.charAt(0));
      int valueY = Character.getNumericValue(value.charAt(2));
      score += valueX > valueY ? THREE.value() : valueX < valueY ? ZERO.value() : ONE.value();
    }
    return score;
  }
}

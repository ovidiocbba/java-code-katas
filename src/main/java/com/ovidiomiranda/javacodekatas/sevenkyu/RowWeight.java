package com.ovidiomiranda.javacodekatas.sevenkyu;

/**
 * <h1>Row Weights.</h1>
 *
 * <p>Scenario: Several people are standing in a row divided into two teams. The first person goes
 * into team 1, the second goes into team 2, the third goes into team 1, and so on.</p>
 *
 * <p>Task: Given an array of positive integers (the weights of the people), return a new
 * array/tuple of two integers, where the first one is the total weight of team 1, and the second
 * one is the total weight of team 2.</p>
 *
 * <p><b>Input &gt;&gt; Output Examples</b></p>
 * <p>rowWeights([13, 27, 49])  ==&gt; return (62, 27)</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/row-weights/train/java">
 * https://www.codewars.com/kata/row-weights/train/java</a>
 */
public class RowWeight {

  /**
   * The weights of the people by teams.
   *
   * @param weights All weights.
   * @return array with the total weight of team 1 and team2.
   */
  public int[] rowWeights(final int[] weights) {
    int teamOne = 0;
    int teamTwo = 0;
    for (int i = 0; i < weights.length; i++) {
      if (i % 2 == 0) {
        teamOne += weights[i];
      } else {
        teamTwo += weights[i];
      }
    }
    return new int[]{teamOne, teamTwo};
  }
}

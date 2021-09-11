package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.stream.IntStream;

/**
 * <h1>Get the mean of an array.</h1>
 *
 * <p>It's the academic year's end, fateful moment of your school report. The averages must be
 * calculated. All the students come to you and entreat you to calculate their average for them.
 * Easy ! You just need to write a script.</p>
 *
 * <p>Return the average of the given array rounded down to its nearest integer.
 * The array will never be empty.</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java">
 * https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java</a>
 */
public class Average {

  /**
   * Gets Average of students' grades.
   *
   * @param marks the students' grades.
   * @return the average of the students' grades.
   */
  public int getAverage(final int[] marks) {
    return (int) IntStream.of(marks).average().orElse(Double.NaN);
  }
}

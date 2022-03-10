package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;

/**
 * <h1>SumCubes.</h1>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/59a8570b570190d313000037/train/java">
 * https://www.codewars.com/kata/59a8570b570190d313000037/train/java</a>
 */
public class SumCubes {

  /**
   * Sums the cubes.
   *
   * @param value the value.
   * @return the sum of the cubes.
   */
  public long sumCubes(long value) {
    long result = 0;
    while (value > 0) {
      result += (long) Math.pow(value, THREE.value());
      value--;
    }
    return result;
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The SumCubesTest class.
 */
public class SumCubesTest {

  /**
   * The SumCubesTest is declared.
   */
  private SumCubes sumCubes;

  /**
   * This method initialize the SumCubesTest class.
   */
  @Before
  public void init() {
    sumCubes = new SumCubes();
  }

  /**
   * Example tests.
   */
  @Test
  public void exampleTests() {
    assertEquals(1, sumCubes.sumCubes(1));
    assertEquals(9, sumCubes.sumCubes(2));
    assertEquals(36, sumCubes.sumCubes(3));
    assertEquals(100, sumCubes.sumCubes(4));
    assertEquals(3025, sumCubes.sumCubes(10));
    assertEquals(58155876, sumCubes.sumCubes(123));
  }
}

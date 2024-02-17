package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FOUR;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED;
import static com.ovidiomiranda.javacodekatas.utils.Constants.ONE_HUNDRED_TWENTY_THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_SIX;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO;
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
    assertEquals(ONE.value(), sumCubes.sumCubes(ONE.value()));
    assertEquals(NINE.value(), sumCubes.sumCubes(TWO.value()));
    assertEquals(THIRTY_SIX.value(), sumCubes.sumCubes(THREE.value()));
    assertEquals(ONE_HUNDRED.value(), sumCubes.sumCubes(FOUR.value()));
    assertEquals(3025, sumCubes.sumCubes(TEN.value()));
    assertEquals(58155876, sumCubes.sumCubes(ONE_HUNDRED_TWENTY_THREE.value()));
  }
}

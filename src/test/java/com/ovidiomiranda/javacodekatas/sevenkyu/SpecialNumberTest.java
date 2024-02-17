package com.ovidiomiranda.javacodekatas.sevenkyu;

import static com.ovidiomiranda.javacodekatas.utils.Constants.FIFTY_FIVE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.SEVENTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TEN;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_NINE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THIRTY_TWO;
import static com.ovidiomiranda.javacodekatas.utils.Constants.THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWENTY_THREE;
import static com.ovidiomiranda.javacodekatas.utils.Constants.TWO;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SpecialNumberTest {

  /**
   * The SpecialNumberTest is declared.
   */
  private SpecialNumber specialNumber;

  /**
   * This method initialize the SpecialNumberTest class.
   */
  @Before
  public void init() {
    specialNumber = new SpecialNumber();
  }

  @Test
  public void checkSingleDigitNumber() {
    assertEquals("Special!!", specialNumber.specialNumber(TWO.value()));
    assertEquals("Special!!", specialNumber.specialNumber(THREE.value()));
    assertEquals("NOT!!", specialNumber.specialNumber(NINE.value()));
    assertEquals("NOT!!", specialNumber.specialNumber(SEVEN.value()));
  }

  @Test
  public void twoDigitNumber() {
    assertEquals("Special!!", specialNumber.specialNumber(TWENTY_THREE.value()));
    assertEquals("NOT!!", specialNumber.specialNumber(SEVENTY_NINE.value()));
    assertEquals("Special!!", specialNumber.specialNumber(THIRTY_TWO.value()));
    assertEquals("NOT!!", specialNumber.specialNumber(THIRTY_NINE.value()));
    assertEquals("Special!!", specialNumber.specialNumber(FIFTY_FIVE.value()));
  }

  @Test
  public void largerSpecialNumber() {
    assertEquals("Special!!", specialNumber.specialNumber(513));
    assertEquals("NOT!!", specialNumber.specialNumber(709));
    assertEquals("NOT!!", specialNumber.specialNumber(538));
  }

  @Test
  public void megaSpecialNumber() {
    assertEquals("Special!!", specialNumber.specialNumber(53532));
    assertEquals("NOT!!", specialNumber.specialNumber(970569));
    assertEquals("Special!!", specialNumber.specialNumber(11350224));
  }
}

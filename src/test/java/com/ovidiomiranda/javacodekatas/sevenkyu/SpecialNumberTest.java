package com.ovidiomiranda.javacodekatas.sevenkyu;

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
  public void Check_Single_Digit_Number() {
    assertEquals("Special!!", specialNumber.specialNumber(2));
    assertEquals("Special!!", specialNumber.specialNumber(3));
    assertEquals("NOT!!", specialNumber.specialNumber(9));
    assertEquals("NOT!!", specialNumber.specialNumber(7));
  }

  @Test
  public void Two_Digit_Number() {
    assertEquals("Special!!", specialNumber.specialNumber(23));
    assertEquals("NOT!!", specialNumber.specialNumber(79));
    assertEquals("Special!!", specialNumber.specialNumber(32));
    assertEquals("NOT!!", specialNumber.specialNumber(39));
    assertEquals("Special!!", specialNumber.specialNumber(55));
  }

  @Test
  public void Larger_Special_Number() {
    assertEquals("Special!!", specialNumber.specialNumber(513));
    assertEquals("NOT!!", specialNumber.specialNumber(709));
    assertEquals("NOT!!", specialNumber.specialNumber(538));
  }

  @Test
  public void Mega_Special_Number() {
    assertEquals("Special!!", specialNumber.specialNumber(53532));
    assertEquals("NOT!!", specialNumber.specialNumber(970569));
    assertEquals("Special!!", specialNumber.specialNumber(11350224));
  }
}

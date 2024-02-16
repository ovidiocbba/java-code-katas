package com.ovidiomiranda.javacodekatas.utils;

/**
 * This class contains all the constant parameters.
 *
 * @author Ovidio Miranda
 */
public enum Constants {
  NEGATIVE_SEVENTY_EIGHT(-78),
  NEGATIVE_NINETY(-90),
  NEGATIVE_FIFTEEN(-15),
  NEGATIVE_TEN(-10),
  FIVE_NEGATIVE(-5),
  FOUR_NEGATIVE(-4),
  THREE_NEGATIVE(-3),
  TWO_NEGATIVE(-2),
  ONE_NEGATIVE(-1),
  ZERO(0),
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SEVEN(7),
  NINE(9),
  FIVE_DOUBLE(5.0),
  TEN(10),
  TWELVE(12),
  THIRTEEN(13),
  FIFTEEN(15),
  EIGHTEEN(18),
  NINETEEN(19),
  TWENTY_THREE(23),
  TWENTY_SEVEN(27),
  TWENTY_EIGHT(28),
  TWENTY_NINE(29),
  THIRTY(30),
  THIRTY_TWO(32),
  THIRTY_FOUR(34),
  THIRTY_FIVE(35),
  THIRTY_SIX(36),
  THIRTY_NINE(39),
  FORTY(40),
  FORTY_NINE(49),
  FIFTY(50),
  FIFTY_ONE(51),
  FIFTY_THREE(53),
  FIFTY_FIVE(55),
  FIFTY_EIGHT(58),
  FIFTY_NINE(59),
  SIXTY(60),
  SIXTY_ONE(61),
  SIXTY_TWO(62),
  SIXTY_FIVE(65),
  SIXTY_SEVEN(67),
  SIXTY_NINE(69),
  SEVENTY(70),
  SEVENTY_TWO(72),
  SEVENTY_FOUR(74),
  SEVENTY_FIVE(75),
  SEVENTY_NINE(79),
  EIGHTY(80),
  EIGHTY_THREE(83),
  EIGHTY_FOUR(84),
  NINETY_ONE(91),
  NINETY_TWO(92),
  NINETY_SIX(96),
  ONE_HUNDRED(100),
  ONE_HUNDRED_TWENTY(120),
  ONE_HUNDRED_TWENTY_THREE(123),
  ONE_HUNDRED_FORTY(140),
  ONE_HUNDRED_FIFTY(150),
  ONE_HUNDRED_FIFTY_ONE(151),
  ONE_HUNDRED_SIXTY_FOUR(164),
  TWO_HUNDRED_SEVEN(207),
  TWO_HUNDRED_ELEVEN(211),
  TWO_HUNDRED_THIRTY_FIVE(235),
  TWO_HUNDRED_THIRTY_SIX(236),
  TWO_HUNDRED_FIFTY(250);

  /**
   * The value.
   */
  private int integerValue;
  private double doubleValue;

  /**
   * Create a new instance with integer as parameter.
   *
   * @param value integer value.
   */
  Constants(final int value) {
    this.integerValue = value;
  }

  /**
   * Create a new instance with double as parameter.
   *
   * @param value double value.
   */
  Constants(final double value) {
    this.doubleValue = value;
  }

  /**
   * Gets integer value.
   *
   * @return actual value in enum.
   */
  public int value() {
    return integerValue;
  }

  /**
   * Gets double value.
   *
   * @return actual value in enum.
   */
  public double doubleValue() {
    return doubleValue;
  }
}

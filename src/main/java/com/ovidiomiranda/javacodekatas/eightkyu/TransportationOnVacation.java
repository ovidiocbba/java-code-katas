package com.ovidiomiranda.javacodekatas.eightkyu;

/*
https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java
 */
public class TransportationOnVacation {

  /**
   * Every day you rent the car costs $40.
   * <br>If you rent the car for 7 or more days, you get $50 off your total.
   * <br>Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
   */
  public static int rentalCarCost(int d) {
    int result = d * 40;
    if (d >= 7) {
      result -= 50;
    } else if (d >= 3) {
      result -= 20;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(rentalCarCost(1)); // 40
    System.out.println(rentalCarCost(2)); // 80
    System.out.println(rentalCarCost(3)); // 100
    System.out.println(rentalCarCost(4)); // 140
    System.out.println(rentalCarCost(5)); // 180
    System.out.println(rentalCarCost(6)); // 220
    System.out.println(rentalCarCost(7)); // 230
    System.out.println(rentalCarCost(8)); // 270
    System.out.println(rentalCarCost(9)); // 310
    System.out.println(rentalCarCost(10)); // 350
  }
}

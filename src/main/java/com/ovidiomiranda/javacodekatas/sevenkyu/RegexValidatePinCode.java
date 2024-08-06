package com.ovidiomiranda.javacodekatas.sevenkyu;

public class RegexValidatePinCode {

  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }

  public static boolean validatePinV2(String pin) {
    return pin.matches("([0-9]{4}|[0-9]{6})");
  }

  public static void main(String[] args) {

    System.out.println(validatePin("12345")); // true

    System.out.println(validatePin("1234")); // true
    System.out.println(validatePin("0000")); // true
    System.out.println(validatePin("1111")); // true
    System.out.println(validatePin("123456")); // true
    System.out.println(validatePin("098765")); // true
    System.out.println(validatePin("000000")); // true
    System.out.println(validatePin("090909")); // true
    System.out.println(validatePin("a234")); // false
    System.out.println(validatePin(".234")); // false
    System.out.println(validatePin("1")); // false
    System.out.println(validatePin("12")); // false
    System.out.println(validatePin("123")); // false
    System.out.println(validatePin("12345")); // false
    System.out.println(validatePin("1234567")); // false
    System.out.println(validatePin("-1234")); // false
    System.out.println(validatePin("1.234")); // false
    System.out.println(validatePin("00000000")); // false
  }
}

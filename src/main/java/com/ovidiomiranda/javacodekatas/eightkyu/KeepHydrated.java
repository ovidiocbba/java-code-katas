package com.ovidiomiranda.javacodekatas.eightkyu;

public class KeepHydrated {

  public static int liters(double time) {
    return (int) Math.floor(time * 0.5);
  }

  public static int litersV2(double time) {
    int value = (int) Math.floor(time);
    return (int) (value * 0.5);
  }

  public static void main(String[] args) {
    System.out.println(liters(2)); // 1
    System.out.println(liters(0.97)); // 0
    System.out.println(liters(14.64)); // 7
    System.out.println(liters(1600.20)); // 800
    System.out.println(liters(80)); // 40
  }
}

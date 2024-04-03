package com.ovidiomiranda.javacodekatas.fivekyu;

public class HumanReadableTime {

  public static String makeReadable(int seconds) {
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    int second = (seconds % 3600) % 60;
    return String.format("%02d:%02d:%02d", hours, minutes, second);
  }

  public static void main(String[] args) {
    System.out.println(makeReadable(0)); // 00:00:00
    System.out.println(makeReadable(5)); // 00:00:05
    System.out.println(makeReadable(60)); // 00:01:00
    System.out.println(makeReadable(86399)); // 23:59:59
    System.out.println(makeReadable(359999)); // 99:59:59
  }
}

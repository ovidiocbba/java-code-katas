package com.ovidiomiranda.javacodekatas.eightkyu;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Clock {

  public static int past(int h, int m, int s) {
    return (int) (TimeUnit.HOURS.toMillis(h) + TimeUnit.MINUTES.toMillis(m)
        + TimeUnit.SECONDS.toMillis(s));
  }

  public static int pastV1(int h, int m, int s) {
    int hour = 3600000;
    int minutes = 60000;
    int seconds = 1000;
    return (h * hour) + (m * minutes) + (s * seconds);
  }

  public static int pastV2(int h, int m, int s) {
    return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
  }

  public static void main(String[] args) {
    System.out.println(past(0, 1, 1)); // 61000
  }
}

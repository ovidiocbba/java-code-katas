package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSheep {

  public static String countingSheep(int num) {
    return IntStream.rangeClosed(1, num).mapToObj(x -> x + " sheep...")
        .collect(Collectors.joining());
  }

  public static String countingSheepV1(int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      result.append(i).append(" sheep...");
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(countingSheep(0));
    System.out.println(countingSheep(1)); // 1 sheep...
    System.out.println(countingSheep(2)); // 1 sheep...2 sheep...
    System.out.println(countingSheep(3)); // 1 sheep...2 sheep...3 sheep...
  }
}

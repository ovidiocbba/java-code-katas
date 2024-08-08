package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.List;

public class LargestFiveDigitNumber {

  public static int solve(final String digits) {
    int largest = 0;
    for (int i = 0; i <= digits.length() - 5; i++) {
      int number = Integer.parseInt(digits.substring(i, i + 5));
      largest = Math.max(number, largest);
    }
    return largest;
  }

  public static int solveV1(final String digits) {
    List<Integer> result = new ArrayList<>();
    int limit = digits.length();
    for (int i = 0; i <= limit; i++) {
      if (limit - i >= 5) {
        int number = Integer.parseInt(digits.substring(i, i + 5));
        result.add(number);
      }
    }
    return result.stream().mapToInt(Integer::intValue).max().orElse(0);
  }

  public static void main(String[] args) {
    System.out.println(solve("283910")); // 83910
    System.out.println(solve("1234567890")); // 67890
    System.out.println(solve("731674765")); // 74765
  }
}

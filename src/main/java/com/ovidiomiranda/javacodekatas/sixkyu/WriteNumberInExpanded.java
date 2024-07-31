package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
public class WriteNumberInExpanded {

  public static String expandedForm(int num) {
    String numStr = String.valueOf(num);
    int maxLength = numStr.length();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < maxLength; i++) {
      char firstDigit = numStr.charAt(i);
      if (firstDigit != '0') {
        int zeros = maxLength - i - 1;
        String number = firstDigit + "0".repeat(zeros);
        result.add(number);
      }
    }
    return String.join(" + ", result);
  }

  public static void main(String[] args) {
    System.out.println(expandedForm(12)); // "10 + 2"
    System.out.println(expandedForm(42)); // "40 + 2"
    System.out.println(expandedForm(70304)); // "70000 + 300 + 4"
  }
}

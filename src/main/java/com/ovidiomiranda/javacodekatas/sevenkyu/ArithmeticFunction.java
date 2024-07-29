package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ArithmeticFunction {

  private static Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();

  static {
    OPERATIONS.put("add", (a, b) -> a + b);
    OPERATIONS.put("subtract", (a, b) -> a - b);
    OPERATIONS.put("multiply", (a, b) -> a * b);
    OPERATIONS.put("divide", (a, b) -> a / b);
  }

  public static int arithmetic(int a, int b, String operator) {
    return OPERATIONS.get(operator).apply(a, b);
  }

  public static int arithmeticV1(int a, int b, String operator) {
    switch (operator) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "multiply":
        return a * b;
      case "divide":
        return a / b;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(arithmetic(1, 2, "add")); // 3
    System.out.println(arithmetic(8, 2, "subtract")); // 6
    System.out.println(arithmetic(5, 2, "multiply")); // 10
    System.out.println(arithmetic(8, 2, "divide")); // 4
  }
}

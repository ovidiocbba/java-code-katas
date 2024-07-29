package com.ovidiomiranda.javacodekatas.eightkyu;

import java.util.HashMap;
import java.util.function.IntBinaryOperator;

public class BasicMathematicalOperations {

  public static Integer basicMath(String op, int v1, int v2) {
    HashMap<String, IntBinaryOperator> ops = new HashMap<>();
    ops.put("+", Integer::sum);
    ops.put("-", (a, b) -> a - b);
    ops.put("*", (a, b) -> a * b);
    ops.put("/", (a, b) -> a / b);
    // defaultValue: (a, b) -> 0
    return ops.getOrDefault(op, (a, b) -> 0).applyAsInt(v1, v2);
  }

  public static Integer basicMathV1(String op, int v1, int v2) {
    switch (op) {
      case "+":
        return v1 + v2;
      case "-":
        return v1 - v2;
      case "*":
        return v1 * v2;
      case "/":
        return v1 / v2;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(basicMath("+", 4, 7));// 11
    System.out.println(basicMath("-", 15, 18));// -3
    System.out.println(basicMath("*", 5, 5));// 25
    System.out.println(basicMath("/", 49, 7));// 7
  }
}

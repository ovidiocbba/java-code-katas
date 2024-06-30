package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrinterErrors {

  // https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java
  // a to m
  public static String printerError(String s) {
    List<String> values = Arrays.stream("abcdefghijklm".split("")).collect(Collectors.toList());
    int count = 0;
    for (String value : s.split("")) {
      if (!values.contains(value)) {
        count++;
      }
    }
    return count + "/" + s.length();
  }

  public static String printerErrorV2(String s) {
    String errors = s.replaceAll("[a-m]", "");
    return errors.length() + "/" + s.length();
  }

  public static void main(String[] args) {
    System.out.println(
        printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")); //"3/56"
  }
}

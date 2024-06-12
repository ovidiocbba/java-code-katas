package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
public class BinaryArrayToNumber {

  public static int convertBinaryArrayToInt(List<Integer> binary) {
    String binaryString = binary.stream().map(Object::toString).collect(Collectors.joining(""));
    return Integer.parseInt(binaryString, 2);
  }

  public static void main(String[] args) {
    System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1)))); // 1
    System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1)))); // 15
  }

}

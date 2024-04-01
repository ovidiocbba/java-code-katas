package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {

  public static double findUniq(double[] arr) {
    double[] newArray = Arrays.stream(arr).sorted().distinct().toArray();
    Map<Double, Integer> map = new HashMap<>();
    double result = 0;
    for (double value : newArray) {
      int count = (int) Arrays.stream(arr).filter(x -> x == value).count();
      map.put(value, count);
    }
    for (Map.Entry<Double, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        result = entry.getKey();
        break;
      }
    }
    return result;
  }


  public static void main(String[] args) {
    //System.out.println("Hello World");
    System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); // => 2
    System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0})); // => 0.55
  }
}

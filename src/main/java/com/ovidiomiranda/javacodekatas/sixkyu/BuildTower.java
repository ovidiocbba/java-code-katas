package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
// 6 -> 1, 3, 5, 7, 9, 11.
// max = 11
//"     *     " 11 / 2 = 5 + 5 = 10 -> Max 11 - 10 = 1 un "1".
//"    ***    " 9 / 2 = 4 + 4 = 8 ->  Max 11 - 9 = "3".
// 3 - 1 , 3, 5 (Impares)
public class BuildTower {
  public static String[] towerBuilder(int nFloors) {
    String[] result = new String[nFloors];
    int width = nFloors * 2 - 1;

    for (int i = 0; i < nFloors; i++) {
      int stars = i * 2 + 1;
      int spaces = (width - stars) / 2;
      result[i] = repeat(" ", spaces) + repeat("*", stars) + repeat(" ", spaces);
    }

    return result;
  }

  public static String repeat(String s, int times) {
    return new String(new char[times]).replace("\0", s);
  }

//  public static String[] towerBuilder(int nFloors) {
//    int oddNumber = 1;
//    int count = 1;
//    List<Integer> oddNumbers = new ArrayList<>();
//    oddNumbers.add(oddNumber);
//    while (count != nFloors) {
//      oddNumber = oddNumber + 2;
//      oddNumbers.add(oddNumber);
//      count++;
//    }
//
//    String[] result = new String[oddNumbers.size()];
//    int counter = 0;
//    for (int i = oddNumbers.size() - 1; i >= 0; i--) {
//      int spaces = oddNumbers.get(i) / 2;
//      int x = oddNumber - (spaces + spaces);
//      String spacesRepeat = repeat(" ", spaces);
//      result[counter] = spacesRepeat + repeat("*", x) + spacesRepeat;
//      counter++;
//    }
//    return result;
//  }
//
//  public static String repeat(String s, int times) {
//    return new String(new char[times]).replace("\0", s);
//  }
  // Execution Timed Out (16000 ms)
//  public static String[] towerBuilder(int nFloors) {
//    int oddNumber = 1;
//    int count = 1;
//    List<Integer> oddNumbers = new ArrayList<>();
//    oddNumbers.add(oddNumber);
//    while (count != nFloors) {
//      oddNumber = oddNumber + 2;
//      oddNumbers.add(oddNumber);
//      count++;
//    }
//
//    String[] result = new String[oddNumbers.size()];
//    int counter = 0;
//    for (int i = oddNumbers.size() - 1; i >= 0; i--) {
//      int spaces = oddNumbers.get(i) / 2;
//      int x = oddNumber - (spaces + spaces);
//      String spacesRepeat = repeat(" ", spaces);
//      result[counter] = String.format("%s%s%s", spacesRepeat, repeat("*", x), spacesRepeat);
//      counter++;
//    }
//    return result;
//  }
//
//  public static String repeat(String s, int times) {
//    return new String(new char[times]).replace("\0", s);
//  }

  //Execution Timed Out (16000 ms)
//  public static String[] towerBuilder(int nFloors) {
//    int oddNumber = 1;
//    int count = 1;
//    List<Integer> oddNumbers = new ArrayList<>();
//    oddNumbers.add(oddNumber);
//    while (count != nFloors) {
//      oddNumber = oddNumber + 2;
//      oddNumbers.add(oddNumber);
//      count++;
//    }
//    List<String> result = new ArrayList<>();
//    for (int i = oddNumbers.size() - 1; i >= 0; i--) {
//      int spaces = oddNumbers.get(i) / 2;
//      int x = oddNumber - (spaces + spaces);
//      result.add(String.format("%s%s%s", " ".repeat(spaces), "*".repeat(x), " ".repeat(spaces)));
//    }
//    return result.toArray(String[]::new);
//  }

  public static void main(String[] args) {
    //System.out.println(towerBuilder(1)); // "*" // 1
    //System.out.println(towerBuilder(2)); // " * ", "***" // 3
    //System.out.println(towerBuilder(3)); // "  *  ", " *** ", "*****" // 5
    //System.out.println(towerBuilder(6)); // "  *  ", " *** ", "*****" // 5
    String[] result = towerBuilder(6);
    for (String s : result) {
      System.out.println(s);
    }
  }
}

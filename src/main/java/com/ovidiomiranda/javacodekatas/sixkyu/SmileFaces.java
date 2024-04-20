package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {

  // https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
  public static int countSmileys(List<String> arr) {
    List<String> eyes = new ArrayList<>();
    eyes.add(":");
    eyes.add(";");
    List<String> noses = new ArrayList<>();
    noses.add("-");
    noses.add("~");
    List<String> smiles = new ArrayList<>();
    smiles.add(")");
    smiles.add("D");
    int count = 0;
    for (String head : arr) {
      if (head.length() == 2) {
        String eye = String.valueOf(head.charAt(0));
        String smile = String.valueOf(head.charAt(1));
        if (eyes.contains(eye) && smiles.contains(smile)) {
          count++;
        }
      } else {
        if (head.length() == 3) {
          String eye = String.valueOf(head.charAt(0));
          String nose = String.valueOf(head.charAt(1));
          String smile = String.valueOf(head.charAt(2));
          if (eyes.contains(eye) && noses.contains(nose) && smiles.contains(smile)) {
            count++;
          }
        }
      }
    }
    return count;
  }

  public static int countSmileysV2(List<String> arr) {
    return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
  }

  public static void main(String[] args) {
    List<String> a = new ArrayList<>();
    a.add(":)");
    a.add(":)");
    a.add("x-]");
    a.add(":ox");
    a.add(";-(");
    a.add(";-)"); // 1
    a.add(";~(");
    a.add(":~D"); // 2
    System.out.println(countSmileysV2(a));//4

    List<String> b = new ArrayList<>();
    b.add(":)");
    b.add(";(");
    b.add(";}");
    b.add(":-D");
    System.out.println(countSmileysV2(b));       // should return 2;
//    countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
//    countSmileys([';]', ':[', ';*', ':$', ';-D'])
  }
}

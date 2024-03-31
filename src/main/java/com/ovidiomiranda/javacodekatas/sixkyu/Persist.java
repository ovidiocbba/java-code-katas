package com.ovidiomiranda.javacodekatas.sixkyu;

public class Persist {

  public static int persistence(long n) {
    int count = 0;
    String result = String.valueOf(n);
    if (result.length() == 1) {
      return 0;
    }
    do {
      result = String.valueOf(getSum(Long.parseLong(result)));
      count++;
    } while (result.length() != 1);
    return count;
  }

  public static int getSum(long n) {
    String[] values = String.valueOf(n).split("");
    int sum = Integer.parseInt(values[0]);
    for (int i = 1; i < values.length; i++) {
      sum *= Integer.parseInt(values[i]);
    }
    return sum;
  }


  public static void main(String[] args) {
//    39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//    999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//    4 --> 0 (because 4 is already a one-digit number)
    System.out.println(persistence(39));
    System.out.println(persistence(999));
    System.out.println(persistence(4));
  }
}

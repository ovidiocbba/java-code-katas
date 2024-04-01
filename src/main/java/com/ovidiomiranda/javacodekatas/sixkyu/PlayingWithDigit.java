package com.ovidiomiranda.javacodekatas.sixkyu;

public class PlayingWithDigit {

    public static long digPow(int n, int p) {
    String[] digits = String.valueOf(n).split("");
    int sum = 0;
    int exp = p;
    for (String digit : digits) {
      sum += (int) Math.pow(Integer.parseInt(digit), exp);
      exp++;
    }
    int result;
    int count = 1;
    boolean band = true;
    do {
      result = n * count;
      if (sum == result) {
        band = false;
      } else {
        count++;
        if (count == 1000) {
          return -1;
        }
      }
    } while (band);
    return count;
  }
  public static long digPowV2(int n, int p) {
    String[] digits = String.valueOf(n).split("");
    int result = 0;
    int exp = p;
    for (String digit : digits) {
      result += (int) Math.pow(Integer.parseInt(digit), exp);
      exp++;
    }
    return result % n == 0 ? result / n : -1;
  }

  public static void main(String[] args) {
    // 89 8^1 + 9^2 = 89 * 1
    // 6^2 + 9^3 + 5^4= 1390
    System.out.println(digPow(89, 1)); // 1
    System.out.println(digPow(695, 2)); // 1390 // 2
    System.out.println(digPow(46288, 3)); // 2360688  // 51
  }
}

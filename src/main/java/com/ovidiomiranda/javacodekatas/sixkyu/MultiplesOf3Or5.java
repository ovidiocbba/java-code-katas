package com.ovidiomiranda.javacodekatas.sixkyu;

import java.util.stream.IntStream;

/**
 * <h1>Multiples of 3 or 5.</h1>
 *
 * <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and
 * 9. The sum of these multiples is 23.</p>
 * <p>Finish the solution so that it returns the sum of all
 * the multiples of 3 or 5 below the number passed in.</p>
 * <p>Note: If the number is a multiple of both 3 and 5, only count it once. Courtesy of
 * projecteuler.net (Problem 1).</p>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">
 * https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java</a>
 */
public class MultiplesOf3Or5 {

  public static int solution(int number) {
    int result = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        result += i;
      }
    }
    return result;
  }

  public static int solutionV2(int number) {
    return IntStream.range(0, number).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
  }

  public static void main(String[] args) {
    System.out.println(solution(10)); //23
  }
}

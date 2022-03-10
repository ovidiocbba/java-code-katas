package com.ovidiomiranda.javacodekatas.sevenkyu;

/**
 * <h1>Square Every Digit.</h1>
 *
 * @author Ovidio Miranda
 * @see <a href="https://www.codewars.com/kata/546e2562b03326a88e000020/train/java">
 * https://www.codewars.com/kata/546e2562b03326a88e000020/train/java</a>
 */
public class SquareEveryDigit {

    public int squareDigits(int n) {
        StringBuilder concatenate = new StringBuilder();
        String value = Integer.toString(n);
        for (int i = 0; i < value.length(); i++) {
            int result = (int) Math.pow(Character.getNumericValue(value.charAt(i)), 2);
            concatenate.append(result);
        }
        return Integer.parseInt(concatenate.toString());
    }
}

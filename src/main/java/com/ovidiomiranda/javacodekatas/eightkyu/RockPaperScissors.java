package com.ovidiomiranda.javacodekatas.eightkyu;

/**
 * https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
 * <br>"scissors", "paper" --> "Player 1 won!"
 * <br>"scissors", "rock" --> "Player 2 won!"
 * <br>"paper", "paper" --> "Draw!"
 */
public class RockPaperScissors {


  public static String rps(String p1, String p2) {
    if (p1.equals("rock") && p2.equals("scissors")) {
      return "Player 1 won!";
    } else if (p1.equals("scissors") && p2.equals("paper")) {
      return "Player 1 won!";
    } else if (p1.equals("paper") && p2.equals("rock")) {
      return "Player 1 won!";
    }
    if (p1.equals("scissors") && p2.equals("rock")) {
      return "Player 2 won!";
    } else if (p1.equals("paper") && p2.equals("scissors")) {
      return "Player 2 won!";
    } else if (p1.equals("rock") && p2.equals("paper")) {
      return "Player 2 won!";
    }
    if (p1.equals(p2)) {
      return "Draw!";
    } else {
      return "";
    }
  }

  public static void main(String[] args) {
    System.out.println(rps("rock", "scissors")); // "Player 1 won!"
    System.out.println(rps("scissors", "paper")); // Player 1 won!
    System.out.println(rps("paper", "rock")); // Player 1 won! //
    System.out.println(rps("scissors", "rock")); // Player 2 won!
    System.out.println(rps("paper", "scissors")); // Player 2 won!
    System.out.println(rps("rock", "paper")); // Player 2 won! //
    System.out.println(rps("scissors", "scissors")); // Draw!
    System.out.println(rps("paper", "paper")); // Draw!
    System.out.println(rps("rock", "rock")); // Draw!
  }
}

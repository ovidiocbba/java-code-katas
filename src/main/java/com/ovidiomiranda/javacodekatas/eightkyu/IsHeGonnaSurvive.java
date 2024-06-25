package com.ovidiomiranda.javacodekatas.eightkyu;

// https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/java
public class IsHeGonnaSurvive {

  /*
  A hero is on his way to the castle to complete his mission.
  However, he's been told that the castle is surrounded with a couple of powerful dragons!
  each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry..
  Assuming he's gonna grab a specific given number of bullets and move forward to fight another
  specific given number of dragons, will he survive?
  Return true if yes, false otherwise :)
   */
  // each dragon takes 2 bullets to be defeated
  // our hero has no idea how many bullets he should carry
  // he's gonna grab a specific given number of bullets
//  public static boolean hero(int bullets, int dragons) {
//    int compareValue = BigInteger.valueOf(bullets).compareTo(BigInteger.valueOf(2L * dragons));
//    return compareValue >= 0;
//  }
  public static boolean hero(int bullets, int dragons) {
    return bullets >= (long) dragons * 2;
  }


  public static void main(String[] args) {
    System.out.println(hero(10, 5));//, "With 10 bullets and 5 dragons"); // true
    System.out.println(hero(100, 40)); //"With 100 bullets and 40 dragons"); // true

    System.out.println(hero(4, 5)); //With 4 bullets and 5 dragons"); // false
    System.out.println(hero(1500, 751)); //With 1500 bullets and 751 dragons"); // false
    System.out.println(hero(0, 1)); //With 0 bullets and 1 dragon"); // false
    System.out.println(hero(7, 4)); //With 7 bullets and 4 dragons"); // false
    System.out.println(hero(1572779287,
        1509183805)); //With 1.572.779.287 bullets and 1.509.183.805 dragons"); // false
  }
}

package com.ovidiomiranda.javacodekatas.sevenkyu;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

  public static int countPassengers(ArrayList<int[]> stops) {
    int result = 0;
    for (int[] stop : stops) {
      result += stop[0] - stop[1];
    }
    return result;
  }

  public static int countPassengersV2(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
  }

  public static void main(String[] args) {
    ArrayList<int[]> list = new ArrayList<>();
    list.add(new int[]{10, 0}); // 10 - 0 =10
    list.add(new int[]{3, 5});  // 3 - 5 = -2
    list.add(new int[]{2, 5});  // 2 - 5 = -3
    System.out.println(countPassengers(list)); // 5
  }
}

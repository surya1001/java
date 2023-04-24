package general;

import java.util.*;

public class ViralAdvertising {
  public static void main(String[] args) {
    System.out.println(viralAdvertising(36));
  }

  public static int viralAdvertising(int n) {
    // Write your code here
    int totalLikes = 0;
    int i = 1;
    int totalPeople = 5;
    while (i <= n) {
      totalLikes = totalLikes + (totalPeople / 2);
      totalPeople = (totalPeople / 2) * 3;
      i++;
    }
    return totalLikes;

  }
}

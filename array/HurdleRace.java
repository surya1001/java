import java.util.*;

public class HurdleRace {
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<Integer>();
    ar.add(1);
    ar.add(6);
    ar.add(3);
    ar.add(5);
    ar.add(2);
    int k = 4;

    System.out.println("Hurl: " + hurdleRace(k, ar));

  }

  public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here

    int tallestTower = 0;
    for (int i = 0; i < height.size(); i++) {
      if (tallestTower < height.get(i)) {
        tallestTower = height.get(i);
      }
    }

    System.out.println("tall" + tallestTower);
    if (tallestTower > k) {
      System.out.println("Andar q nahi aya: " + tallestTower + " " + k);
      return tallestTower - k;
    }
    return 0;

  }
}

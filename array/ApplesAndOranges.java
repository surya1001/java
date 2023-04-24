import java.util.*;

public class ApplesAndOranges {
  public static void main(String[] args) {
    int s = 7, t = 11, a = 5, b = 15;
    List<Integer> apples = new ArrayList<Integer>();
    List<Integer> oranges = new ArrayList<Integer>();
    // Write your code here5
    apples.add(-2);
    apples.add(2);
    apples.add(1);

    oranges.add(5);
    oranges.add(-6);

    for (int i = 0; i < apples.size(); i++) {
      apples.set(i, a + apples.get(i));
    }

    for (int j = 0; j < oranges.size(); j++) {
      oranges.set(j, b + oranges.get(j));
    }

    System.out.println(apples + " " + oranges);

    int aTotal = 0, bTotal = 0;
    for (int i = 0; i < apples.size(); i++) {
      if (apples.get(i) >= s && apples.get(i) <= t) {
        aTotal++;
      }
    }

    for (int j = 0; j < oranges.size(); j++) {
      if (oranges.get(j) >= s && oranges.get(j) <= t) {
        bTotal++;
      }
    }

    System.out.println(aTotal);
    System.out.println(bTotal);
  }

}
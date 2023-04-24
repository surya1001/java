package general;

import java.util.*;

public class DrawingBook {
  public static void main(String[] args) {
    int n = 6;
    int p = 5;

    // int half = n / 2 + 1;
    // if (half > p) {
    // System.out.println("Idhar q aya bhai " + p / 2);
    // } else {
    // System.out.println("Bada h bhai: " + ((n - p) / 2));
    // }

    // METHOD 2
    int step = 0;
    Map<Integer, Integer> hmap = new HashMap<>();
    for (int i = 0; i <= n; i++) {
      hmap.put(i, step);
      i++;
      if (i <= n)
        hmap.put(i, step); // add i 2 times in hmap with same step
      step++;
    }
    System.out.println(Math.min(hmap.get(p), hmap.get(n) - hmap.get(p)));

  }
}

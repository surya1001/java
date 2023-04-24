import java.util.*;

public class ScoreCard {
  public static void main(String[] args) {
    int minCount = 0;
    int maxCount = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    List<Integer> scores = new ArrayList<>();
    scores.add(10);
    scores.add(5);
    scores.add(20);
    scores.add(20);
    scores.add(4);
    scores.add(5);
    scores.add(2);
    scores.add(25);
    scores.add(1);

    for (int i = 0; i < scores.size(); i++) {
      System.out.println("dincfndvkjnfd " + min + " " + max + " " + scores.get(i));
      if (scores.get(i) < min) {
        minCount++;
        System.out.println(scores.get(i) + " " + i + " " + minCount);
        min = scores.get(i);
      }
      if (scores.get(i) > max) {
        maxCount++;
        System.out.println(scores.get(i) + " " + i + " " + maxCount);
        max = scores.get(i);
      }
    }

    List<Integer> result = new ArrayList<>();
    result.add(maxCount);
    result.add(minCount);

    System.out.println(result);
  }
}

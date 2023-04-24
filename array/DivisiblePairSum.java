import java.util.*;

public class DivisiblePairSum {
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<Integer>();
    ar.add(1);
    ar.add(3);
    ar.add(2);
    ar.add(6);
    ar.add(1);
    ar.add(2);
    int k = 3;
    int count = 0;
    for (int i = 0; i < ar.size() - 1; i++) {
      for (int j = i + 1; j < ar.size(); j++) {
        if ((ar.get(i) + ar.get(j)) % k == 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
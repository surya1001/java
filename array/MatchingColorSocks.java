import java.util.*;

public class MatchingColorSocks {
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<Integer>();
    ar.add(10);
    ar.add(20);
    ar.add(20);
    ar.add(10);
    ar.add(10);
    ar.add(30);
    ar.add(50);
    ar.add(10);
    ar.add(20);

    Map<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
    for (int i = 0; i < ar.size(); i++) {
      if (tMap.containsKey(ar.get(i))) {
        int val = tMap.get(ar.get(i));
        tMap.put(ar.get(i), val + 1);
      } else {
        tMap.put(ar.get(i), 1);
      }
    }

    int matchColor = 0;
    for (Integer key : tMap.keySet()) {
      int val = tMap.get(key) / 2;
      if (val > 0) {
        matchColor = matchColor + (val);
      }
    }

    System.out.println("matchColor" + matchColor);
  }
}

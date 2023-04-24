import java.util.*;

public class MissingNumbers {
  public static void main(String[] args) {

    List<Integer> arr = new ArrayList<Integer>();
    List<Integer> brr = new ArrayList<Integer>();
    arr.add(203);
    arr.add(204);
    arr.add(205);
    arr.add(206);
    arr.add(207);
    arr.add(208);
    arr.add(203);
    arr.add(204);
    arr.add(205);
    arr.add(206);

    brr.add(203);
    brr.add(204);
    brr.add(204);
    brr.add(204);
    brr.add(205);
    brr.add(206);
    brr.add(207);
    brr.add(205);
    brr.add(208);
    brr.add(203);
    brr.add(206);
    brr.add(205);
    brr.add(206);
    brr.add(204);
    brr.add(209);

    System.out.println(missingNumbers(arr, brr));
  }

  public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    Map<Integer, Integer> aMap = new TreeMap<Integer, Integer>();
    Map<Integer, Integer> bMap = new TreeMap<Integer, Integer>();

    for (int i = 0; i < arr.size(); i++) {
      if (aMap.containsKey(arr.get(i))) {
        aMap.put(arr.get(i), aMap.get(arr.get(i)) + 1);
      } else {
        aMap.put(arr.get(i), 1);
      }
    }

    for (int i = 0; i < brr.size(); i++) {
      if (bMap.containsKey(brr.get(i))) {
        bMap.put(brr.get(i), bMap.get(brr.get(i)) + 1);
      } else {
        bMap.put(brr.get(i), 1);
      }
    }

    Map<Integer, Integer> cMap = new TreeMap<Integer, Integer>();
    for (int k : bMap.keySet()) {
      int diff = 0;
      if (aMap.containsKey(k)) {
        diff = bMap.get(k) - aMap.get(k);
        System.out.println();
      } else {
        cMap.put(k, 1);
      }
      if (diff != 0) {
        cMap.put(k, diff);
      }
    }

    List<Integer> l = new ArrayList<Integer>();
    for (int k : cMap.keySet()) {
      for (int i = 0; i < cMap.get(k); i++) {
        l.add(k);
      }
    }
    return l;
  }
}

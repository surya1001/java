import java.util.*;

public class MigratoryBirds {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(4);
    arr.add(4);
    arr.add(4);
    arr.add(5);
    arr.add(3);

    // int maxFreq = 0;
    // List<Integer> freqCount = new ArrayList<>(Collections.nCopies(6, 0));
    // System.out.println(freqCount);
    // for (int i = 0; i < arr.size(); i++) {
    // freqCount.set(arr.get(i), freqCount.get(arr.get(i)) + 1);
    // }

    // System.out.println(freqCount);

    // for (int i = 0; i < freqCount.size(); i++) {
    // if (freqCount.get(i) > maxFreq) {
    // maxFreq = i;
    // }
    // }
    // System.out.println(maxFreq);

    // METHOD 2
    Map<Integer, Integer> treeMap = new TreeMap<>();
    int type = -1;
    for (int i = 0; i < arr.size(); i++) {
      if (treeMap.containsKey(arr.get(i))) {
        int val = treeMap.get(arr.get(i));
        treeMap.put(arr.get(i), val + 1);
      } else {
        treeMap.put(arr.get(i), 1);
      }
    }
    int maxCount = Integer.MIN_VALUE;
    for (Integer key : treeMap.keySet()) {
      if (treeMap.get(key) > maxCount) {
        maxCount = treeMap.get(key);
        type = key;
      }
    }
    System.out.println("maxCount: " + type);
  }
}

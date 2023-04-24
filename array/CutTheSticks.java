import java.util.*;

public class CutTheSticks {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(5);
    arr.add(4);
    arr.add(4);
    arr.add(2);
    arr.add(2);
    arr.add(8);
    System.out.println(cutTheSticks(arr));
  }

  public static int findMinimum(List<Integer> arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) < min) {
        min = arr.get(i);
      }
    }
    return min;
  }

  public static List<Integer> newArr(List<Integer> arr, int cutSize) {
    List<Integer> newArr = new ArrayList<>();
    for (int i = 0; i < arr.size(); i++) {
      int val = arr.get(i) - cutSize;
      if (val > 0)
        newArr.add(val);
    }
    return newArr;
  }

  public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    List<Integer> finalArr = new ArrayList<>();
    finalArr.add(arr.size());

    while (arr.size() > 0) {
      int min = findMinimum(arr);
      List<Integer> newArr = newArr(arr, min);
      int size = newArr.size();
      if (size > 0)
        finalArr.add(size);
      arr = newArr;
    }
    return finalArr;

  }
}

import java.util.*;

public class CircularArray {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(4);
    arr.add(3);
    arr.add(5);
    arr.add(1);
    arr.add(2);
    arr.add(6);

    List<Integer> queries = new ArrayList<Integer>();
    queries.add(1);
    queries.add(2);
    queries.add(5);

    System.out.println(circularArrayRotation(arr, 18, queries));
  }

  public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    System.out.println("org array " + a);

    List<Integer> newArray = new ArrayList<>();

    int move = a.size() - (k % a.size());
    if (move == a.size())
      move = 0;
    System.out.println("move" + move);
    for (int i = 0; i < a.size(); i++) {
      newArray.add(a.get(move++));
      if (move > a.size() - 1) {
        move = 0;
      }
    }

    System.out.println("new Array " + newArray);

    List<Integer> finalOutput = new ArrayList<>();
    for (int i = 0; i < queries.size(); i++) {
      finalOutput.add(newArray.get(queries.get(i)));
    }
    return finalOutput;

  }
}

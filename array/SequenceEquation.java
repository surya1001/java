import java.util.*;

public class SequenceEquation {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(4);
    arr.add(3);
    arr.add(5);
    arr.add(1);
    arr.add(2);

    System.out.println(permutationEquation(arr));

  }

  public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here

    Map<Integer, Integer> permutation = new HashMap<Integer, Integer>();
    for (int i = 0; i < p.size(); i++) {
      permutation.put(p.get(i), i + 1);
    }

    List<Integer> permutationArr = new ArrayList<Integer>();
    for (int i = 1; i <= p.size(); i++) {
      permutationArr.add(permutation.get(permutation.get(i)));
    }
    return permutationArr;

  }
}

import java.util.*;

public class JimAndOrders {
  public static void main(String[] args) {
    Integer arr1[] = { 1, 1 };
    Integer arr2[] = { 1, 1 };
    Integer arr3[] = { 5, 6 };
    Integer arr4[] = { 3, 1 };
    Integer arr5[] = { 4, 3 };
    List<Integer> arrr1 = Arrays.asList(arr1);
    List<Integer> arrr2 = Arrays.asList(arr2);
    List<Integer> arrr3 = Arrays.asList(arr3);
    List<Integer> arrr4 = Arrays.asList(arr4);
    List<Integer> arrr5 = Arrays.asList(arr5);
    List<List<Integer>> arrrr1 = new ArrayList<>();
    arrrr1.add(arrr1);
    arrrr1.add(arrr2);
    arrrr1.add(arrr3);
    arrrr1.add(arrr4);
    arrrr1.add(arrr5);

    System.out.println(arrrr1);

    jimOrders(arrrr1);
  }

  public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
    List<Integer> finalOrder = new ArrayList<>();
    for (int i = 0; i < orders.size(); i++) {
      finalOrder.add(orders.get(i).get(0) + orders.get(i).get(1));
    }

    Map<Integer, Set<Integer>> tmap = new TreeMap<>();
    for (int i = 0; i < finalOrder.size(); i++) {
      if (tmap.containsKey(finalOrder.get(i))) {
        Set<Integer> hset = tmap.get(finalOrder.get(i));
        hset.add(i);
        tmap.put(finalOrder.get(i), hset);
      } else {
        Set<Integer> hset = new HashSet<>();
        hset.add(i);
        tmap.put(finalOrder.get(i), hset);
      }
    }

    System.out.println(tmap);
    List<Integer> result = new ArrayList<>();
    for (Integer k : tmap.keySet()) {
      for (Integer val : tmap.get(k)) {
        result.add(val);
      }
    }
    System.out.println(result);
    return result;
  }
}

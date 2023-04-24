import java.util.*;

public class MarkAndToys {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(12);
    list.add(5);
    list.add(111);
    list.add(200);
    list.add(10);
    System.out.println(maximumToys(list, 80000000));
  }

  public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
    int sum = 0;
    int count = 0;
    Collections.sort(prices);
    for (int price : prices) {
      sum = sum + price;
      if (sum <= k)
        count++;
      else
        break;
    }
    return count;
  }
}

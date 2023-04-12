
import java.util.*;

public class DiagonalDifference {
  public static void main(String[] args) {
    List<List<Integer>> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      ArrayList<Integer> intList = new ArrayList<>();
      for (int k = 0; k < 3; k++) {
        intList.add(sc.nextInt());
      }
      arr.add(intList);
    }
    for (int row = 0; row < arr.size(); row++) {
      for (int col = 0; col < arr.get(0).size(); col++) {
        System.out.print(arr.get(row).get(col) + ",");
      }
      System.out.println("");
    }
    sc.close();

    System.out.println(arr + " " + arr.size());

    int asum = 0, bsum = 0;
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        if (i == j) {
          System.out.println("upper wala i " + i + " " + j + " " + arr.get(i).get(j));
          asum += arr.get(i).get(j);
        }
        if (i + j == arr.size() - 1) {
          System.out.println("niche wala i " + i + " " + j + " " + arr.get(i).get(j));
          bsum += arr.get(i).get(j);
        }
      }
    }

    System.out.println(Math.abs(asum - bsum));
  }

}

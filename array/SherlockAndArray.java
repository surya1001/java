import java.util.*;

public class SherlockAndArray {
  public static void main(String[] args) {
    Integer arr[] = { 5, 2, 1, 8 };
    List<Integer> numbers = Arrays.asList(arr);

    System.out.println(balancedSums(numbers));
  }

  public static String balancedSums(List<Integer> arr) {
    // Write your code here
    for (int i = 0; i < arr.size(); i++) {
      int suma = 0;
      int sumb = 0;
      for (int j = 0; j < i; j++) {
        suma = suma + arr.get(j);
      }

      for (int j = i + 1; j < arr.size(); j++) {
        sumb = sumb + arr.get(j);
      }

      if (suma == sumb) {
        return "YES";
      }
    }
    return "NO";

  }
}
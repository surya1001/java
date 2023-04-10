import java.util.List;

public class Reverse {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 2, 4 };

    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    for (int i = 0; i < a.size() / 2; i++) {
      int temp = a.get(i);
    }
    return a;
  }
}

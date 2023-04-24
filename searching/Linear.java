package searching;

public class Linear {
  public static void main(String[] args) {
    int arr[] = { 18, 2, 9, 14, 77, 50 };
    int k = 20;
    System.out.println(LinearSearchArray(arr, k));

    System.out.println(LinearSearchString("hello", 'k'));
  }

  public static int LinearSearchArray(int[] arr, int k) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == k) {
        return i;
      }
    }
    return -1;
  }

  public static boolean LinearSearchString(String s, char target) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }
}

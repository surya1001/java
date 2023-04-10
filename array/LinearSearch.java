public class LinearSearch {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
    int x = 00;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.println("Found at position " + i);
      }
    }
    System.out.println("Not found");
  }

}

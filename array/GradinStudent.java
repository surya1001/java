public class GradinStudent {
  public static void main(String[] args) {
    int arr[] = { 84, 29, 57 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 38) {
        System.out.println(arr[i]);
        continue;
      } else {
        int rem = arr[i] % 5;
        int finalRem = 5 - rem;
        if (finalRem < 3) {
          System.out.println(arr[i] + finalRem);
        } else {
          System.out.println(arr[i]);
        }
      }
    }
  }
}

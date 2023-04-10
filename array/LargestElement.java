import java.util.Scanner;

class LargestElement {
  public static int[] takeInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of array");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter elemenet at position " + i);
      arr[i] = sc.nextInt();
    }

    return arr;
  }

  public static void main(String[] args) {
    int max = 0;

    int arr[] = takeInput();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("LargestElement: " + max);
  }
}
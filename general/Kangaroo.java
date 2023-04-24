package general;

public class Kangaroo {
  public static void main(String[] args) {
    int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
    // Write your code here
    int aTotal = x1;
    int bTotal = x2;
    int i = 1;

    while (aTotal < bTotal) {
      aTotal = aTotal + v1;
      bTotal = bTotal + v2;
      System.out.println(i + " " + aTotal + " " + bTotal);
      if (aTotal == bTotal) {
        System.out.println("Yes");
      }
      i++;
    }
    System.out.println("No");

  }
}

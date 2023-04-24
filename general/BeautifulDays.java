package general;

public class BeautifulDays {
  public static void main(String[] args) {
    System.out.println(beautifulDays(20, 23, 6));
  }

  public static int reverse(int n) {
    int res = 0;
    while (n > 0) {
      res = (res * 10) + (n % 10);
      n = n / 10;
    }
    return res;
  }

  public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int beautifulDays = 0;
    for (int a = i; a <= j; a++) {
      float val = (float) (a - reverse(a)) / k;
      System.out.println("reverse: " + a + " " + reverse(a) + " " + (a - reverse(a)) + " " + val);
      System.out.println("val: " + val);
      if ((val % 1) == 0) {
        beautifulDays++;
      }
    }
    return beautifulDays;

  }
}

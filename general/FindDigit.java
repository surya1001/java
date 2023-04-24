package general;

public class FindDigit {
  public static void main(String[] args) {
    System.out.println(findDigits(114108089));
  }

  public static int findDigits(int n) {
    // Write your code here
    int newn = n, count = 0;
    while (newn > 0) {
      int rem = newn % 10;
      System.out.println("dklnnclkv " + n + " " + rem);
      if (rem != 0 && newn % rem == 0) {
        count++;
      }
      newn = newn / 10;
    }
    return count;
  }
}

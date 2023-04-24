package general;

public class Pallindrome {
  public static void main(String[] args) {
    int n = 4041;
    int oldn = n;
    int reverse = 0;
    while (n > 0) {
      int rem = n % 10;
      reverse = reverse * 10 + rem;
      n = n / 10;
    }
    System.out.println(reverse);
    if (reverse == oldn) {
      System.out.println("Pallindrome hai");
    } else {
      System.out.println("Pallindrome nahi hai");
    }
  }
}

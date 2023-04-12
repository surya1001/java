
public class PlusMinus {
  public static void main(String[] args) {
    int arr[] = { -4, 3, -9, 0, 4, 1 };
    double pos = 0, neg = 0, zero = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        pos++;
      } else if (arr[i] == 0) {
        zero++;
      } else {
        neg++;
      }
    }

    double result = 7 / 5;

    System.out.println(pos + " " + pos / 5);
    System.out.println(neg + " " + neg / 5);
    System.out.println(zero + " " + zero / 5);
  }
}
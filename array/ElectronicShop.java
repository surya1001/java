public class ElectronicShop {
  public static void main(String[] args) {
  }

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int totalSum = 0;

    for (int i = 0; i < keyboards.length; i++) {
      int sum = 0;
      for (int j = 0; j < drives.length; j++) {
        sum = keyboards[i] + drives[j];
        if (sum < b && sum > totalSum) {
          totalSum = sum;
        }
      }
    }
    if (totalSum > 0) {
      return totalSum;
    } else {
      return -1;
    }

  }
}

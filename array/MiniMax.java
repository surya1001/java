public class MiniMax {
  public static void main(String[] args) {
    int arr[] = { 942381765, 627450398, 954173620, 583762094, 236817490 };
    // long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, skip = arr.length - 1;

    // for (int i = 0; i < arr.length; i++) {
    // long sum = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (j == skip) {
    // skip--;
    // continue;
    // }
    // sum += arr[j];
    // }
    // if (sum > max)
    // max = sum;
    // if (sum < min)
    // min = sum;
    // }

    long sum = 0;
    int minn = 1000000001, maxx = 0;

    for (int i = 0; i < 5; i++) {
      sum += arr[i];
      if (arr[i] < minn)
        minn = arr[i];
      if (arr[i] > maxx)
        maxx = arr[i];
    }
    long minSum = sum - maxx, maxSum = sum - minn;
    System.out.println(minSum + " " + maxSum);
  }
}

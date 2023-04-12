public class HighestCandleCount {
  public static void main(String[] args) {
    int candles[] = { 18, 90, 90, 13, 90, 75, 90, 8, 90, 43 };
    int hCan = Integer.MIN_VALUE, hCount = 0;
    for (int i = 0; i < candles.length; i++) {
      if (hCan < candles[i]) {
        hCan = candles[i];
        hCount = 0;
      }
      if (hCan == candles[i]) {
        System.out.println("i" + i);
        hCount++;
      }
    }
    System.out.println(hCount);

  }
}

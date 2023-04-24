import java.util.*;

public class ClosestNumber {
  public static void main(String[] args) {
    Integer arr[] = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };
    List<Integer> numbers = Arrays.asList(arr);

    numbers.sort(Comparator.naturalOrder());

    int minDiff = Integer.MAX_VALUE;
    List<Integer> finalOutput = new ArrayList<>();
    for (int i = 0; i < numbers.size() - 1; i++) {
      if (numbers.get(i + 1) - numbers.get(i) < minDiff) {
        minDiff = numbers.get(i + 1) - numbers.get(i);
      }
    }

    for (int i = 0; i < numbers.size() - 1; i++) {
      if (numbers.get(i + 1) - numbers.get(i) == minDiff) {
        finalOutput.add(numbers.get(i));
        finalOutput.add(numbers.get(i + 1));
      }
    }

    System.out.println(finalOutput);
  }
}

import java.util.*;

public class DesignerPdfViewer {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    String word = "abc";

    int tallestHeight = 0;

    for (int i = 0; i < word.length(); i++) {
      int charAscii = word.charAt(i) - 97;
      System.out.println("charAscii: " + charAscii);
      int height = arr[charAscii];
      System.out.println("Height: " + height);
      if (height > tallestHeight) {
        tallestHeight = height;
      }
    }

    System.out.println(tallestHeight + " " + word.length() + "" + (tallestHeight * word.length()));

  }
}

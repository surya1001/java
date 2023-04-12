package string;

public class TimeConversion {
  public static void main(String[] args) {
    String s = "12:45:54PM";
    if (s.endsWith("PM")) {
      if (Integer.parseInt(s.substring(0, 2)) == 12) {
        s = "12" + s.substring(2, s.length() - 2);
      } else {
        s = Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, s.length() - 2);
      }
    } else {
      if (Integer.parseInt(s.substring(0, 2)) == 12) {
        s = "00" + s.substring(2, s.length() - 2);
      } else {
        s = s.substring(0, s.length() - 2);
      }
    }

    System.out.println("dddd" + s);

  }
}

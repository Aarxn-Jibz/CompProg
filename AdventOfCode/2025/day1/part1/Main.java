import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input.txt"));
    int num = 50, c = 0;
    while (sc.hasNext()) {
      String line = sc.next();
      char dir = line.charAt(0);
      int n = Integer.parseInt(line.substring(1));
      if (dir == 'R') {
        num = (num + n) % 100;
        if (num == 0) {
          c++;
        }
      } else {
        num = ((num - n) + 100) % 100;
        if (num == 0) {
          c++;
        }
      }
    }
    System.out.println(c);
  }
}

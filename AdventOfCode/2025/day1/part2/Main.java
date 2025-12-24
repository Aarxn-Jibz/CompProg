import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input.txt"));
    int num = 50, c = 0;
    while (sc.hasNext()) {
      String line = sc.next();
      char dir = line.charAt(0);
      int n = Integer.parseInt(line.substring(1));
      for (int i = 0; i < n; i++) {
        if (dir == 'R') {
          ++num;
          if (num == 100) {
            c++;
            num = 0;
          }
        } else {
          --num;
          if (num == 0) {
            c++;
          }
          if (num == -1) {
            num = 99;
          }
        }
      }
    }
    System.out.println(c);
  }
}

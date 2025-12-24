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
      if (dir == 'R') {
        if(n > 99)
      {
          c += n / 100;
          n = n - ((n / 100) * 100);
        }
        num += n;
        if (num == 100 || num > 100) {
          c++;
        }
        num = num % 100;
      } else {
        if(n > 99)
      {
          c += n / 100;
          n = n - ((n / 100) * 100);
        }
        num -= n;
        if (num == 0 || num < 0) {
          c++;
        }
        num = (num + 100) % 100;
      }
    }
    System.out.println(c);
  }
}

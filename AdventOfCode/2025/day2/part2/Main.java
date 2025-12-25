import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("input.txt"));
    String line = sc.nextLine();
    String parts[] = line.split(",");
    long sum = 0;
    for (String p : parts) {
      if (p.isEmpty()) {
        continue;
      }
      String range[] = p.split("-");
      long start = Long.parseLong(range[0]);
      long end = Long.parseLong(range[1]);
      for (long i = start; i <= end; i++) {
        String a = Long.toString(i);
        if (a.length() % 2 != 0) {
          continue;
        } else {
          if (a.substring(0, a.length() / 2).equals(a.substring(a.length() / 2))) {
            sum += i;
          }
        }
      }
    }
    System.out.println(sum);
  }

  static int size(long a) {
    int c = 0;
    while (a > 0) {
      a /= 10;
      c++;
    }
    return c;
  }
}

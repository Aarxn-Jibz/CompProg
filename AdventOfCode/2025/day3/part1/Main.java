import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("input.txt"));
    int sum = 0;
    while (sc.hasNext()) {
      String line = sc.next();
      int ar[] = new int[line.length()];
      int max = 0, prev = 0;
      for (int i = 0; i < line.length(); i++) {
        ar[i] = Character.getNumericValue(line.charAt(i));
        if (i > 0) {
          if (ar[i] > ar[max]) {
            prev = max;
            max = i;
          }
        }
        if (max == line.length() - 1) {
          max = prev;
        }
      }
      int max2 = max + 1;
      for (int i = max; i < line.length(); i++) {
        if (ar[i] > ar[max2]) {
          max2 = i;
        }
      }
      sum += ((max * 10) + max2);
    }
    System.out.println(sum);
  }
}

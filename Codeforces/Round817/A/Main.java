import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String s = "Timur";
    char c[] = s.toCharArray();
    Arrays.sort(c);
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      String w = sc.next();
      char wwe[] = w.toCharArray();
      Arrays.sort(wwe);
      if (Arrays.equals(c, wwe) == true) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}

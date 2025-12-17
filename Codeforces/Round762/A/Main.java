import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      String s = sc.next();
      if (s.length() % 2 != 0) {
        System.out.println("NO");
      } else {
        String w = s.substring((s.length() / 2));
        s = s.substring(0, (s.length() / 2));
        if (s.equalsIgnoreCase(w)) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      }
    }
  }
}

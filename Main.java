import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      String w = sc.next();
      String s = "codeforces";
      int che = 0;
      for (int j = 0; j < 10; j++) {
        if (s.charAt(j) != w.charAt(j)) {
          che++;
        }
      }
      System.out.println(che);
    }
  }
}

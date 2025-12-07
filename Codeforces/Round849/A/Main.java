import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      char c = sc.next().charAt(0);
      String s = "codeforces";
      if (s.indexOf(c) != -1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int co = 0;
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a < b) {
        ++co;
      }
      int c = sc.nextInt();
      if (a < c) {
        ++co;
      }
      int d = sc.nextInt();
      if (a < d) {
        ++co;
      }
      System.out.println(co);
    }
  }
}

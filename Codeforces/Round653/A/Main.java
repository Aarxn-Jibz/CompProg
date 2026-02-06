import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();
      int k = n - y;
      while (k % x != y) {
        if (y == 0 && n < x) {
          k = 0;
          break;
        }
        k--;
      }
      System.out.println(k);
    }
  }
}

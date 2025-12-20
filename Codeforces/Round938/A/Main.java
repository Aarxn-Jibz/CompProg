import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int co = 0;
      if ((a * 2) < b) {
        co = n * a;
      } else {
        int c = n / 2;
        int d = n % 2;
        co = (c * b) + (d * a);
      }
      System.out.println(co);
    }
  }
}

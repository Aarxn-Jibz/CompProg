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
      int a = (n % 10) + ((n / 10) % 10) + ((n / 100) % 10);
      n = n / 1000;
      int b = (n % 10) + ((n / 10) % 10) + ((n / 100) % 10);
      if (a == b) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}

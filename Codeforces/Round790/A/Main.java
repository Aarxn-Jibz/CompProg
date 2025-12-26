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
      int ar[] = new int[n];
      for (int j = 0; j < n; j++) {
        ar[j] = sc.nextInt();
      }
      Arrays.sort(ar);
      int c = 0;
      for (int j = 1; j < n; j++) {
        c += (ar[j] - ar[0]);
      }
      System.out.println(c);
    }
  }
}

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char ar[][] = new char[n][m];
    int c = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ar[i][j] = sc.next().charAt(0);
        if (ar[i][j] != 'B' && ar[i][j] != 'W') {
          c++;
        }
      }
    }
    if (c == 0) {
      System.out.println("#Black&White");
    } else {
      System.out.println("#Color");
    }
  }
}

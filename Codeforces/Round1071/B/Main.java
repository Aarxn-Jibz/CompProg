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
      int max = 0;
      for (int j = 0; j < n; j++) {
        ar[j] = sc.nextInt();
        if (ar[j] > ar[max]) {
          max = j;
        }
      }
      int sum = 0;
      for (int j = 0; j < n - 1; j++) {
        if (j == max) {
          continue;
        } else if (j + 1 == max) {
          if (j == n - 2) {
            break;
          }
          sum += (Math.abs(ar[j] - ar[j + 2]));
        } else {
          sum += (Math.abs(ar[j] - ar[j + 1]));
        }
      }
      System.out.println(sum);
    }
  }
}

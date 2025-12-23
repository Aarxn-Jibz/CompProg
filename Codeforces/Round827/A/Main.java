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
      if (n == 1) {
        System.out.println("NO");
      } else {
        Arrays.sort(ar);
      
      if (ar[0] == ar[n - 1]) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
      }
    }
  }
}

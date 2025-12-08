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
      int che = 1;
      int c = 0;
      for (int j = 0; j < n; j++) {
        if (ar[j] == 1) {
          che = 1;
        } else {
          if (che == 0) {
            continue;
          } else {
            c++;
            che = 0;
          }
        }
      }
      System.out.println(c);
    }
  }
}

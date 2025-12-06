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
      int k = sc.nextInt();
      String s = sc.next();
      int che = 0;
      int c = 0;
      for (int j = 0; j < n; j++) {
        if (s.charAt(j) == '1') {
          che = k;
        }
        if (s.charAt(j) == '0') {
          if (che > 0) {
            che--;
          } else {
            c++;
          }
        }
      }
      System.out.println(c);
    }
  }
}

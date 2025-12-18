import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      char ar[][] = new char[10][10];
      int co = 0;
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          ar[j][k] = sc.next().charAt(0);
          if (ar[j][k] == 'X') {
            int l = j + 1;
            if (l == 1 || l == 10) {
              co += 1;
            } else if (l == 2 || l == 9) {
              co += 2;
            } else if (l == 3 || l == 8) {
              co += 3;
            } else if (l == 4 || l == 7) {
              co += 4;
            } else {
              co += 5;
            }
          }
        }
      }
      System.out.println(co);
    }
  }
}

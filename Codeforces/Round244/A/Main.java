import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ar[] = new int[n];
    int co = 0;
    int ci = 0;
    for (int i = 0; i < n; i++) {
      ar[i] = sc.nextInt();
      if (ar[i] == -1) {
        if (ci == 0) {
          co++;
        } else {
          ci--;
        }
      } else {
        ci += ar[i];
      }
    }
    System.out.println(co);
  }
}

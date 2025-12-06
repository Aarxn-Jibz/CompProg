import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int ar[] = new int[t];
    for (int i = 0; i < t; i++) {
      ar[i] = sc.nextInt();
    }
    Arrays.sort(ar);
    int max = ar[t - 1];
    int c = 0;
    for (int i = 0; i < t; i++) {
      if (ar[i] < max) {
        c += max - ar[i];
      }
    }
    System.out.println(c);
  }
}

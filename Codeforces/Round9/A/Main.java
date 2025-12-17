import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ar[] = new int[2];
    for (int i = 0; i < 2; i++) {
      ar[i] = sc.nextInt();
    }
    Arrays.sort(ar);
    double a = 0.0;
    a = ((double) (ar[1] - 1) / 6);
    System.out.println(a);
  }
}

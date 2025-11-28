import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int s = k;
    for (int i = 1; i <= n; i++) {

      if ((s + (5 * i)) > 240) {
        System.out.println(i - 1);
        System.exit(0);

      }
      s += 5 * i;
    }
    System.out.println(n);
  }
}

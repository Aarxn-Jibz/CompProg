import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int ar[] = new int[3];
      for (int j = 0; j < 3; j++) {
        ar[j] = sc.nextInt();
      }
      Arrays.sort(ar);
      if ((ar[1] + ar[2]) > 9) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
  }
}

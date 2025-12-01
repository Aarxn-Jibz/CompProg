import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ar[] = new int[4];
    ar[0] = sc.nextInt();
    ar[1] = sc.nextInt();
    ar[2] = sc.nextInt();
    ar[3] = sc.nextInt();
    Arrays.sort(ar);
    int a = ar[3] - ar[1];
    int b = ar[3] - ar[0];
    int c = ar[3] - ar[2];
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int l = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int p = sc.nextInt();
    int nl = sc.nextInt();
    int np = sc.nextInt();
    int che1 = (k * l) / nl;
    int che2 = (c * d);
    int che3 = p / np;
    int a = 0;
    if (che1 < che2 && che1 < che3) {
      a = che1 / n;
    } else if (che2 < che1 && che2 < che3) {
      a = che2 / n;
    } else {
      a = che3 / n;
    }
    System.out.println(a);
  }
}

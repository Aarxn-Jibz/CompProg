import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int r = sc.nextInt();
    int co = 0;
    int re = k;
    while (true) {
      if (k % 10 == 0) {
        break;
      }
      if (k % 10 == r) {
        break;
      }
      co++;
      k += re;
    }
    co++;
    System.out.println(co);
  }
}

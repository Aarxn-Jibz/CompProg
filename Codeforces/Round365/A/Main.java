import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int m = 0;
    int c = 0;
    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a > b) {
        m++;
      } else if (b > a) {
        c++;
      }
    }
    if (m > c) {
      System.out.println("Mishka");
    } else if (c > m) {
      System.out.println("Chris");
    } else {
      System.out.println("Friendship is magic!^^");
    }
  }
}

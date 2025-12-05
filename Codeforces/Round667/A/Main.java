import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int co = 0;
      if (a != b) {
        if (a > b) {
          a = a - b;
          co = a / 10;
          if (a % 10 != 0) {
            co++;
          }
        } else {
          a = b - a;
          co = a / 10;
          if (a % 10 != 0) {
            co++;
          }
        }
      }
      System.out.println(co);
    }
  }
}

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int co1 = 0;
    int co2 = 0;

    if (a > b) {
      co1 = b;
      a -= b;
      b = 0;
    } else if (b > a) {
      co1 = a;
      b -= a;
      a = 0;
    } else {
      co1 = b;
      b = 0;
      a = 0;
    }
    if (a > 0 || b > 0) {
      if (a > 0) {
        co2 = a / 2;
      } else {
        co2 = b / 2;
      }
    }
    System.out.println(co1);
    System.out.println(co2);
  }
}

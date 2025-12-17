import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cpy = n;
    while (n > 0) {
      if (n != cpy) {
        System.out.print("+");
      }
      if (n >= 500) {
        n -= 500;
        System.out.print("500");
      } else if (n >= 200) {
        n -= 200;
        System.out.print("200");
      } else if (n >= 100) {
        n -= 100;
        System.out.print("100");
      } else if (n >= 50) {
        n -= 50;
        System.out.print("50");
      } else if (n >= 20) {
        n -= 20;
        System.out.print("20");
      } else if (n >= 10) {
        n -= 10;
        System.out.print("10");
      } else if (n > 5) {
        n -= 5;
        System.out.print("5");
      } else if (n >= 2) {
        n -= 2;
        System.out.print("2");
      } else if (n >= 0) {
        n -= 1;
        System.out.print("1");
      }

    }
  }
}

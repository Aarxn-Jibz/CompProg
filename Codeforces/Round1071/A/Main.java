import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int k = sc.nextInt();
      int x = sc.nextInt();
      System.out.println((k * x) + 1);
    }
  }
}

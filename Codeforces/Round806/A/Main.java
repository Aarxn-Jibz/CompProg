import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      String s = sc.next();
      if (s.equalsIgnoreCase("YES")) {
        System.out.println("YES");

      } else {
        System.out.println("NO");
      }
    }
  }
}

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
      char ch[] = s.toCharArray();
      int a = ch[0] - 48;
      int b = ch[2] - 48;
      System.out.println(a + b);
    }
  }
}

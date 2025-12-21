import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = "qwertyuiop";
    String b = "asdfghjkl;";
    String c = "zxcvbnm,./";
    char ar[][] = new char[3][10];
    ar[0] = String.toCharArray(a);
    ar[1] = String.toCharArray(b);
    ar[2] = String.toCharArray(c);
    char dir = sc.next().charAt(0);
    String input = sc.next();
    int che = 1;
    if (dir == 'R') {
      che = -1;
    }
  }
}

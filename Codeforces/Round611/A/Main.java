import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int hh = sc.nextInt();
      int mm = sc.nextInt();
      int co = 0;
      if (mm != 0) {
        co += 60 - mm;
        hh++;
      }
      if (hh != 24) {
        co += 60 * (24 - hh);
      }
      System.out.println(co);
    }
  }
}

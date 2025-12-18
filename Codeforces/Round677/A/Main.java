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
      int co = 0;
      for (int j = 0; j < 9; j++) {
        if (s.charAt(0) == (char) (49 + j)) {
          if (s.length() >= 1) {
            co += 1;
          }
          if (s.length() >= 2) {
            co += 2;
          }
          if (s.length() >= 3) {
            co += 3;
          }
          if (s.length() == 4) {
            co += 4;
          }
          break;
        } else {
          co += 10;
        }
      }
      System.out.println(co);
    }

  }
}

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
      for (int j = 0; j < 5; j++) {
        if (s.charAt(j) == 'A') {
          co++;
        }
      }
      if (co > (5 - co)) {
        System.out.println("A");
      } else {
        System.out.println("B");
      }
    }
  }
}

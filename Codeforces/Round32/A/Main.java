import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int da = 0;
    String s = sc.next();
    String w = "";
    for (int i = 0; i < s.length(); i++) {
      if (da == 0) {
        if (s.charAt(i) == '.') {
          w = w + '0';
        } else {
          da = 1;
        }
      } else if (da == 1) {
        if (s.charAt(i) == '.') {
          w = w + '1';
          da = 0;
        } else {
          w = w + '2';
          da = 0;
        }
      }
    }
    System.out.println(w);
  }
}

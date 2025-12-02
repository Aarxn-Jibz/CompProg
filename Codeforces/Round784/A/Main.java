import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int rating = sc.nextInt();
      if (rating <= 1399) {
        System.out.println("Division 4");
      } else if (rating >= 1400 && rating <= 1599) {
        System.out.println("Division 3");
      } else if (rating >= 1600 && rating <= 1899) {
        System.out.println("Division 2");
      } else {
        System.out.println("Division 1");
      }
    }
  }
}

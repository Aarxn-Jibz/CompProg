import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long spl = 0;
    long s = 0;
    if (n % 2 == 0) {
      spl = n / 2;
    } else {
      spl = (n / 2) + 1;
    }
    if (k > spl) {
      k = k - spl;
      s = 2 * k;
    } else {
      s = (2 * k) - 1;
    }
    System.out.println(s);
  }
}

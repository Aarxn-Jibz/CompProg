
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int s1 = sc.nextInt();
      int s2 = sc.nextInt();
      int s3 = sc.nextInt();
      int s4 = sc.nextInt();

      int win1 = Math.max(s1, s2);
      int win2 = Math.max(s3, s4);

      int[] arr = { s1, s2, s3, s4 };
      Arrays.sort(arr);

      int max1 = arr[3];
      int max2 = arr[2];

      if ((win1 == max1 && win2 == max2) || (win1 == max2 && win2 == max1))
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}

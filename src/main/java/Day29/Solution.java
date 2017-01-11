package Day29;

import java.util.Scanner;

/**
 * Created by Michal Knobel on 11.01.2017.
 */
public class Solution {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int max = -10;
      for (int j = 0; j <= n; j++) {
        for (int l = j+1; l <= n; l++) {
          if ((j&l) < k) {
            max = Math.max(max, (j&l));
          }
        }
      }
      System.out.println(max);
    }
  }
}

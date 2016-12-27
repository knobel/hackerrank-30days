import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class Recursion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(factorial(n));
  }

  private static int factorial(int n) {
    if (n<=0) return 1;
    else return n* factorial(n-1);
  }
}

package Day25;

import java.util.Scanner;

/**
 * Created by Michal Knobel on 10.01.2017.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    for (int i = 0; i < count; i++) {
      int number = s.nextInt();
      System.out.println(checkIfPrimeFaster2(number));
    }
  }

  public static String checkIfPrime(int number) {
    for (int i = 1; i < number; i++) {
      if (number % i == 0)
        return "Not prime";
    }
    return "Prime";
  }

  public static String checkIfPrimeFaster(int number) {
    int sqrt = (int) Math.sqrt(number) + 1;
    for (int i = 2; i < sqrt; i++) {
      if (number % i == 0)
        return "Not prime";
    }
    return "Prime";
  }

  public static String checkIfPrimeFaster2(int number) {
    if (number == 1)
      return "Not prime";
    if (number == 2 || number == 3)
      return "Prime";
    if (number % 2 == 0)
      return "Not prime";

    for (int i = 3; i*i <= number; i+=2) {
      if (number % i == 0)
        return "Not prime";
    }

    return "Prime";
  }
}

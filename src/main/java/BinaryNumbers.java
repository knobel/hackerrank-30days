import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class BinaryNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    int counter = 0;
    int max = 0;
    while (number > 0)
    {
      if (number % 2 == 1) counter++;
      else counter = 0;
      max = Math.max(max, counter);
      number = (number / 2);
    }

    System.out.println(max);
  }

}

import java.util.Scanner;

/**
 * Created by Michal Knobel on 15.12.2016.
 */

public class Arithmetic {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mealCost = scan.nextDouble(); // original meal price
    int tipPercent = scan.nextInt(); // tip percentage
    int taxPercent = scan.nextInt(); // tax percentage
    scan.close();

    // Write your calculation code here.
    double result = mealCost + ((double)tipPercent/100)*mealCost + ((double)taxPercent/100)*mealCost;

    // cast the result of the rounding operation to an int and save it as totalCost
    int totalCost = (int) Math.round(result);

    // Print your result
    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }
}

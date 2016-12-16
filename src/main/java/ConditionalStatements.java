import java.util.Scanner;

/**
 * Created by Michal Knobel on 16.12.2016.
 */
public class ConditionalStatements {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    String ans="Not Weird";

    // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
    if(n%2==1){
      ans = "Weird";
    }
    else if (n >= 6 && n<= 20) {
      ans = "Weird";
    }
    System.out.println(ans);
  }
}

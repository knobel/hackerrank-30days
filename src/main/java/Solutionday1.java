import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutionday1 {

  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);
    scan.useDelimiter(Pattern.compile("[\\r\\n;]+"));

     /* Declare second integer, double, and String variables. */
    int j;
    double e;
    String t;

        /* Read and save an integer, double, and String to your variables.*/
    j = scan.nextInt();
    e = scan.nextDouble();
    //t = scan.next() + scan.nextLine();
    t = scan.next();

        /* Print the sum of both integer variables on a new line. */
    System.out.println(i + j);

        /* Print the sum of the double variables on a new line. */
    System.out.println(d + e);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
    System.out.println(s + t);

    scan.close();
  }
}
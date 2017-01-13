package Day27;

import java.util.Scanner;

/**
 * Created by Michal Knobel on 13.01.2017.
 */
public class Solution {


  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    String input2 =
        "5\n" +
            "4 3\n" +
            "0 -3 4 2\n" +
            "5 2\n" +
            "0 -1 2 1 4\n" +
            "6 3\n" +
            "0 -3 4 2 4 66\n" +
            "7 4\n" +
            "0 -3 -4 -2 -3 2 0\n" +
            "8 3\n" +
            "-1 0 3 4 2 34 34 4\n"
        ;
    System.out.print(input2);
  }

  public String calculate(String input) {
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(input);
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      int numberOfStudents = scanner.nextInt();
      int cancelationThreshold = scanner.nextInt();
      int numberOfStudentsPresent = 0;
      for (int j = 0; j < numberOfStudents; j++) {
        int studentArrivalTime = scanner.nextInt();
        if (studentArrivalTime <= 0) {
          numberOfStudentsPresent++;
        }
      }
      if (numberOfStudentsPresent >= cancelationThreshold) {
        sb.append("NO").append("\n");
      } else {
        sb.append("YES").append("\n");
      }
    }
    return sb.toString();
  }
}

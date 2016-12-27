import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class LetReviewDay6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfWords = scanner.nextInt();
    String[] words = new String[numberOfWords];

    for (int i = 0; i < numberOfWords; i++) {
      words[i] = scanner.next();
    }

    for (int i = 0; i < numberOfWords; i++) {
      String s = words[i];
      String even = "";
      String odd = "";
      for (int j = 0; j < s.length(); j++) {
        if (j%2 == 0) even +=s.charAt(j);
        if (j%2 == 1) odd +=s.charAt(j);
      }

      System.out.println(even + " " + odd);
    }
  }
}

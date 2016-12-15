import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 15.12.2016.
 */
public class HackerRankBigInteger {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();

        BigInteger bigInteger1 = new BigInteger(string1);
        BigInteger bigInteger2 = new BigInteger(string2);

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
  }

}

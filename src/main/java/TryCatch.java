import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 15.12.2016.
 */
public class TryCatch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int int1;
    int int2;

    try {
      int1 = scanner.nextInt();
      int2 = scanner.nextInt();
      System.out.println(int1/int2);
    }
    catch (InputMismatchException e){
      System.out.println("java.util.InputMismatchException");
    }
    catch (ArithmeticException e) {
      System.out.println("java.lang.ArithmeticException: / by zero");
    }

  }
}

import java.util.Scanner;

/**
 * Created by Michal Knobel on 15.12.2016.
 */
public class BotSavesPrincess {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("[\\r\\n;]+");

    final int n = scanner.nextInt();

    int xm=0,ym=0,xp=0,yp=0;

    boolean mProvided = false, pProvided = false;
    for (int i = 0; i < n; i++) {

      String s = scanner.next();
      if (s.length() != n) {
        throw new IllegalArgumentException("not correct line size");
      }

      for (int j = 0; j < s.length(); j++) {

        if (s.charAt(j) == 'm') {
          xm = j;
          ym = i;
          mProvided = true;
        } else if (s.charAt(j) == 'p') {
          xp = j;
          yp = i;
          pProvided = true;
        }
      }
    }

    if (mProvided == false || pProvided == false) {
     throw new IllegalArgumentException("m or p not provided");
    }


    if (xm != xp) {
      int xDistance = xm - xp;
      int xNumberOfMoves = Math.abs(xDistance);
      for (int i = 0; i < xNumberOfMoves; i++) {
        if (xDistance > 0 ) System.out.println("LEFT");
        if (xDistance < 0 ) System.out.println("RIGHT");
      }
    }

    if (ym != yp) {
      int yDistance = ym - yp;
      int yNumberOfMoves = Math.abs(yDistance);
      for (int i = 0; i < yNumberOfMoves; i++) {
        if (yDistance > 0 ) System.out.println("UP");
        if (yDistance < 0 ) System.out.println("DOWN");
      }
    }
  }
}

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 16.12.2016.
 */
public class DateTime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();

    LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    System.out.println(localDate.getDayOfWeek().toString());
  }
}

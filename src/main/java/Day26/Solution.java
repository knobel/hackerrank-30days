package Day26;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int dayReturn = s.nextInt();
    int monthReturn = s.nextInt();
    int yearReturn = s.nextInt();
    int dayExpected = s.nextInt();
    int monthExpected = s.nextInt();
    int yearExpected = s.nextInt();

    LocalDate dateReturn = LocalDate.of(yearReturn, monthReturn, dayReturn);
    LocalDate dateExpected = LocalDate.of(yearExpected, monthExpected, dayExpected);

    System.out.println(calculatFine(dateReturn, dateExpected));

  }

  private static int calculatFine(LocalDate dateReturn, LocalDate dateExpected) {
    if (dateReturn.isBefore(dateExpected) || dateReturn.isEqual(dateExpected))
      return 0;
    if (dateExpected.getMonth().equals(dateReturn.getMonth()) )
      return 15 * (dateReturn.getDayOfMonth() - dateExpected.getDayOfMonth());
    if (dateExpected.getYear() == dateReturn.getYear())
      return 500 * (dateReturn.getMonthValue() - dateExpected.getMonthValue());
    else
      return 10000;
  }

}
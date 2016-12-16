import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 16.12.2016.
 */
public class CurrencyFormatter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    Locale usLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
    Locale inLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
    Locale chLocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
    Locale frLocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();

    NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
    NumberFormat inFormat = NumberFormat.getCurrencyInstance(inLocale);
    NumberFormat cnFormat = NumberFormat.getCurrencyInstance(chLocale);
    NumberFormat frFormat = NumberFormat.getCurrencyInstance(frLocale);

    String us = usFormat.format(payment);
    String india = inFormat.format(payment);
    String china = cnFormat.format(payment);
    String france = frFormat.format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);


  }
}

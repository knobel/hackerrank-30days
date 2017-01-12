package Day28;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Michal Knobel on 12.01.2017.
 */
public class SolutionTest {

  String input =
      "30\n" +
      "riya riya@gmail.com\n" +
      "julia julia@julia.me\n" +
      "julia sjulia@gmail.com\n" +
      "julia julia@gmail.com\n" +
      "samantha samantha@gmail.com\n" +
      "tanya tanya@gmail.com\n" +
      "riya ariya@gmail.com\n" +
      "julia bjulia@julia.me\n" +
      "julia csjulia@gmail.com\n" +
      "julia djulia@gmail.com\n" +
      "samantha esamantha@gmail.com\n" +
      "tanya ftanya@gmail.com\n" +
      "riya riya@live.com\n" +
      "julia julia@live.com\n" +
      "julia sjulia@live.com\n" +
      "julia julia@live.com\n" +
      "samantha samantha@live.com\n" +
      "tanya tanya@live.com\n" +
      "riya ariya@live.com\n" +
      "julia bjulia@live.com\n" +
      "julia csjulia@live.com\n" +
      "julia djulia@live.com\n" +
      "samantha esamantha@live.com\n" +
      "tanya ftanya@live.com\n" +
      "riya gmail@riya.com\n" +
      "priya priya@gmail.com\n" +
      "preeti preeti@gmail.com\n" +
      "alice alice@alicegmail.com\n" +
      "alice alice@gmail.com\n" +
      "alice gmail.alice@gmail.com";

  String output =
      "alice\n" +
      "alice\n" +
      "julia\n" +
      "julia\n" +
      "julia\n" +
      "julia\n" +
      "preeti\n" +
      "priya\n" +
      "riya\n" +
      "riya\n" +
      "samantha\n" +
      "samantha\n" +
      "tanya\n" +
      "tanya\n";

  @Test
  public void mainTest() throws Exception {
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    Assert.assertEquals(output, Solution.filterMails(inputStream));
  }
}
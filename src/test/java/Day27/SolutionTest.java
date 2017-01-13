package Day27;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Michal Knobel on 13.01.2017.
 */
public class SolutionTest {

  private String input =
      "2\n" +
      "4 3\n" +
      "-1 -3 4 2\n" +
      "5 2\n" +
      "0 -1 2 1 4";

  private String output =
      "YES\n" +
      "NO\n";

  private String output2 =
      "YES\n" +
      "NO\n" +
      "YES\n" +
      "NO\n" +
      "YES\n";

  private String input2 =
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

  @Test
  public void calculateTest() throws Exception {
    assertEquals(output, new Solution().calculate(input));
  }

  @Test
  public void calculate2Test() throws Exception {
    assertEquals(output2, new Solution().calculate(input2));
  }

}
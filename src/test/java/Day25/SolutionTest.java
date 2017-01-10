package Day25;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Michal Knobel on 10.01.2017.
 */
@RunWith(Parameterized.class)
public class SolutionTest {

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        {1, "Not prime"},
        {2, "Prime"},
        {3, "Prime"},
        {4, "Not prime"},
        {5, "Prime"},
        {6, "Not prime"},
        {7, "Prime"},
        {23, "Prime"},
        {29, "Prime"},
        {31, "Prime"},
        {53, "Prime"}
    });
  }

  private int testInput;

  private String testExpected;

  public SolutionTest(int input, String expected) {
    testInput = input;
    testExpected = expected;
  }

  @Test
  public void checkIfPrime() throws Exception {
    assertEquals(testExpected, new Solution().checkIfPrimeFaster(testInput));
  }

  @Test
  public void checkIfPrimeFaster() throws Exception {
    assertEquals(testExpected, new Solution().checkIfPrimeFaster(testInput));
  }

  @Test
  public void checkIfPrimeFaster2() throws Exception {
    assertEquals(testExpected, new Solution().checkIfPrimeFaster2(testInput));
  }
}
import java.util.Scanner;

/**
 * Created by michal on 05.01.17.
 */
class Calculator {
    int power(int base, int exponent) {
        if (base < 0 || exponent < 0)
            throw new IllegalArgumentException("n and p should be non-negative");
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    static class Solution {

        public static void main(String[] argh) {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            while (T-- > 0) {
                int n = in.nextInt();
                int p = in.nextInt();
                Calculator myCalculator = new Calculator();
                try {
                    int ans = myCalculator.power(n, p);
                    System.out.println(ans);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}

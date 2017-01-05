import java.util.Scanner;

/**
 * Created by michal on 05.01.17.
 */
public class Interfaces {

    static class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            AdvancedArithmetic myCalculator = new Calculator2();
            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out.println(sum);
        }
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}


class Calculator2 implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        if (n == 1)
            return 1;
        int sum = n + 1;
        int divisor = n / 2;
        while (divisor > 1) {
            if (n % divisor == 0)
                sum += divisor;
            divisor--;
        }
        return sum;
    }
}

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 15.12.2016.
 */
public class HackerRankBigDecimal {
  public static void main(String []args){
    BigDecimal bigDecimal1 = new BigDecimal("0.12");
    BigDecimal bigDecimal2 = new BigDecimal(".12");

    System.out.println(bigDecimal1 + " " + bigDecimal2);
    //Input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    for(int i=0;i<n;i++){
      s[i]=sc.next();
    }
    sc.close();

    class MyBigDecimal extends BigDecimal{

      String string;

      public MyBigDecimal(char[] in, int offset, int len) {
        super(in, offset, len);
      }

      public MyBigDecimal(String s) {
        super(s);
        string = s;
      }

      public String getString() {
        return string;
      }
    }

    MyBigDecimal[] myBigDecimal = new MyBigDecimal[n];

    for (int i = 0; i < n; i++) {
      myBigDecimal[i] = new MyBigDecimal(s[i]);
    }

    Arrays.sort(myBigDecimal, Collections.<MyBigDecimal>reverseOrder());

    for (int i = 0; i < n; i++) {
      s[i] = myBigDecimal[i].getString();
    }

    //Output
    for(int i=0;i<n;i++)
    {
      System.out.println(s[i]);
    }
  }

}

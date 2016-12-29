import java.util.Scanner;

/**
 * Created by Michal Knobel on 29.12.2016.
 */
public class Scope {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
  
}

class Difference {
  private int[] elements;
  public int maximumDifference;


  public Difference(int[] a) {
    elements = a;
  }

  public void computeDifference() {
    for (int i = 0; i < elements.length; i++) {
      for (int j = i+1; j < elements.length; j++) {
        maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
      }
    }
  }
}

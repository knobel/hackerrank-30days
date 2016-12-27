import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class ArraysDay7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i < n; i++){
      arr[i] = in.nextInt();
    }
    in.close();

    String output = "";
    for (int i = arr.length-1; i >= 0; i--) {
      output += arr[i];
      output += " ";
    }
    System.out.println(output);
  }
}

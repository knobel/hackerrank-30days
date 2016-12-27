import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class Arrays2D {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for(int i=0; i < 6; i++){
      for(int j=0; j < 6; j++){
        arr[i][j] = in.nextInt();
      }
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int sum=0;
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            if (k == 0 || k == 2 || (k == 1 && l == 1))
              sum += arr[k+i][l+j];
          }
        }
        max = Math.max(max, sum);
      }
    }

    System.out.println(max);
  }
}

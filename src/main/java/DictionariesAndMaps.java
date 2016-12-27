import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Michal Knobel on 27.12.2016.
 */
public class DictionariesAndMaps {
  public static void main(String []argh){
    Map<String,Integer> phoneBook = new HashMap<>();

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      phoneBook.put(name,phone);
    }
    while(in.hasNext()){
      String s = in.next();
      Integer phone = phoneBook.get(s);
      if (phone == null) {
        System.out.println("Not found");
      } else {
        System.out.println(s+"="+phone);
      }
    }
    in.close();
  }
}

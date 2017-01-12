package Day28;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

/**
 * Created by Michal Knobel on 11.01.2017.
 */
public class Solution {

  public static void main(String[] args) {
    String s = filterMails(System.in);
    System.out.print(s);

  }

  public static String filterMails(InputStream inputStream) {
    Scanner scanner = new Scanner(inputStream);
    int n = scanner.nextInt();
    List<Node> list = new LinkedList<>();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < n; i++) {
      String name = scanner.next();
      String email = scanner. next();
      if (email.endsWith("@gmail.com")) {
        list.add(new Node(name, email));
      }
    }
    Collections.sort(list);
    for (Node node:list) {
      sb.append(node.getName());
      sb.append("\n");
    }
    return sb.toString();
  }

  private static class Node implements Comparable<Node> {
    private String name;
    private String email;

    public String getName() {
      return name;
    }

    public Node(String name, String email) {
      this.name = name;
      this.email = email;
    }

    @Override
    public int compareTo(Node that) {
      return this.name.compareTo(that.name);
    }
  }
}

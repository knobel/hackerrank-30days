import java.util.Scanner;

/**
 * Created by Michal Knobel on 29.12.2016.
 */
public class LinkedList {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
      int ele = sc.nextInt();
      head = insert(head,ele);
    }
    display(head);
    sc.close();
  }

  public static  Node insert2(Node head,int data) {
    Node node = new Node(data);

    Node start = head;
    if (start == null) {
      return node;
    }

    while (start != null) {
      if (start.next == null) {
        start.next = node;
        break;
      } else {
        start = start.next;
      }
    }
    return head;
  }


  public static  Node insert(Node head,int data) {
    if (head == null) {
      return new Node(data);
    } else if (head.next == null) {
      Node node = new Node(data);
      head.next = node;
      return head;
    }
    else {
      insert (head.next, data);
      return head;
    }
  }

  public static void display(Node head) {
    Node start = head;
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }
}

class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
  }
}

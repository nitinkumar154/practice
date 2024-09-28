package com.geeks.flatLinkedlist;

public class FlatenLinkedList {

  public static void main(String[] args) {
    Node n1 = new Node(5);
    n1.down = new Node(7);
    n1.down.down = new Node(8);
    n1.down.down.down =new Node(30);
    Node n2 = new Node(10);
    n1.next = n2;
    n2.down = new Node(20);
    Node n3 = new Node(19);
    n2.next = n3;
    n3.down = new Node(22);
    n3.down.down = new Node(50);
    Node n4 = new Node(28);
    n3.next = n4;
    n4.down = new Node(35);
    n4.down.down = new Node(40);
    n4.down.down.down =new Node(45);
    Node finalnode = flattenList(n1);
  }

  private static Node flattenList(Node head) {
    if(head==null|| head.next==null) {
        return head ;
    }
    head.next=flattenList(head.next);
    head=merge(head,head.next);
    return head;    
}
  private static Node merge(Node a, Node b) {
    if (a == null)     return b;
      // if second linked list is empty then first
      // is the result
      if (b == null)      return a;

      // compare the data members of the two lonked lists
      // and put the larger one in the result
      Node result;

      if (a.data < b.data)
      {
          result = a;
          result.down =  merge(a.down, b);
      }

      else
      {
          result = b;
          result.down = merge(a, b.down);
      }

      return result;
}
}

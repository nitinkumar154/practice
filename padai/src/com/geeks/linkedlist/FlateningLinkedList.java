package com.geeks.linkedlist;

import java.util.Stack;

public class FlateningLinkedList {

  public static void main(String[] args) {
    
    DualNode head = null;
    
     head = insertDualNode(head,20);
      head = insertAtBottom(head, 22); 
     head = insertAtBottom(head, 25);
     head =insertAtBottom(head, 65);
     head = insertAtBottom(head, 70);
     DualNode head2 = insertDualNode(head,7);
     head2 = insertAtBottom(head2, 12); 
     head2 = insertAtBottom(head2, 23);
     head2 =insertAtBottom(head2, 34);
     DualNode head3 = insertDualNode(head,10);
     head3 = insertAtBottom(head3, 15); 
     head3 = insertAtBottom(head3, 17);
     head3 =insertAtBottom(head3, 18);
     head3 =insertAtBottom(head3, 21);
     head3 =insertAtBottom(head3, 33);
     DualNode head4 = insertDualNode(head,32);
     head4 = insertAtBottom(head4, 39); 
     head4 = insertAtBottom(head4, 40);
     
     Node node = flatLinkedList(head);
     
     
     

  }
  private static DualNode flatLinkedList(DualNode prev, DualNode next) {
  DualNode result = prev;
  Node temp1 = prev.down;
  Node temp2 = next.down;
  
 while (temp1.next!=null || temp2.next!=null) {
   if (temp1.data>temp2.data) {
    
  }
  
}
    
    
    
    
    return null;
  
  }

  private static Node flatLinkedList(DualNode head) {
    Stack<DualNode> st = new Stack<DualNode>();
    DualNode temp = head;
    while (temp != null) {
      st.push(temp);
      temp = temp.right;
    }
    
    
    
    
    return null;
  }

  public static DualNode insertAtBottom(DualNode head, int data) {
    if (head== null) {
      head = new DualNode(data);
      
    } else {
      if(head.down == null) {
       Node n = new Node(data);
       head.down = n;
      }
      else {
        Node temp = head .down;
        while (temp.next!=null) {
          temp = temp.next;
        }
          Node n = new Node(data);
     temp.next = n;
      }

    }
    return head;
  }

  private static DualNode insertDualNode(DualNode head,int data) {
   DualNode insertedNode= null;
    if (head == null) {
     DualNode dn = new DualNode(data);
     head = dn;
     insertedNode = head;
  } else {
    DualNode temp = head;
    while (temp.right!=null) {
     temp = temp.right;
    }
    DualNode dn = new DualNode(data);
    temp.right = dn;
    insertedNode = dn;
  }
    return insertedNode;
  }

}

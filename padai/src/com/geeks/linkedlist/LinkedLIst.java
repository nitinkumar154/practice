package com.geeks.linkedlist;


public class LinkedLIst {
public static Node pairSwap(Node head) {
  Node current = head;
  Node prev =null ;
  Node cNext;
  Node ccNext;
 
  if (head.next == null) {
    return head;
  }
  else {
    current = head ;
    prev = null;
    cNext = head.next;
    head = cNext;
  while (current!=null && cNext!=null) {
   ccNext = cNext.next;
   cNext.next = current;
   current.next = ccNext;
   //prev.next= cNext;
   if (prev!=null) {
prev.next = cNext;    
  }
   prev = current;
   current = ccNext;
   cNext = current.next;
  }
  printLinkedList(head);
  }
  return head;
}
public static Node pairSwapRecursion(Node head) {
  Node curr; 
  Node cn ;
  Node prev;
  if (head == null || head.next==null) {
    return head;
  }
  else {
     curr = head ;
     cn = head.next;
     prev = cn;
    Node nxt = cn.next;
    cn.next = curr;
    curr.next= pairSwapRecursion(nxt);
    
    
  }
  
  return prev;
}

public static void main(String[] args) {
   
    Node head = null;
    head = insertNodeAtEnd(5,head);
    head = insertNodeAtEnd(6,head);
    head = insertNodeAtEnd(7,head);
    head = insertNodeAtEnd(8,head);
    head = insertNodeAtEnd(9,head);
    head = insertNodeAtEnd(1,head);
    head = insertNodeAtEnd(2,head);
    head = insertNodeAtEnd(3,head);
    head = insertNodeAtEnd(4,head);
  head = reverseLinkedListInGroup(head, 4);
  printLinkedList(head);
    
    
    
    
//    head = insertNodeAtEnd(5,head);
  //  head = insertNodeAtEnd(6,head);
    /*head = insertNodeAtEnd(7,head);
    head = insertNodeAtEnd(8,head);
    head = insertNodeAtEnd(9,head);
 */  // head = insertNodeAtEnd(10,head);
    printLinkedList(head);
    System.out.println("**************************");System.out.println();
    //pairSwap(head);
    head = pairSwapRecursion(head);
    printLinkedList(head);
    System.out.println("   **************************** 3 element from the last           "  );
    System.out.println(findNthElementFromEnd(head,3));
    
    System.out.println( "  ");
    printLinkedList(head);
    
    System.out.println("   ");
    System.out.println(removeNthFromEnd(head,3));
    printLinkedList(head);
    
    //int midElement = findMidElement(head);
    System.out.println("  ");
    //System.out.println("mid element in the linked list is :"+midElement);
//    head = reverseLinkedList(head);
  //  printLinkedList(head);
    
    head = rotateLinkedList(head,4);
    printLinkedList(head);
    
    
    Node headLoop =  new Node(5);
    Node k =  new Node(2);
    headLoop.next = k;
    
    
    Node n2 = new Node(10);
    k.next = n2 ;
    Node n3 = new Node(15);
    n2.next = n3;
    Node n4 = new Node(18);
    n3.next = n4; 
    Node n5 = new Node(21);
    n4.next= n5;    
    Node n6 = new Node(23);
    n5.next = n6;
    Node n7 = new Node(25);
    n6.next = n7;
    System.out.println("input linked list is :");
    printLinkedList(headLoop);
    deleteNode(n4);
    System.out.println("********************** delete node n4 having data 18");
    printLinkedList(headLoop);
    
    n7.next = n2;

    String status = findLoopInLinkedList(headLoop);
    Node head1 = null;
    
    head1 = insertNodeAtEnd(5,head1);
    head1 = insertNodeAtEnd(7,head1);
    head1 = insertNodeAtEnd(10,head1);
    head1 = insertNodeAtEnd(15,head1);
    head1 = insertNodeAtEnd(25,head1);
    head1 = insertNodeAtEnd(28,head1);
    head1 = insertNodeAtEnd(30,head1);
    head1 = insertNodeAtEnd(85,head1);
    
    
   Node head2 = null; 
    head2 = insertNodeAtEnd(1,head2);
    head2 = insertNodeAtEnd(3,head2);
    head2 = insertNodeAtEnd(6,head2);
    head2 = insertNodeAtEnd(8,head2);
    head2 = insertNodeAtEnd(11,head2);
    head2 = insertNodeAtEnd(14,head2);
    head2 = insertNodeAtEnd(16,head2);
    head2 = insertNodeAtEnd(61,head2);
    
    
    Node t = mergeSortedLinkedList(head1, head2);
    
    System.out.println("*********************merged list*********************");
    printLinkedList(t);
    
    
    
    
    
    
    
  }

  private static Node mergeSortedLinkedList(Node head1, Node head2) {
              if (head1==null) {
                return head2;
              }
if (head2==null) {
  return head1;
}              

Node res =null;

if (head1.data>head2.data) {
res = head2;
res.next = mergeSortedLinkedList(head1, head2.next);

}
              
else{
    res = head1;
    res.next = mergeSortedLinkedList(head1.next, head2);
     }
    
    
    
    return res;
  }

  private static int findNthElementFromEnd(Node head, int i) {
    Node n1 = head ;
    Node n2 = head ;
    int count = 0;
    while (n2!=null ) {
      count = count+1;
      n2 = n2.next;
      if (count==i) {
        break;
      }
    }
   while (n2!=null) {
     n1 = n1.next;
     n2 = n2.next;
    
  } 
    
    return n1.data;
  }

  public static Node removeNthFromEnd(Node A, int B) {
    Node p = A;
    Node q= A;
    Node prev =A;
    int count = 0;
    while(count != B && p!=null )
    {   count = count+1;
        p = p.next;
        
    }
    if (p==null){
        A = A.next;
        return A;
    }
    
    while(p!=null){
        p = p.next ;
        prev = q;
        q = q.next ;
        
    }
    if(B==1){
        prev.next = null;
    }
    else
    prev.next = q.next;
    
    return A;
    
}
  
  
  
  
  
  private static String findLoopInLinkedList(Node headLoop) {

    Node fast = headLoop;
    Node slow = headLoop;
    while (slow != null && fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow==fast) {
        removeLoop(headLoop,slow);
        return "LOOP";        
      }
    }
    return "NOLOOP";
  }

  private static void removeLoop(Node headLoop, Node slow) {
    Node node1 = headLoop;
    Node node2 = slow;
    
      
      while (node1.next != node2.next) {
node1= node1.next;
node2 = node2.next;
    }
      node2 .next = null;
System.out.println("   ");
      printLinkedList(headLoop);
    
  }

  private static Node rotateLinkedList(Node head, int i) {
    for (int j = 0; j < i; j++) {
      Node temp = head;
      Node prev = null;
      while (temp.next!=null) {
        prev = temp;
        temp = temp.next;      
      }
      System.out.println(temp.data+"::::::::::");
      prev.next = null;
      temp.next = head;
      head = temp;
      
    }
    return head;
  }

  private static Node reverseLinkedList(Node head) {
   /* if (head == null) {
      return head;
    }
    Node prev = null;
    Node temp = head;
    Node nxt = head.next;
    while (nxt!=null) {
    temp.next = prev ;
    prev = temp;
    temp = nxt;
    nxt = nxt.next;
    }
    temp.next = prev;*/
    
    
    Node prev = null;
    Node nxt = null;
    Node temp = head;
    
    while (temp!=null ) {
      nxt = temp.next;
      temp.next = prev;
      prev = temp;
      temp = nxt;
    }
//return temp;
    return prev;
  }

  private static int findMidElement(Node head) {
    int mid  = Integer.MIN_VALUE;
    Node fast = head;
    Node slow = head;
 if (head == null) {
   return mid;
}   
    while (fast!=null && fast.next!=null) {
      fast = fast.next.next;
      slow = slow.next;
    }
     mid = slow.data;
    return mid;
  }

  private static void printLinkedList(Node head) {
    Node temp = head;
    while (temp!=null ) {
      System.out.print(temp.data+"-->");
      temp= temp.next;
      
    }
  }

  private static Node insertNodeAtEnd(int data, Node head) {
    Node temp = new Node(data);
    if (head == null) {
      head = temp ;
    }
    else {
      Node tempNode = head;
      while (tempNode.next !=null)
      {
        tempNode = tempNode.next;
      }
      
      tempNode.next = temp; 
    }    
    return head;
  }
  
  private static Node reverseLinkedListInGroup( Node head, int groupSize) {
   
   
      Node prev=null;
      Node curr=head;
      Node next=null;
      int count=1;
      while(curr!=null && count<=groupSize) {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
          count++;
      }
      if(next!=null)
      head.next=reverseLinkedListInGroup(next,groupSize);
  //  printList(prev);
      return prev;
      
  }
 
  
  
  
  
  public static void deleteNode(Node node) {
    if (node==null || node.next ==null ) {
      System.out.println("input node can not be deleted.");
    }
    node.data  =  node.next.data;
    Node temp = node.next;
    node.next = node.next.next;
    
    
    
    
    
    
  } 
}


 

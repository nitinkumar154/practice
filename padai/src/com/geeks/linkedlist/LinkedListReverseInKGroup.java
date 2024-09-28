package com.geeks.linkedlist;

public class LinkedListReverseInKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next .next.next= new ListNode(4);
        head.next .next.next.next= new ListNode(5);
        LinkedListReverseInKGroup obj = new LinkedListReverseInKGroup();
        ListNode newHead = obj.reverseKGroup(head, 2);
       ListNode temp = newHead;
        while(temp!=null){
            System.out.print(temp.val+"->");
        }




    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || head.next ==null)
            return head;
        ListNode temp = head;
        ListNode prev = null;

        // find kTh node if no node in group of k then return null
        while(temp!=null){
            ListNode kNode = findKthNode(temp, k);
            if(kNode == null){
                // do something
                if(prev!=null)
                    prev.next= temp;
                break;
            }

                ListNode kNextNode = kNode.next;
                kNode.next =null;

                 temp = reverseList(temp);
                if(temp == head){
                    // firstnode of list
                    head = kNode;
                }
                else{


                    prev.next= kNextNode;

                }
                prev = temp;
                temp= kNextNode;




        }
        return head;

    }

    public ListNode findKthNode(ListNode temp , int k){
        k = k-1;
        while(temp!=null && k>0)
        {
            k--;
            temp= temp.next;
        }
        return temp;
    }
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode newNode = reverseList(head.next);
        head.next.next = newNode;
        head.next = null;
        return newNode;
    }
}

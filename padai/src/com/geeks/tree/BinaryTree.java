package com.geeks.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BinaryTree {

  
  public static BNode insertNode(BNode root, int data) {
    if (root==null) {
      root = new BNode(data);
      return root;
    }
   if (data>root.data) {
     root.rc = insertNode(root.rc, data);
    
  }
      if (data<root.data) {
        root.lc = insertNode(root.lc, data);
        
      }
    return root;
  }
  public static void main(String[] args) {
    BNode root = null ;
    root = insertNode(root, 16);
    root = insertNode(root, 8);
    root = insertNode(root, 6);
    root = insertNode(root, 20);
    root = insertNode(root, 18);
    root = insertNode(root, 19);
    root = insertNode(root, 21);
    root = insertNode(root, 9);
    root = insertNode(root, 4);
    System.out.println(root);
    inorder(root);
    System.out.println("*************printing level order traversal ***********************");
    System.out.println("           ");
    printLevelOrderTraversal(root);
    System.out.println("*************printing level order traversal with level seperateds ***********************");
    System.out.println("           ");
    printLevelOrderTraversalNewLine(root);
    System.out.println("  ");
    System.out.println("*****************bottom view of the tree **********************");
    System.out.println(" ");
    printBottomView(root);
    
    
  }
  
  public static void printLevelOrderTraversal(BNode root) {
   Queue<BNode> q = new LinkedList<BNode>();
    if (root!=null) {
      q.add(root);
    }
    while (!q.isEmpty()) {
      BNode node = q.remove(); 
      System.out.print(node.data+" ");
      if (node.lc!=null) {
        q.add(node.lc);        
      }
      if (node.rc!=null) {
        q.add(node.rc);        
      }
    }
  }

  public static void printLevelOrderTraversalNewLine(BNode root) {
    Queue<BNode> q = new LinkedList<BNode>();
     if (root!=null) {
       q.add(root);
       q.add(null);
       
     }
     while (!q.isEmpty()) {
       BNode node = q.remove();
       if (node!=null) {
        
      
       System.out.print(node.data+" ");
       if (node.lc!=null) {
         q.add(node.lc);        
       }
       if (node.rc!=null) {
         q.add(node.rc);        
       }
       }
       else {
         System.out.println("\n");
         if (!q.isEmpty()) {
           q.add(null);
        }
       }
       
     }
   }
  
  
  public static void printBottomView(BNode root) {
    
    if (root==null) {
      return;
    }
    int hd = 0;
    Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
    Queue<BNode> q = new LinkedList<BNode>();
    root.hd= hd ;
    q.add(root);
    while (!q.isEmpty()) {
      
      BNode temp = q.remove();
      
      hd = temp.hd;
      map.put(hd, temp.data);
      if (temp.lc!=null) {
        temp.lc.hd= hd-1;
        q.add(temp.lc);
        
      }
      if (temp.rc!=null) {
        temp.rc.hd = hd+1;
        q.add(temp.rc);
      }
      
    }
    
    
    Set<Entry<Integer, Integer>> set = map.entrySet();
   for (Entry<Integer, Integer> entry : set) {
    System.out.print(entry.getValue()+" ");
  } 
    
   
    
    
    
  }

  
public static void inorder(BNode root) {
  if (root!=null) {
    inorder(root.lc);
    System.out.print(root.data+"  ");
    inorder(root.rc);
    
  }
  
  
}
public static void preOrder(BNode root) {
  if (root!=null) {
    System.out.print(root.data+"  ");
    preOrder(root.lc);
    preOrder(root.rc);
  }
}

public static void postOrder(BNode root) {
  if (root!=null) {
    postOrder(root.lc);
    postOrder(root.rc);
    System.out.print(root.data+"  ");
  }
}
}


class BNode{
  int data ;
   BNode lc ;
   BNode rc ;
   int hd;
   public BNode(int data) {
     this.data= data;
     this.lc= null;
     this.rc = null;
     this.hd = Integer.MAX_VALUE;
   }
  
}  
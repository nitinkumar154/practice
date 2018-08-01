package com.geeks.linkedlist;

public class DualNode {
  int data;
  public DualNode right;
  public Node down; 
  public DualNode(int data) {
    super();
    this.data = data;
    this.right = null ;
    this.down = null;
  }
}

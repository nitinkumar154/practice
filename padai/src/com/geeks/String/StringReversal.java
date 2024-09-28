package com.geeks.String;

import java.util.Scanner;
import java.util.Stack;

public class StringReversal {
  
  public static String stringReversal(String in) {
    
    
    
    
    
    
    
    return "";
  }

  public static void main(String[] args) {
    System.out.println("enter the string to be reversed");
    
    Scanner sc=new Scanner(System.in);
    String in = sc.nextLine();
    
    String[] input = in.split(" ");
    Stack<String> st = new Stack<>();
    for (int i = 0; i < input.length; i++) {
      if (!input[i].equals("")) {
        st.push(input[i].trim());
      }
      
    }
    String out = "";
    while (st.size()>1) {
      out = out +  st.pop()+" ";
      
    }
    out = out+st.pop();

  System.out.println(out);
  }

}

package com.geeks.String;

import java.util.Stack;

public class balancedparantheses {
public static void main(String[] args) {
  
//  String i = "{([])}";
  
  String i = "[()]{}{[()()()}";
   Character openingCurlyBrace = new Character('{');
   Character openingSmallBrace = new Character('(');
   Character openingRectuangularBrace = new Character('[');
  
  
  Stack< Character> st = new Stack<>();
  for (int j = 0; j < i.length(); j++) {
    char temp = i.charAt(j);
    if (temp== openingCurlyBrace || temp== openingRectuangularBrace || temp== openingSmallBrace ) {
      st.push(temp);
    }
    else {
      Character equiOpeningBraces = findOpeningBraces(temp);
      
      if (equiOpeningBraces==st.peek()) {
        st.pop();
        continue;
      }
      else {
        break;
      }
    }
  }
  if (st.size()==0) {
    System.out.println("balanced");
    
  }
  else {System.out.println("NOTBalanced");}
  
  
}

private static Character findOpeningBraces(char temp) {
  Character ret = null;
  if (temp==')') {
    ret ='(';
  }
  else if (temp=='}')
    ret ='{';
  else if(temp==']')
    ret = '[';
  return ret;
}
}

package com.padai.leetcode;

public class StringMul {
    public static void main(String[] args) {
        StringMul ob = new StringMul();
        System.out.println(ob.multiply("123","456"));
    }

    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        if(num1.equals("0")|| num2.equals("0"))
            return "0";
        if(num1.equals("1"))
            return num2;
        if(num2.equals("1"))
            return num1;
        int res [] = new int [l1+l2];

        for(int i = l1-1 ;i>-1 ;i--){

            for(int j = l2-1; j>-1;j--){


                int prod = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                prod = prod+res[i+j+1];// adding last stored carry;
                res[i+j+1]= prod%10;// storing cary value to next index
                res[i+j]= prod/10;// storing unit digit to the i+j index
            }
        }

        StringBuilder sb = new StringBuilder();
        // skip leading zero
        for(int r: res){
            if(sb.length()==0&&r==0){
                continue;
            }
            sb.append(r);
        }
        return sb.toString();

    }
}

package com.padai.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {


    public static void main(String[] args) {
        int [] [] matrix = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int bottom = matrix.length;
        int right = matrix[0].length;

        int top = 0, left = 0;
        while (top < bottom && left < right) {
            for (int i = left; i < right; i++) {    
                li.add(matrix[top][i]);

            }
            top++;
            for (int i = top; i < bottom; i++) {
                li.add(matrix[i][right - 1]);
            }
            right--;

            if(top<bottom) {
                for (int i = right - 1; i >= left; i--) {
                    li.add(matrix[bottom - 1][i]);
                }
                bottom--;
            }

            if(left<right) {
                for (int i = bottom - 1; i >= top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}

package com.padai;

public class RotateImage {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		rotate(matrix);

	}
	
	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ;i <n ; i++){
            for(int j = 0 ;j <n ; j++){
                if(i==j){
                    break;
                }
                int temp = matrix[i][j];;
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0 ;i <n ; i++){
           // int l= i;
           // int r =  matrix.length-1;
            int [] arr = matrix[i];
            int l = 0; 
            int r = arr.length-1;
            while(l<r){
                int temp = arr[l];
                 arr[l]= arr[r];
                arr[r] = temp;
                l++;r--;
            }
        }
    }

}

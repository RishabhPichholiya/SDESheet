package com.sdesheet.arrays;

import java.util.Arrays;

public class RotateImage
{
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }};
        int n=matrix.length;

        // Taking transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){
                int x =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=x;
            }
        }

        // swapping j row to n-j-1 row
        for(int i=0;i<n;i++){
            for(int j=0; j<n/2;j++){
                int x =matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=x;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}

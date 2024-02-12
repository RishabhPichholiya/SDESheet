package com.sdesheet.arrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 0, 12 },
                { 0, 14, 15, 16 }};
/*
        //BRUTE FORCE
        int n= matrix.length;
        int m =matrix[0].length;
        int [] row = new int [n];
        for (int i=0; i<n;i++){
            row[i]=0;
        }
        int [] col = new int [matrix[0].length];
        for (int i=0; i<m;i++){
            col[i]=0;
        }
        for (int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        */

        //OPTIMIZED
        int n= matrix.length;
        int m =matrix[0].length;
        int col0=1;
        for (int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0 && j!=0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
                else if(matrix[i][j]==0 && j==0){
                    matrix[i][0]=0;
                    col0=0;
                }
            }
        }

        for (int j=1; j<m;j++){
            if(matrix[0][j]==0){
                for (int i=0; i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i=0; i<n;i++){
            if(matrix[i][0]==0){
                for (int j=0; j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        if(col0==0){
            for (int i=0; i<n;i++){
                matrix[i][0]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }
}
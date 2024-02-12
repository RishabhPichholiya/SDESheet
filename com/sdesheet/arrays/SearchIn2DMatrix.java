package com.sdesheet.arrays;

import java.util.Scanner;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        /* Brute Force: Use 2 loops and apply linear search. */
        /* Better Approach: Each row is sorted, so check if element lies in any row then apply  binary search on that row. */
        /* Optimized Approach: By taking some parameters to handle this 2d array like 1D array
        and apply binary search.  */
        Scanner sc =new Scanner(System.in);
        int matrix [][] ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = sc.nextInt();
        int m= matrix.length;
        int n=matrix[0].length;
        int l=0;
        int h= m*n-1;
        if (target>matrix[m-1][n-1] || target<matrix[0][0]){
            System.out.println("False");
        }
        else {
            int i, j = 0;
            int flag = 1;
            while (l <= h) {
                int mid = (int) (l + h) / 2;
                i = (int) mid / n;
                j = mid % n;
                if (matrix[i][j] == target) {
                    System.out.println("True");
                    flag = 0;
                    break;
                } else if (matrix[i][j] < target) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
            if (flag == 1) {
                System.out.println("False");
            }
        }

    }
}

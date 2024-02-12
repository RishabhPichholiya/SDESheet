package com.sdesheet.arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int arr [] = {2,0,2,1,1,0};
        int low,mid,high;
        low=0;
        mid=0;
        high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                arr[mid]=arr[low];
                arr[low]=0;
                low+=1;
                mid+=1;
            }
            else if(arr[mid]==1){
                mid+=1;
            }
            else{
                arr[mid]=arr[high];
                arr[high]= 2;
                high-=1;
            }
        }
        System.out.println("The output array is :");
        for (int x: arr){
        System.out.print(x +"\t");
        }
    }
}

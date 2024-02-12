package com.sdesheet.arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        // By changing the original array
        int [] nums = {3,1,3,4,2};
        int i=0;
        while(true){
            if(nums[i]>0){
                nums[i]=-nums[i];
                i=Math.abs(nums[i]);
            }
            else{
                System.out.println(i);
                break;
            }
        }
    // Linked List cycle Detection will also become one good solution
    }
}

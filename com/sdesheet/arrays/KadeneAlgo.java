package com.sdesheet.arrays;
public class KadeneAlgo {
    //Method Static h because we are using this method without creating object
    public static int maxSubArray(int[] nums) {
        //initally largestsum value is nums[0]
        int largestsum=nums[0];
        int x=0;
        //Here is the  main Kadene's Algo Logic
        for(int i=0;i<nums.length;i++){
            if(nums[i]+x>0){
                if(x>0){
                    nums[i]+=x;}

            }
            x=nums[i];
            if(nums[i]>largestsum){
                largestsum=nums[i];
            }
        }
        return largestsum;}

    public static void main(String[] args) {
        int arr [] ={-2,1,-3,4,-1,2,1,-5,4};
        int ans= maxSubArray(arr);
        System.out.println(ans);
    }

}

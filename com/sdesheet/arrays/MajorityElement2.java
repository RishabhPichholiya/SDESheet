package com.sdesheet.arrays;

public class MajorityElement2 {
    public static void main(String[] args) {
        int nums []= {2,2,3,6,5,4};
        int n =nums.length;
        //Initializing count and ans variables
        int count1=0;
        int count2=0;
        int ans1=0;
        int ans2=0;

        //Applying Extended Boyer Moore's Algorithm
        for(int i=0;i<n;i++){
            if(count1==0 && ans2!=nums[i]){
                ans1=nums[i];
                count1++;
            }
            else if(count2==0 && ans1!=nums[i]){
                ans2 =nums[i];
                count2++;
            }
            else if(ans2==nums[i]){
                count2++;
            }
            else if (ans1==nums[i]) {
                count1++;
            }
            else{
                count1-=1;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int x:nums){
            if(x==ans1){
                count1++;
            }
            else if(x==ans2) {
                count2++;
            }
        }
        if(count1==count2){
            System.out.println(ans1 +" "+ ans2);
        }
        else{
            if(count1>count2){
                System.out.println(ans1);
            }
            else{
                System.out.println(ans2);
            }
        }
    }
}

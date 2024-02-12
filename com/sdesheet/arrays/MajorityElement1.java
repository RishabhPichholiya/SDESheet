package com.sdesheet.arrays;

public class MajorityElement1 {
    public static void main(String[] args) {
        int nums [] ={4,4,3};
        int ans=0;
        int count=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        System.out.println(ans);
    }
}

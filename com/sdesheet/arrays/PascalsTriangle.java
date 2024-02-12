package com.sdesheet.arrays;

import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numRows= sc.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> temp2 = new ArrayList<Integer>();
            triangle.add(temp);
            if(temp.size()==1){
                temp2.add(temp.get(0));
                temp2.add(temp.get(0));
                temp =temp2;
            }
            else{
                temp2.add(temp.get(0));
                for(int j=0;j<temp.size();j++){
                    if(j+1<temp.size()){
                        temp2.add(temp.get(j)+temp.get(j+1));
                    }
                    else{
                        temp2.add(temp.get(j));
                    }
                }
                temp=temp2;
            }
        }
        System.out.println(triangle);
    }
}

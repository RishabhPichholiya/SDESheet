package com.sdesheet.stackqueue;
/**
 * @author Rishabh
 * @version JDK1.8
 */
class Stack{
    int top=-1;
    int size=1000;
    int arr [] =new int [size];

    public void push(int num){
        top+=1;
        arr[top]=num;
    }
    public int pop(){
        int x =arr[top];
        top-=1;
        return x;
    }
    public int size(){
        return top+1;
    }
    public int top(){
        return arr[top];
    }
}
public class ImplementStackUsingArray {
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack size :" + stack.size());
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("The element we had pop from the stack is " + stack.pop());
        System.out.println("Stack size" + stack.size());
        System.out.println("The top element in the stack :" + stack.top());
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)

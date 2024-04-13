package com.sdesheet.stackqueue;

/**
 * @author RISHABH
 * @version JDK1.8
 */

class Queue{
    int top= -1;
    int size=1000;
    int arr [] =new int [size];
    int temp= -1;
    public void push(int num){
        top+=1;
        arr[top]=num;
    }
    public int pop(){
        temp+=1;
        int x =arr[temp];
        return x;
    }
    public int size(){
        return top-temp;
    }
    public int top(){
        return arr[temp+1];
    }
}
public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
    }
}

package com.sdesheet.arrays;
import java.util.*;
public class BinaryExponentiationPowerFunction {
    public static void main(String[] args) {
        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        //Initalizing answer as 1
        int ans = 1;
        int x=n;

        //Applying Binary Exponentiation: It is based on th logic of Binary Representation of a number 
        while (x > 0) {
            if (x % 2 == 0) {
                a = a * a;
                if (x % 2 == 0) {
                    x = (int) (x / 2);
                } else {
                    x = ((int)(x / 2)) + 1;

                }
            } else {
                ans = ans * a;
                x -= 1;
            }
        }
        System.out.println("a raise to the power n:" + ans);
    }
}
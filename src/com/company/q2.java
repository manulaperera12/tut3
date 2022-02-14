package com.company;


public class q2 {
    static void numbers(int a,int b) {
        if (a < b) {
            int count = a;
            while (count < b) {
                System.out.println(count);
                count++;
            }
        }else{
            System.out.println("second number is not greater than the first number...");
        }
    }
    public static void main(String[] args) {
        numbers(1,5);
    }
}

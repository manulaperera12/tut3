package com.company;

public class q4 {
    static int n1 = 0, n2 = 1, n3 = 0;  //set the values as variables
    static void fibonacci(int n){
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
            fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print(n2); //print 1
        fibonacci(n - 2); //two numbers are already printed
    }
}

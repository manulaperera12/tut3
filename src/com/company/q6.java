package com.company;
import java.util.*;
import java.io.*;


public class q6 {

    public static void main(String[] args){
        int number;
        int power;
        int total;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number : ");
        number = input.nextInt();

        System.out.println("Enter power : ");
        power = input.nextInt();

        total = 1;
        while (power != 0){
            total *= number;
            --power;
        }
        System.out.println(" the answer is : " + total);
    }
}

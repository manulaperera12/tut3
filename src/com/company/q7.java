package com.company;
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        int number, count, factorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();

        for (count = 1; count <= number; count++){
            factorial = factorial * count;
        }
        System.out.println("the factorial is : " + factorial);
    }

}

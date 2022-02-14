package com.company;
import java.util.Scanner; //import scanner

public class q3 {
    static void qu3(){
        Scanner userInput1 = new Scanner(System.in);    //getting input from user for number
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(userInput1.nextLine());

        Scanner userInput2 = new Scanner(System.in);    //getting input from user for letter
        System.out.println("Enter a letter: ");
        String letter = userInput2.nextLine();

        int num = 1;    //variable for count
        while (num <= number){
            System.out.print(letter);
            num++;
        }

    }

    public static void main(String[] args) {
        qu3();  //calling for function
    }
}

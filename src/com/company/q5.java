package com.company;


public class q5 {
    //pattern 1
    static void starPattern1(int a){
        int pat_1_rows = a;
        for (int i = 1; i <= pat_1_rows; ++i){
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //pattern 2
    static void starPattern2(int b){
        int pat_2_rows = b;
        for (int x = pat_2_rows; x >= 1; --x){
            for (int space = 1; space <= pat_2_rows - x; ++space){
                System.out.print(" ");
            }
            for (int y = x; y <= 2 * x - 1; ++y){
                System.out.print("*");
            }
            for (int y = 0; y < x - 1; ++y){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        starPattern1(6);
        System.out.println();
        System.out.println();
        starPattern2(7);
    }
}




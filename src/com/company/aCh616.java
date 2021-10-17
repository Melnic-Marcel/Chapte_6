package com.company;

import java.util.Scanner;

class aCh616 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Enter a pair of integers: ");
            int x = scan.nextInt(); {
                int y = scan.nextInt();

                System.out.printf("%d is a multiple of %d = %s\n", x, y,
                        (isMultiple(x, y)) ? "true" : "false");
            }
            break;
        }
    }
    public static boolean isMultiple(int x, int y){
        return (y % x == 0);
    }
}
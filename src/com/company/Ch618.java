package com.company;

import java.util.Scanner;

public class Ch618 {
    Scanner input = new Scanner(System.in);
    void squareOfAsterisks() {
        int size;
        System.out.print("Enter the size:");
        size = input.nextInt();
        for ( int m = 0; m < size; ++m ) {
            for ( int n = 0; n < size; ++n )
            { System.out.print( "*" ); }
            System.out.println( );
        }
    }
}
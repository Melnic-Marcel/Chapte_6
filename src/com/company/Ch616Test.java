package com.company;

import java.util.Scanner;

public class Ch616Test
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Ch616 test = new Ch616();

        int x;
        int y;
        int num;

        System.out.print( "Enter number of pairs: " );
        num = input.nextInt();
        System.out.println();

        for ( int z = 1; z <= num; z++ )
        {
            System.out.print( "Enter first integer: " );
            x = input.nextInt();
            System.out.print( "Enter second integer: " );
            y = input.nextInt();

            if ( test.isMultiple( x, y ) == true )
                System.out.printf( "true" );
            else
                System.out.printf( "false" );
        }
    }
}
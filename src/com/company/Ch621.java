package com.company;

import java.util.Scanner;

public class Ch621
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print( "Enter a five digit number:" );
        num = input.nextInt();
        AP(num);
    }
    public static void AP( int e )
    {
        Scanner input = new Scanner(System.in);

        int number =input.nextInt();

        if ( number >= 1 &&number <= 99999 )
        {
            System.out.print("" );
            displayDigits(number );
        }
        else
        {
            System.out.print("Invalid input" );
            System.out.print("" );
        }
    }

    public static int quotient( int a, int b )
    {
        return a / b;
    }
    public static int remainder( int a, int b )
    {
        return a % b;
    }
    public static void displayDigits( int number )
    {
        int divisor = 10000, digit, x = 5, y= 80;
        String s = "";

        while ( divisor >= 1 )
        {
            digit = quotient(number, divisor );
            s += digit +" ";
            number =remainder( number, divisor );
            divisor =quotient( divisor, 10 );
        }

        System.out.print( s );
    }
}
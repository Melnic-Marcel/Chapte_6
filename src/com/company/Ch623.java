package com.company;

import java.util.Scanner;

import static com.company.Ch623Test.min;

public class Ch623 {

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");

        float nr1 = sc.nextFloat();

        System.out.print("Input the Second number: ");

        float nr2 = sc.nextFloat();

        System.out.print("Input the third number: ");

        float nr3 = sc.nextFloat();

        System.out.print("The minimum value is " + min(nr1, nr2, nr3)+"\n" );

    }

}
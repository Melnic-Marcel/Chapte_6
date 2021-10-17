package com.company;
import java.util.Scanner;

public class Ch617 {

    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = nr.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
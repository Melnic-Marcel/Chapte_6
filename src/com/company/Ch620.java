package com.company;

import java.util.Scanner;

import static com.company.Ch620Test.circleArea;

public class Ch620 {
    public static void main(String[] args) {
        double a;
        double c;
        System.out.println("Enter the radius: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();

        c = circleArea(a);
        System.out.println("Circle Area is: " + c);
    }
}
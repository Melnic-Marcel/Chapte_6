package com.company;

import java.util.Scanner;

public class Ch622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1)Fahrenheit to Celsius  2)Celsius to Fahrenheit: ");
        int option = input.nextInt();
        if(option == 1){
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            System.out.println("The equivalent Celsius is: " + Celsius(fahrenheit));
        }
        else if(option == 2){
            System.out.print("Enter the temperature in Celsius: ");
            double celcius = input.nextDouble();
            System.out.println("The equivalent Fahrenheit is: " + Fahrenheit(celcius));
        }
        else{
            System.out.println("Invalid option.");
        }
    }
    public static double Celsius(double fahrenheit) {
        return 5.0/ 9.0 * (fahrenheit - 32);
    }
    public static double Fahrenheit(double celcius) {
        return 9.0 / 5.0 * (celcius + 32);
    }
}
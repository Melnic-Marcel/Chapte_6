package com.company;
import java.util.Scanner;

public class Ch626 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = input.nextInt();
        int r1 = reverse(x);
        System.out.println("Reversed : " + r1);
    }

    public static int reverse(int y) {
        int r1 = 0;
        int r2;
        while (y > 0) {
            r2 = y % 10;
            y = y / 10;
            r1= r1 * 10 + r2;
        }
        return r1;
    }
}
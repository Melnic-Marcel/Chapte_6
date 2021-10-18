package com.company;

import java.util.Scanner;

public class Ch630 {

    public static void main(String[] args) {

        int secnr;
        secnr = (int) (Math.random() * 999 + 1);
        Scanner keyboard = new Scanner(System.in);
        int z;
        do {
            System.out.print("Enter a number up to 1000: ");
            z = keyboard.nextInt();
            if (z == secnr)
                System.out.println("Your guess is correct!!");
            else if (z < secnr)
                System.out
                        .println("Your guess is smaller. Have another try : ");
            else if (z > secnr)
                System.out
                        .println("Your guess is greater. Have another try : ");
        }
        while (z != secnr);
    }

}

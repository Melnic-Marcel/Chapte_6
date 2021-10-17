package com.company;

import java.util.Scanner;

public class Ch619 {
    Scanner input = new Scanner(System.in);

    void Fill() {
        int size;
        char fillCharacter;

        System.out.print("Enter the size:");
        size = input.nextInt();

        System.out.print("Enter the character:");
        char fill = input.next().charAt(0);


        for (int m = 0; m < size; ++m) {
            for (int n = 0; n < size; ++n) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
}


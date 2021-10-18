package com.company;

import java.util.Scanner;

public class Ch629 {
    public static boolean flip() {
        String[] ch = {"1","2"};
        int z = ch.length;
        int random = (int) (Math.random()*z);
        boolean res = false;
        String nr = ch[random];
        if(nr == "1") {
            res = true;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int input = 0;
        {
            System.out.println("Enter the number of times to toss :");
            Scanner scanner = new Scanner(System.in);
            input=scanner.nextInt();
            System.out.println();

            int heads = 0;
            int tails = 0;
            for (int i=0; i< input; i++) {
                if(flip())
                    heads++;
                else
                    tails++;
            }
            if(input > 0)
                System.out.println(heads + " Heads " + tails + " Tails ");
            System.out.println();
        }
        return;
    }
}
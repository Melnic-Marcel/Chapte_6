package com.company;

import static com.company.Ch615Test.hyp;

public class Ch615{
    public static void main(String[] args){

        System.out.println("Triangle 1");
        System.out.printf("side_1: %.2f  side_2: %.2f  hypotenuse: %.2f\n", 3.0, 4.0, hyp(3.0, 4.0));


        System.out.println("Triangle 2");
        System.out.printf("side_1: %.2f  side_2: %.2f  hypotenuse: %.2f\n", 5.0, 12.0, hyp(5.0, 12.0));


        System.out.println("Triangle 3");
        System.out.printf("side_1: %.2f  side_2: %.2f  hypotenuse: %.2f\n", 8.0, 15.0, hyp(8.0, 15.0));
    }

}
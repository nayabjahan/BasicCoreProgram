package com.brz.corejava;

import java.util.Scanner;

public class CoreAndFunctional {
    public static void coinFlip() {
        int heads = 0, tails = 0;
        Scanner toss = new Scanner(System.in);
        System.out.print("enter no. of times you want to flip the coin: ");
        int flip = toss.nextInt();
        for (int i = 0; i < flip; i++) {
            double random = Math.random();
            if (random < 0.5)
                tails++;
            else
                heads++;
        }
        float headsP = (heads / (float) flip * 100);
        float tailsP = tails / (float) flip * 100;
        System.out.println("Percentage of heads: " + headsP + "%");
        System.out.println("Percentage of tails: " + tailsP + "%");
        System.out.println("count of Heads = " + heads);
        System.out.println("count of Tails = " + tails);

    }
    public static void  evenOrOdd(){
        int number;
        System.out.println("Enter the Number : ");
        Scanner value = new Scanner(System.in);
        number = value.nextInt();
        if (number % 2 == 0) {
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
        }
    }
}


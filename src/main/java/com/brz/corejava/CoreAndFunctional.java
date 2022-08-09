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

    public static void evenOrOdd() {
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

    public static void powersOfTwo(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;                                          // count from 0 to N
        int powerOfTwo = 1;                                 // the ith power of two
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);      // print out the power of two

            powerOfTwo = 2 * powerOfTwo;                    // double to get the next one
            i = i + 1;

        }
    }

    public static void leapYear() {
        int year;
        System.out.println("Enter an Year : ");
        Scanner yr = new Scanner(System.in);
        year = yr.nextInt();
        if (year % 4 == 0) {
            System.out.println("Specified year is a leap year");
        } else
            System.out.println("Specified year is not a leap year");
    }

    public static void largestNumber() {
        double X, Y, Z;

        Scanner Check = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        X = Check.nextDouble();

        System.out.println("Enter the value for Y: ");
        Y = Check.nextDouble();

        System.out.println("Enter the value for Z: ");
        Z = Check.nextDouble();

        if (X >= Y) {
            if (X >= Z)
                System.out.println("X = " + X + " is the largest number.");
            else
                System.out.println("Z = " + Z + " is the largest number.");
        } else {
            if (Y >= Z)
                System.out.println("Y = " + Y + " is the largest number.");
            else
                System.out.println("Z = " + Z + " is the largest number.");
        }
    }

    public static void primeFactors() {
        int number;
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = prime.nextInt();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
    public static void quotientAndReminder(){
        int dividend;
        int divisor;

        System.out.println("Enter the Dividend :");

        Scanner year = new Scanner(System.in);
        dividend = year.nextInt();

        System.out.println("Enter the Divisor :");
        divisor = year.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
    public static void swapNumber(){
        int x, y;
        System.out.println("Enter the value for x : ");
        Scanner value = new Scanner(System.in);
        x = value.nextInt();

        System.out.println("Enter the value for y : ");
        y = value.nextInt();

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = (x+y);
        y = (x-y);
        x = (x-y);

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void vowel_And_Consonant(){
        char character;
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        character = ch.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            System.out.println(character + " is vowel");
        else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
            System.out.println(character + " is vowel");
        else
            System.out.println(character + " is consonant");

    }
}





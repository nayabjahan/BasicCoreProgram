package com.brz.corejava;

import java.util.Scanner;

import static com.brz.corejava.CoreAndFunctional.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to basic core java programming");
        System.out.println("Please Enter Your Choice ");
        System.out.println("1.CoinFlip Programme \n 2.Even Or Odd Programme \n 3.powers of two \n 4.Leap year" +
                "\n 5. largest number");

        Scanner scanner = new Scanner(System.in);
        int option =scanner.nextInt();

        switch (option) {
            case 1:
                coinFlip();
                break;
            case 2:
                evenOrOdd();
                break;
            case 3:
                powersOfTwo(args);
                break;
            case 4:
                leapYear();
                break;
            case  5:
                largestNumber();
                break;
        }
    }
}

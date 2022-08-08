package com.brz.corejava;

import java.util.Scanner;
import static com.brz.corejava.CoreAndFunctional.coinFlip;
import static com.brz.corejava.CoreAndFunctional.evenOrOdd;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to basic core java programming");
        System.out.println("Please Enter Your Choice ");
        System.out.println("1.CoinFlip Programme \n 2.Even Or Odd Programme");

        Scanner scanner = new Scanner(System.in);
        int option =scanner.nextInt();
        switch (option) {
            case 1:
                coinFlip();
                break;
            case 2:
                evenOrOdd();
                break;
        }
    }
}

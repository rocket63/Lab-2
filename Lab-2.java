package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scan1.nextLine();
        System.out.println("Enter a number between 1 and 100: ");
        int userNum = scan1.nextInt();



        if (userNum % 2 == 1) {
            System.out.println(userName + ", the number " + userNum + " is Odd.");
        } else {


            if ((userNum >= 2) && (userNum < 25)) {
                System.out.println(userName + ", the number " + userNum + " is Even and less than 25.");
            } else if ((userNum >= 26) && (userNum <= 60)) {

                System.out.println(userName + ", the number is Even.");
            } else {
                System.out.println(userName + ", the number " + userNum + " is Even.");
            }

        }
    }
}



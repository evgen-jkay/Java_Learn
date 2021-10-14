package com.example;

import java.util.Scanner;


public class ReverseNumberLoop {
    public static void main(String[] args) {
        int num = 0, tempNum;
        int reverseNum = 0;
        System.out.println("Enter your number and press enter: ");

        // The statement will capture the user input after enter clicked
        Scanner in = new Scanner(System.in);

        // Entered input would be stored in number num
        tempNum = num = in.nextInt();
        // While Loop: find out the reverse number
        for (; num != 0;) {
            reverseNum *= 10;
            reverseNum += num % 10;
            num /= 10;
        }

        System.out.println("Reverse of input number " + tempNum + " is: " + reverseNum);
    }
}

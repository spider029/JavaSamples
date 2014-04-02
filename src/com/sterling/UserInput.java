/*
Program to accept input from Keyboard and display the value from 0 to given number

example:

Enter value from Keyboard ..
4
count : 0
count : 1
count : 2
count : 3

*/
package com.sterling;

import java.util.Scanner;

/**
 *
 * @author spider
 */
public class UserInput {

    public static void main(String args[]) {
        System.out.println("Enter value from Keyboard ..");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int count = 0; count < number; count++) {
            System.out.println("count : " + count);
        }
    }
}

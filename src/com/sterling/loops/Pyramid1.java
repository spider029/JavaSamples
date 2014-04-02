/* Program to request User to enter the Limit and 
 *Display the following format based on the Limit,
 
Example:- 
Enter the Limit.. 5
                                         1
                                        1 1
                                       1 1 1
                                      1 1 1 1
                                     1 1 1 1 1
                                    1 1 1 1 1 1
 
 */
package com.sterling.loops;

import java.util.Scanner;

/**
 *
 * @author spider
 */
public class Pyramid1 {

    public static void main(String args[]) {
        System.out.print("Enter the Limit.. ");

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int screenSize = 40;

        for (int row = 0; row <= limit; row++) {
            for (int count = 1; count <= screenSize; count++) {
                System.out.print(" ");
            }
            screenSize--;
            for (int col = 0; col <= row; col++) {
                System.out.print(" " + 1);
            }
            System.out.println();
        }

    }
}

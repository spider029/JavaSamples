/* Program to request User to enter the Limit and 
 *Display the following format based on the Limit,
 
Example: - 
Enter the Limit.. 4

    0
    11
    222
    3333
    44444
 
*/

package com.sterling.loops;

import java.util.Scanner;

/**
 *
 * @author spider
 */
public class Pyramid {
    
    public static void main (String args[]) {
        System.out.print("Enter the Limit.. ");
        
        Scanner sc = new Scanner(System.in);
        int limit  = sc.nextInt();
        
        for ( int row = 0 ; row <= limit ; row ++) {
            
            for( int col = 0; col <= row ; col ++ ) {
            System.out.print(row);
            }
            System.out.println();
        }
       
    }
}

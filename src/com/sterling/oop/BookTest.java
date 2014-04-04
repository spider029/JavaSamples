/*
 *Testing book Application
 */

package com.sterling.oop;

/**
 *
 * @author tprasad
 */
public class BookTest {
    
public static void main(String args[]) {
    Book book = new Book("test");
    System.out.print("Book Name Is :" +book.getBookName());
    
}
}

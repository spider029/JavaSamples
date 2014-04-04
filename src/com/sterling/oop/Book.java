/*
This is Book class with contructor.

 */

package com.sterling.oop;

/**
 *
 * @author tprasad
 */
public class Book {
    
    private String bookName;
    
    Book(String bookName){
     this.bookName = bookName;
        
    }
    public String getBookName(){
        return bookName;
    }
    
}

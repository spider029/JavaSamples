/*
 *
some samples on printf. 

System.out.printf( “format-string” [, arg1, arg2, … ] ); 

% [flags] [width] [.precision] conversion-character ( square brackets denote optional parameters ) 
 
Flags: 
- : left-justify ( default is to right-justify ) 
+ : output a plus ( + ) or minus ( - ) sign for a numerical value 
0 : forces numerical values to be zero-padded ( default is blank padding ) 
, : comma grouping separator (for numbers > 1000) 
 : space will display a minus sign if the number is negative or a space if it is positive 
 
Width: 
Specifies the field width for outputting the argument and represents the minimum number of characters to 
be written to the output. Include space for expected commas and a decimal point in the determination of 
the width for numerical values. 
 
Precision: 
Used to restrict the output depending on the conversion. It specifies the number of digits of precision when 
outputting floating-point values or the length of a substring to extract from a String. Numbers are rounded 
to the specified precision. 
 
Conversion-Characters: 
d : decimal integer [byte, short, int, long] 
f : floating-point number [float, double] 
c : character Capital C will uppercase the letter 
s : String Capital S will uppercase all the letters in the string 
h : hashcode A hashcode is like an address. This is useful for printing a reference 
n : newline Platform specific newline character- use %n instead of \n for greater compatibility 
 
 */

package com.sterling;

/**
 *
 * @author spider
 */
public class Printf {
    public static void main (String args[]) {
    
        String s = "Hello World"; 
        char character ='a';
        int value = 29;
        float f = 10.29f;
        
        System.out.printf("\n %.4f", f );
        System.out.printf("%d", value);
        System.out.printf("\n%03d", value);
        System.out.printf("\n%04d", value);
        System.out.printf("\n The String object \" %s \" is at hash code : %h", s, s);   
        System.out.printf("\n The value of Character is : %c",character);
    }
}

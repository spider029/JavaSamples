/*
 * Testing with input dialog box.
 */

package com.sterling.swingDemo;

import javax.swing.JOptionPane;

/**
 *
 * @author tprasad
 */
public class SwingInput {
    public static void main (String args[]){
        String myName  = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "WelCome MR."+ myName);
    }
}

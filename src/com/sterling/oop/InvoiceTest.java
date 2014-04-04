/*
 * with referecne to Invoice input all partNumber,discription, quantity ,cost 
details and get the InvoiceAccount.  Make use fo Invoice.java.
 */

package com.sterling.oop;

import javax.swing.JOptionPane;

/**
 *
 * @author tprasad
 */
public class InvoiceTest {
    public static void main (String args[]) {
        int partNumber  = Integer.parseInt(JOptionPane.showInputDialog("Enter partnumber"));
        String discription = JOptionPane.showInputDialog("Enter discriptionr");
        int quantity  = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity "));
        int cost  = Integer.parseInt(JOptionPane.showInputDialog("Enter Cost"));
        
        Invoice invoice = new Invoice(partNumber,discription, quantity , cost);
        JOptionPane.showMessageDialog(null, invoice.getInvoiceAmount());
        
        System.out.println("Total cost of the Invoice is :" + invoice.getInvoiceAmount());
        
    }
}

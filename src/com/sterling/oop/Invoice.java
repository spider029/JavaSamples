/*
 * Create a class with partnumber, partDiscription quantity, pricePerItem 
 */

package com.sterling.oop;

/**
 *
 * @author tprasad
 */
public class Invoice {
    
    private int partnumber;
    private String partDiscription ;
    private int quantity;
    private double pricePerItem;

    public int getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(int partnumber) {
        this.partnumber = partnumber;
    }

    public String getPartDiscription() {
        return partDiscription;
    }

    public void setPartDiscription(String partDiscription) {
        this.partDiscription = partDiscription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    Invoice(int partnumber,String partDiscription, int quantity,double pricePerItem ){
        this.partnumber =  partnumber;
        this.partDiscription =  partDiscription;
        this.quantity = quantity;
        this.pricePerItem =  pricePerItem;
    }
    
    public double getInvoiceAmount(){
         double totalprice  = 0.0;
         if( quantity != 0)
         {
             totalprice = quantity * pricePerItem;
         }
        return totalprice;
    }
}

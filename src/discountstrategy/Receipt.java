/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.util.Date;

/**
 *
 * @author mschoenauer1
 */
public class Receipt {
    private LineItem[] items;
    private Customer customer;
    private Date date;

    public Receipt() {
    }

    public Receipt(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
        items = new LineItem[0];
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public void addItem(LineItem item) {
        //Increase array by 1 and add the LineItem to the array
        //LineItem[] items = new LineItem[0];
        
//        System.out.println("Adding item: " + item.getProduct().getDescription() + " quantity of " + item.getQuantity());

        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = item;
        items = temp;  
    }
    
    public void printReceipt() {
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        System.out.println("Description\tPrice\tQuantity\tDiscount\t\tSubtotal");
        
        double grandTotal = 0.0;
        for (LineItem li : items) {
            System.out.println(li.getProduct().getDescription() + "\t\t$" + li.getProduct().getPrice()
                                + " \t" + li.getQuantity() + "\t\t$" + li.getProduct().getDiscount(li.getQuantity())
                                + "\t\t\t$" + li.getSubTotal());
            grandTotal += li.getSubTotal();
        }
        System.out.println("");
        System.out.println("\t\t\t\t\tGrand Total: \t\t$" + grandTotal);
    }
    
}

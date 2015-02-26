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
public class CashRegister {
    private Receipt receipt;
    private FakeDatabase db;

    public CashRegister() {
        db = new FakeDatabase();
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    public void beginSale(int customerID) {
        Customer newCustomer = new Customer();
        Date date = new Date();
        
        //Lookup Customer from database
        
        receipt = new Receipt(newCustomer, date);
    }
    
    public void addItemToSaleBySKU(int sku, int quantity) {
        //Lookup item from a database
        
        //Add item to receipt
    }
    
    public void endSale() {
        //generate receipt
    }
}

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
    
    public void beginSale(int customerID) {
        Date date = new Date();
        
        //Lookup Customer from database
        Customer c = db.findCustomerByIndex(customerID);
        
        receipt = new Receipt(c, date);
    }
    
    public void addItemToSaleBySKU(int sku, int quantity) {
        //Lookup item from a database
        LineItem li = new LineItem(db.findProductbySKU(sku),quantity);
        
        //Add item to receipt
        receipt.addItem(li);
    }
    
    public void endSale() {
        //generate receipt
        receipt.printReceipt();
    }
}

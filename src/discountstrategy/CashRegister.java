/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mschoenauer1
 */
public class CashRegister {
    private Receipt receipt;

    public CashRegister() {
    }

    public CashRegister(Receipt receipt) {
        this.receipt = receipt;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    public void beginSale() {
        receipt = new Receipt();
    }
    
    public void addItemToSaleBySKU(String sku, int quantity) {
        //Lookup item from a database
        
        //Add item to receipt
    }
    
    public void endSale() {
        //generate receipt
    }
}

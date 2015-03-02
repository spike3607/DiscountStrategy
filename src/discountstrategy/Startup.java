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
public class Startup {
    
    public static void main(String[] args) {
            
        CashRegister cr = new CashRegister();
        
        cr.beginSale(0);
        cr.addItemToSaleBySKU(1111111, 3);
        cr.addItemToSaleBySKU(2222222, 2);
        cr.addItemToSaleBySKU(3333333, 5);
        cr.endSale();
        
        cr.beginSale(2);
        cr.addItemToSaleBySKU(4444444, 5);
        cr.addItemToSaleBySKU(2222222, 10);
        cr.addItemToSaleBySKU(1111111, 6);
        cr.endSale();
    
    }
}

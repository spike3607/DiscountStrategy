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
        
        cr.beginSale(3);
        cr.addItemToSaleBySKU(1234567, 3);
    
    }
}

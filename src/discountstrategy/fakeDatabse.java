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
public class fakeDatabse {
    private final String[] namesData = new String[] {"Mike", "Dave", "Steve"};
    
    private final String[] itemsData = new String[] {
        "Hat", "Shirt", "Pants", "Dress", "Socks"
    };
    
    public String findCustomerByIndex(int index) {
        return namesData[index];
    }
}

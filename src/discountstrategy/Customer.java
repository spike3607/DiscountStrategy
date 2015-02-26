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
public class Customer {
    private String name;

    public Customer() {
        this.name = "Blank";
    }

    public Customer(String firstName) {
        this.name = firstName;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }
    
    
    
    
    
}

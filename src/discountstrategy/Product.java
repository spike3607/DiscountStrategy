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
public class Product {
    private int sku;
    private double price;
    private String description;
    
    private DiscountInterfaceStrategy discount;

    public Product() {
    }
    
    public Product(int sku, double price, String description, DiscountInterfaceStrategy discount) {
        this.sku = sku;
        this.price = price;
        this.description = description;
        this.discount = discount;
    }
}

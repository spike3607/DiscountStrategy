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
        sku = 0000000;
        price = -1;
        description = "blank";
        discount = new DiscountByFlatRate(0.0);
    }
    
    public Product(int sku, double price, String description, DiscountInterfaceStrategy discount) {
        this.sku = sku;
        this.price = price;
        this.description = description;
        this.discount = discount;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getDiscount(int quantity) {
        return discount.getDiscountAmount(price, quantity);
    }
    
    
}

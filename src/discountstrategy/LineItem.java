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
public class LineItem {
    private int itemSKU;
    private int quantity;
    
    private DiscountStrategy discount;

    public LineItem() {
    }

    public LineItem(int itemSKU, int quantity, DiscountStrategy discount) {
        this.itemSKU = itemSKU;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getItemSKU() {
        return itemSKU;
    }

    public void setItemSKU(int itemSKU) {
        this.itemSKU = itemSKU;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
}

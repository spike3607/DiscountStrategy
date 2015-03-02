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
    private Product product;
    private int quantity;

    public LineItem() {
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getSubTotal() {
        return product.getPrice() * quantity - getDiscount();
    }
    
    public double getDiscount() {
        return product.getDiscount(quantity);
    }
    
//    public static void main(String[] args) {
//        LineItem li = new LineItem (new Product(3333333, 60.00, "Pants", new DiscountByFlatRate(10.00)), 5);
//        System.out.println(li.getSubTotal());
//        System.out.println(li.getDiscount());
//        System.out.println(li.getSubTotal() - li.getDiscount());
//    }
}
